package com.example.demo.Entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString @Builder @Setter
public class EtudiantClass {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Appoge ;
	private String Nome;
	private String Prenome;
	private String Master;
}
