package com.api.garagemcondominio.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.garagemcondominio.models.Morador;
import com.api.garagemcondominio.repositorieis.MoradoRepository;

@Service
public class GaragemCondominioService {

	final MoradoRepository moradoRepository;
	
	public GaragemCondominioService(MoradoRepository moradoRepository) {
		this.moradoRepository = moradoRepository;
	}
	
	@Transactional
	public Morador save(Morador morador) {
		return moradoRepository.save(morador);
	}
}
