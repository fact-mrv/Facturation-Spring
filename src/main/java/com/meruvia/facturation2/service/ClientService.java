package com.meruvia.facturation2.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meruvia.facturation2.model.Client;
import com.meruvia.facturation2.repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repositorio;
	
	private static final Log logger = LogFactory.getLog(Client.class);
	
	public Boolean create(Client cliente) {
		
		logger.info("");
		logger.info("CREANDO CLIENTE...");
		
		try {
			repositorio.save(cliente);
			logger.info("CLIENTE CREADO...OK");
			return true;
		}catch (Exception e) {
			logger.info("ERROR-G:-----HUBO UN ERROR AL CREAR CLIENTE");
			return false;
		}
		
	}
	
	public List<Client> getAll() {
		
		logger.info("");
		logger.info("RECUPERANDO TODOS LOS CLIENTES...");
		
		List<Client> clientes = null;
		
		try {
			clientes = repositorio.findAll();
			logger.info("SE RECUPERÓ TODOS LOS CLIENTES EXITOSAMENTE ( Total registros: " + clientes.size() + " )...OK");
		}catch (Exception e) {
			logger.error("ERROR-G:-----HUBO UN ERROR AL RECUPERAR TODOS LOS CLIENTES");
		}
		
		return clientes;
	}

}
