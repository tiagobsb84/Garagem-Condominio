package com.api.garagemcondominio.repositorieis;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.garagemcondominio.models.Morador;

public interface MoradoRepository extends JpaRepository<Morador, UUID> {

}
