package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Pais;
import com.prueba.model.Usuario;
import com.prueba.service.PaisService;

@RestController
@RequestMapping("api/prueba/pais/")
public class PaisController {
	
	@Autowired
	private PaisService paisService;
	
	@PostMapping(value = "post")
	public Pais agregarPais(@RequestBody Pais pais) {
		return paisService.agregarPais(pais); 
	}
	
	@GetMapping(value = "get")
	public List<Pais> obtenerPais(){
		return paisService.obtenerPais();
	}
	
	@GetMapping(value = "get-usuario-nacio")
	public List<Pais> obtenerUsuarioByNacionalidad(@RequestParam Integer nacUsuario){
		return paisService.obtenerUsuarioByNacionalidad(nacUsuario);
	}
}


