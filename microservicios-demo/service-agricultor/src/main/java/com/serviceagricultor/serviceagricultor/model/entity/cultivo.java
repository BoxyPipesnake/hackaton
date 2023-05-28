package com.serviceagricultor.serviceagricultor.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class cultivo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;


    private String fecha;

    private Double hectareas;

    private Double litros;

    private String cultivo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore

    @JoinColumn(name = "usuario")
    private usuario usuario;

    private static final Serializable serial = 1L;

}
