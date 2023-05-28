package com.serviceagricultor.serviceagricultor.model.DTO;

import lombok.Data;

@Data
public class DtoUsuario {
    private Long id;

    private String nombre;


    private Double hectareas;

    private Double litros;

    private String cultivo;
}
