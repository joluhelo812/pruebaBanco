package com.prueba.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.prueba.model.Crypto;
import com.prueba.model.Usuario;

@Repository
public interface CryptoDao extends JpaRepository<Crypto, Integer>{
	
	@Query(value = "select * from crypto where usuario_id=?", nativeQuery = true)
	public List<Crypto> findByIdUsuario(Integer idUsuario);
}
