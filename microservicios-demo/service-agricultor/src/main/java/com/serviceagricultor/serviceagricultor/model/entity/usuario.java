package com.serviceagricultor.serviceagricultor.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;


    private String apellido;

    private String telefono;

    private String direccion;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<cultivo> cultivo;




    public usuario() {
        cultivo = new ArrayList<cultivo>();
    }

    public void add(cultivo c) {
        cultivo.add(c);
    }

}
