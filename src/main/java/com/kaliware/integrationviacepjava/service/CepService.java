package com.kaliware.integrationviacepjava.service;

import org.springframework.stereotype.Service;

import com.kaliware.integrationviacepjava.dto.CepDTO;
import com.kaliware.integrationviacepjava.utils.Util;

@Service
public class CepService {
	private static final String PATH = "/json/";
	
	public CepDTO findCep(String cep) {
		String endpoint = cep + PATH;
		CepDTO mono = Util.webClient()
				.get()
				.uri(builder -> builder.path(endpoint).build())
				.retrieve()
				.bodyToMono(CepDTO.class)
				.block();
		return mono;
	}
}
