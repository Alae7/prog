package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.EtudiantReponseDTO;
import com.example.demo.DTO.EtudiantRequistDTO;
import com.example.demo.Entites.EtudiantClass;
import com.example.demo.Mapper.EtudiantMapImp;
import com.example.demo.Repository.EtudiantRep;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class EtudiantsServImp implements EtudiantsServInter{
	
	@Autowired
	EtudiantRep ERP;
	
	@Autowired
	EtudiantMapImp EMP;
	
	@Override
	public void ADD(EtudiantRequistDTO RequistDTO) {
		EtudiantClass e = new EtudiantClass();
		e = EMP.FromRequist2Etudiant(RequistDTO);
		ERP.save(e);
	}

	@Override
	public EtudiantReponseDTO ONEetudiants(Integer ID) {
		EtudiantClass e = ERP.findById(ID).get();
		EtudiantReponseDTO ERTDO = new EtudiantReponseDTO();
		ERTDO = EMP.FromEtudiant2Reponse(e);
		return ERTDO;
	}

	@Override
	public List<EtudiantReponseDTO> Alletudiants() {
		List<EtudiantClass> L = new ArrayList<EtudiantClass>();
		L = ERP.findAll();
		List<EtudiantReponseDTO> LL = new ArrayList<EtudiantReponseDTO>();
		for(EtudiantClass e:L) {
			EtudiantReponseDTO RD = new EtudiantReponseDTO();
			RD = EMP.FromEtudiant2Reponse(e);
			LL.add(RD);
		}
		return LL;
	}

	@Override
	public void update(EtudiantRequistDTO RequistDTO, Integer ID) {
		EtudiantClass e = ERP.findById(ID).get();
		if(RequistDTO.getNome()!= null) {
			e.setNome(RequistDTO.getNome());
		}
		if(RequistDTO.getPrenome()!= null) {
			e.setPrenome(RequistDTO.getPrenome());
		}
		if(RequistDTO.getMaster()!= null) {
			e.setMaster(RequistDTO.getMaster());
		}
	}

	@Override
	public void delete(Integer ID) {
		ERP.deleteById(ID);
		
	}

}
