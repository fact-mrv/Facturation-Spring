package com.meruvia.facturation2.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meruvia.facturation2.model.Client;
import com.meruvia.facturation2.service.ClientService;

@RestController
@RequestMapping(path="/client")
public class ClientController {

	@Autowired
	private ClientService servicio;
	
	@PutMapping
	@ResponseBody
	public String create(@RequestBody @Valid Client cliente) {
		
		Boolean estado = servicio.create(cliente);
		
		if(estado) {
			return "Cliente agregado exitosamente";
		}else {
			return "No se pudo guardar el cliente";
		}
	}
	
	@GetMapping
	@ResponseBody
	public List<Client> getAll() {
		
		List<Client> clientes = servicio.getAll();
		
		return clientes;
	}
}
