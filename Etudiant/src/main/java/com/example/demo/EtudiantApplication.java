package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entites.EtudiantClass;
import com.example.demo.Repository.EtudiantRep;

@SpringBootApplication
public class EtudiantApplication implements CommandLineRunner{
	
	@Autowired
	EtudiantRep ERep;
	
	
	public static void main(String[] args) {
		SpringApplication.run(EtudiantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ERep.save(new EtudiantClass(null,"Mchimcha","Alae","IAO"));
		ERep.save(new EtudiantClass(null,"Mouhcine","Aimane","IAO"));
		ERep.save(new EtudiantClass(null,"Mchimcha","Oussama","M2I"));
		ERep.save(new EtudiantClass(null,"Boukres","Badr","M2I"));
		ERep.save(new EtudiantClass(null,"Benhmad","Sami","AI"));
	}

}
