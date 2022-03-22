package com.api.garagemcondominio.repositorieis;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.garagemcondominio.models.Condominio;

public interface CondominioRepository extends JpaRepository<Condominio, Long> {

}
