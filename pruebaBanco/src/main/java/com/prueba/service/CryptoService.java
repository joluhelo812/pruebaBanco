package com.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.Crypto;
import com.prueba.model.Usuario;
import com.prueba.repo.CryptoDao;

@Service
public class CryptoService {
	
	@Autowired
	private CryptoDao cryptoDao;
	
	public Crypto agregarCrypto(Crypto crypto) {		
		return cryptoDao.save(crypto);		
	}
	
	public List<Crypto> obtenerCrypto(){
		return cryptoDao.findAll();
	}
	
	public List<Crypto> obtenerCryptoIdUsuario(Integer idUsuario) {
		return cryptoDao.findByIdUsuario(idUsuario);
	}

}
