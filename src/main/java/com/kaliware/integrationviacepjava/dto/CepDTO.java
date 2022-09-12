package com.kaliware.integrationviacepjava.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CepDTO {
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	
	@JsonIgnore
	private String ibge;
	
	@JsonIgnore
	private String gia;

	private String ddd;
	
	@JsonIgnore
	private String siafi;
}
