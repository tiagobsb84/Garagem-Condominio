package com.api.garagemcondominio.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.garagemcondominio.dtos.MoradorDto;
import com.api.garagemcondominio.models.Morador;
import com.api.garagemcondominio.service.GaragemCondominioService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/garagem-condominio")
public class MoradorController {
	
		final GaragemCondominioService garagemCondominioService;

		public MoradorController(GaragemCondominioService garagemCondominioService) {
			this.garagemCondominioService = garagemCondominioService;
		}
		
		@PostMapping
		public ResponseEntity<Morador> saveGaragemCondominio(@RequestBody @Valid MoradorDto moradorDto ){
			Morador morador = new Morador();
			BeanUtils.copyProperties(moradorDto, morador);
			return ResponseEntity.status(HttpStatus.CREATED).body(garagemCondominioService.save(morador));
		}
}
