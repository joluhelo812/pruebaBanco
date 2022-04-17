package com.prueba.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.model.Pais;
import com.prueba.model.Usuario;

@Repository
public interface PaisDao extends JpaRepository<Pais, Integer>{
	
	@Query(value = "select * from pais where usuario_nac=?", nativeQuery = true)
	public List<Pais> findByNacionalidadUsuario(Integer nacUsuario);

}
