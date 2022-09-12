package com.kaliware.integrationviacepjava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaliware.integrationviacepjava.dto.CepDTO;
import com.kaliware.integrationviacepjava.service.CepService;

@RestController
@RequestMapping(value = "/cep")
public class CepController {
	
	@Autowired
	private CepService service;
	
	@GetMapping(value = "/{cep}")
	public CepDTO findCep(@PathVariable String cep){
		return service.findCep(cep);
	}
}
