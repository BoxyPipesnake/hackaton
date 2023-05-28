package com.cultivoservice.cultivos.model.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private List<cultivo> cultivo;


    public usuario() {
        cultivo = new ArrayList<cultivo>();
    }
}
