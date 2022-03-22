package com.api.garagemcondominio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.garagemcondominio.dtos.CondominioDto;
import com.api.garagemcondominio.models.Condominio;
import com.api.garagemcondominio.repositorieis.CondominioRepository;

@RestController
@RequestMapping(value = "/garagem-condominio")
public class MoradorController {
	
		@Autowired
		private CondominioRepository condominioRepository;
		
//		@PostMapping
//		public ResponseEntity<Object> saveGaragemCondominio(@RequestBody @Valid MoradorDto moradorDto ){
//			Morador morador = new Morador();
//			BeanUtils.copyProperties(moradorDto, morador);
//			return ResponseEntity.status(HttpStatus.CREATED).body(garagemCondominioService.save(morador));
//		}
		
		@GetMapping
		public List<CondominioDto> buscarCondominio(){
			List<Condominio> condominio = condominioRepository.findAll();
			return CondominioDto.converter(condominio);
		}
}
