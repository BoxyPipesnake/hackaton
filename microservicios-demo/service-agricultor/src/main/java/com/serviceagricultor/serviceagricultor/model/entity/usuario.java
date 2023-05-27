package com.serviceagricultor.serviceagricultor.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;

    private String apellido;

    private String telefono;

    private String direccion;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<cultivo> cultivos;

    public usuario() {
        cultivos = new ArrayList<cultivo>();
    }

    public void addcultivos(cultivo cultivo) {
        cultivos.add(cultivo);
    }

}
