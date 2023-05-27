package com.serviceagricultor.serviceagricultor.mode.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class cultivo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String fecha;
    private String en_federativa;
    private String Distrito;
    private String ciclo;

    private String municipio;

    private Double hectareas;

    private String mes;
    private String año;
    private String tipocultivo;

    @ManyToOne
    @JoinColumn
    private usuario usuario;


}
