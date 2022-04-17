package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Usuario;
import com.prueba.repo.UsuarioDao;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	public Usuario agregarUsuario(Usuario usuario) {
		return usuarioDao.save(usuario);
	}
	
	public List<Usuario> obtenerUsuario(){
		return usuarioDao.findAll();
	}
	
	public List<Usuario> obtenerUsuarioByNacionalidad(String nacUsuario) {
		return usuarioDao.findByNacionalidadUsuario(nacUsuario);
	}

}