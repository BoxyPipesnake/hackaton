package com.serviceagricultor.serviceagricultor.repository;

import com.serviceagricultor.serviceagricultor.model.entity.cultivo;
import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import org.springframework.data.repository.CrudRepository;

public interface cultivoRepository extends CrudRepository<cultivo,Long> {

}
