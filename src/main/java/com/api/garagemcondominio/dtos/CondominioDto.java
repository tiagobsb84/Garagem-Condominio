package com.api.garagemcondominio.dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.api.garagemcondominio.models.Condominio;

public class CondominioDto {

	private Long id;
	private String apartamento;
	private String bloco;
	private String vaga;
	private String nome;
	private String marca;
	private String modelo;
	private String placa;
	
	public CondominioDto(Condominio condominio) {
		this.id = condominio.getId();
		this.apartamento = condominio.getApartamento();
		this.bloco = condominio.getBloco();
		this.vaga = condominio.getVaga();
		this.nome = condominio.getMorador().getNome();
		this.marca = condominio.getMorador().getAutomovel().getMarca();
		this.modelo = condominio.getMorador().getAutomovel().getModelo();
		this.placa = condominio.getMorador().getAutomovel().getPlaca();
	}
	
	public Long getId() {
		return id;
	}

	public String getApartamento() {
		return apartamento;
	}

	public String getBloco() {
		return bloco;
	}

	public String getVaga() {
		return vaga;
	}

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public static List<CondominioDto> converter(List<Condominio> condominio) {
		return condominio.stream().map(CondominioDto::new).collect(Collectors.toList());
	}
}
