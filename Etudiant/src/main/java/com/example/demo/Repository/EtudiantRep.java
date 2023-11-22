package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.Entites.EtudiantClass;

@RepositoryRestController
public interface EtudiantRep extends JpaRepository<EtudiantClass, Integer>{

}
