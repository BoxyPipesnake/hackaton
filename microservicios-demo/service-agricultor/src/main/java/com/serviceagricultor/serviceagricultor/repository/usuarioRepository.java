package com.serviceagricultor.serviceagricultor.repository;

import com.serviceagricultor.serviceagricultor.model.DTO.UsuarioDTO;
import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface usuarioRepository extends CrudRepository<usuario, Long> {


}
