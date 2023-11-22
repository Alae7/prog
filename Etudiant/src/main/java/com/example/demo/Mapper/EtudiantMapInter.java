package com.example.demo.Mapper;

import com.example.demo.DTO.EtudiantReponseDTO;
import com.example.demo.DTO.EtudiantRequistDTO;
import com.example.demo.Entites.EtudiantClass;

public interface EtudiantMapInter {
	public EtudiantClass FromRequist2Etudiant(EtudiantRequistDTO RequistDTO);
	public EtudiantReponseDTO FromEtudiant2Reponse(EtudiantClass Etudiant);
}
