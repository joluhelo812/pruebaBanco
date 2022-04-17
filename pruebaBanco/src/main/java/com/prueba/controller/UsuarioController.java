package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Usuario;
import com.prueba.service.UsuarioService;

@RestController
@RequestMapping("api/prueba/usuario/")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping(value = "post")
	public Usuario agregarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.agregarUsuario(usuario);
	}
	
	@GetMapping(value = "get")
	public List<Usuario> oltenerUsuario(){
		return usuarioService.obtenerUsuario();
	}
	
	@GetMapping(value = "get-usario-nacio")
	public List<Usuario> obtenerUsuarioByNacionalidad (@RequestParam String nacUsuario){
		return usuarioService.obtenerUsuarioByNacionalidad(nacUsuario);
	}
	

}
