package com.example.demo.Web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DTO.EtudiantReponseDTO;
import com.example.demo.DTO.EtudiantRequistDTO;
import com.example.demo.Service.EtudiantsServInter;

@org.springframework.web.bind.annotation.RestController

@RequestMapping("/apl")
public class RestController {
	
	@Autowired
	EtudiantsServInter ESI;
	
	
//	##################### get #########################
	@GetMapping("/Etudiants")
	public List<EtudiantReponseDTO> GETALL(){
		return ESI.Alletudiants();
	}
	
	
//	##################### get all #########################
	@GetMapping("/Etudiants/{ID}")
	public EtudiantReponseDTO GETBYID(@PathVariable("ID") Integer ID ) {
		return ESI.ONEetudiants(ID);
	}
	
	
//	##################### post #########################
	@PostMapping("/Etudiants")
	public void add(@RequestBody EtudiantRequistDTO EQDTO) {
		ESI.ADD(EQDTO);
	}
	
	
//	##################### update #########################
	@PutMapping("/Etudiants/{ID}")
	public void upd(@RequestBody EtudiantRequistDTO EQDTO, @PathVariable("ID") Integer ID) {
		ESI.update(EQDTO, ID);
	}
	
	
//	##################### delete #########################
	@DeleteMapping("/Etudiants/{ID}")
	public void del(@PathVariable("ID") Integer ID) {
		ESI.delete(ID);
	}
}
