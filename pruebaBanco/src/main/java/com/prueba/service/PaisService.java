package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Pais;
import com.prueba.model.Usuario;
import com.prueba.repo.PaisDao;

@Service
public class PaisService {
	
	@Autowired
	private PaisDao paisDao;	
	
	public Pais agregarPais(Pais pais) {
		return paisDao.save(pais);
	}
	
	public List<Pais> obtenerPais(){
		return paisDao.findAll();
		}
	
	public List<Pais> obtenerUsuarioByNacionalidad(Integer nacUsuario){
		return paisDao.findByNacionalidadUsuario(nacUsuario);
	}

}
