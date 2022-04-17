package com.prueba.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.model.Usuario;

@Repository
public interface UsuarioDao extends JpaRepository<Usuario, Integer>{

	@Query(value = "select * from usuario where usuario_id=?", nativeQuery = true)
	public List<Usuario> findByNacionalidadUsuario(String nacUsuario);
	
}
