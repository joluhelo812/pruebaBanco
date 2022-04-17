package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.model.Crypto;
import com.prueba.model.Usuario;
import com.prueba.service.CryptoService;

@RestController
@RequestMapping("api/prueba/crypto")
public class CryptoController {
	
	@Autowired
	private CryptoService cryptoService;
	
	@PostMapping(value = "post")
	public Crypto gregarCrypto(@RequestBody Crypto crypto) {
		return cryptoService.agregarCrypto(crypto);
	}
	
	@GetMapping(value = "get")
	public List<Crypto> obtenerCrypto(){
		return cryptoService.obtenerCrypto();	
	}
	
	@GetMapping(value = "get-crypto-id")
	public List<Crypto> obtenerCryptoIdUsuario(@RequestParam Integer idUsuario){
		return cryptoService.obtenerCryptoIdUsuario(idUsuario);
	}

}
