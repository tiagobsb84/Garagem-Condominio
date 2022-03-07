package com.api.garagemcondominio.dtos;

import javax.validation.constraints.NotBlank;

public class MoradorDto {

	@NotBlank
	private String nome;
	@NotBlank
	private String sobreNome;
	@NotBlank
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
