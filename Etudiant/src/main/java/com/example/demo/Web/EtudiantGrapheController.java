package com.example.demo.Web;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.Entites.EtudiantClass;
import com.example.demo.Repository.EtudiantRep;


@Controller
public class EtudiantGrapheController {
	@Autowired
	EtudiantRep etudiantRep;
	
	@QueryMapping
	public List<EtudiantClass> listerEtudiants(){return etudiantRep.findAll();}
	
	@QueryMapping
	public EtudiantClass etudiantById(@Argument String id) {
		return etudiantRep.findById(Integer.parseInt(id)).get();
		
	}
	@MutationMapping
	public EtudiantClass addEtudiant(@Argument  EtudiantClass etudiant ) {
		EtudiantClass r = new EtudiantClass();
		BeanUtils.copyProperties(etudiant, r);
		return etudiantRep.save(r);
	}
}
