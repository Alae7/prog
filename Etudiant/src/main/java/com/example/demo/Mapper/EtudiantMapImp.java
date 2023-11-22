package com.example.demo.Mapper;

import org.springframework.stereotype.Component;

import com.example.demo.DTO.EtudiantReponseDTO;
import com.example.demo.DTO.EtudiantRequistDTO;
import com.example.demo.Entites.EtudiantClass;

@Component
public class EtudiantMapImp implements EtudiantMapInter{

	@Override
	public EtudiantClass FromRequist2Etudiant(EtudiantRequistDTO RequistDTO) {
		EtudiantClass ET = new EtudiantClass();
		ET.setNome(RequistDTO.getNome());
		ET.setPrenome(RequistDTO.getPrenome());
		ET.setMaster(RequistDTO.getMaster());
		return ET;
	}

	@Override
	public EtudiantReponseDTO FromEtudiant2Reponse(EtudiantClass Etudiant) {
		EtudiantReponseDTO ETR = new EtudiantReponseDTO();
		ETR.setNome(Etudiant.getNome());
		ETR.setPrenome(Etudiant.getPrenome());
		ETR.setMaster(Etudiant.getMaster());
		return ETR;
	}

}
