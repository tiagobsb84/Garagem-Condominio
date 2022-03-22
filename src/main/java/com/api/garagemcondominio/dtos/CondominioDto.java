package com.api.garagemcondominio.dtos;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import com.api.garagemcondominio.models.Condominio;

public class CondominioDto {

//	@NotBlank
//	private String nome;
//	@NotBlank
//	private String sobreNome;
//	@NotBlank
//	private String cpf;
	private UUID id;
	private String apartamento;
	private String bloco;
	private String numeroVaga;
	
	public CondominioDto(Condominio condominio) {
		this.id = condominio.getId();
		this.apartamento = condominio.getApartamento();
		this.bloco = condominio.getBloco();
		this.numeroVaga = condominio.getNumeroVaga();
	}
	
	public UUID getId() {
		return id;
	}

	public String getApartamento() {
		return apartamento;
	}

	public String getBloco() {
		return bloco;
	}

	public String getNumeroVaga() {
		return numeroVaga;
	}

	public static List<CondominioDto> converter(List<Condominio> condominio) {
		return condominio.stream().map(CondominioDto::new).collect(Collectors.toList());
	}
}
