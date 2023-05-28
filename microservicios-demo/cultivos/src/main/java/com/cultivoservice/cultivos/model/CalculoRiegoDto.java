package com.cultivoservice.cultivos.model;

import lombok.Data;

@Data
public class CalculoRiegoDto {
    private Integer id;
    private String nombreUsuario;
    private double hectareas;
    private String cultivo;
    private double aguaPlanta;
    private int duracionCosecha;
    private int densidadHectarea;
    private int horasRiego;
    private int consumoDia;
    private int consumoCiclo;

    public CalculoRiegoDto(Integer id ,String nombreUsuario, double hectareas, String cultivo, double aguaPlanta,
                           int duracionCosecha, int densidadHectarea, int horasRiego, int consumoDia, int consumoCiclo) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.hectareas = hectareas;
        this.cultivo = cultivo;
        this.aguaPlanta = aguaPlanta;
        this.duracionCosecha = duracionCosecha;
        this.densidadHectarea = densidadHectarea;
        this.horasRiego = horasRiego;
        this.consumoDia = consumoDia;
        this.consumoCiclo = consumoCiclo;
    }
}
