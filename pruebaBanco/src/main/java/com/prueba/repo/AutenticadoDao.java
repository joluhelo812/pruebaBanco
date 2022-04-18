package com.prueba.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.model.Autenticado;

public interface AutenticadoDao extends JpaRepository<Autenticado, Integer >{

}
