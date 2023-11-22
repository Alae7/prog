package com.example.demo.Service;

import java.util.List;

import com.example.demo.DTO.EtudiantReponseDTO;
import com.example.demo.DTO.EtudiantRequistDTO;

public interface EtudiantsServInter {
	
//	##########     POST    ##########
	
	public void ADD(EtudiantRequistDTO RequistDTO);
	
//	##########     GET    ##########
	
	public EtudiantReponseDTO ONEetudiants(Integer ID);
	
//	##########     GET ALL    ##########
	
 	public List<EtudiantReponseDTO> Alletudiants();
	
// 	##########     PUT    ##########
 	
 	public void update(EtudiantRequistDTO RequistDTO,Integer ID);
 	
// 	##########     DELETE    ##########
 	public void delete(Integer ID);

}
