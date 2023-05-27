package com.serviceagricultor.serviceagricultor.mode.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    private Integer nombnre;

    private String telefono;

    private String direccion;


}
