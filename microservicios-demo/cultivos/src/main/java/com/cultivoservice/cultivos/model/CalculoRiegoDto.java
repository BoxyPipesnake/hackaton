package com.cultivoservice.cultivos.model;

import lombok.Data;

@Data
public class CalculoRiegoDto {
    private Long idUsuario;
    private String nombreUsuario;
    private double hectareas;
    private double litrosAlmacenados;
    private String cultivo;
    private double aguaPlanta;
    private int duracionCosecha;
    private int densidadHectarea;
    private int horasRiego;
    private int consumoDia;
    private int consumoCiclo;
    private String recomendacion;

    public CalculoRiegoDto(Long id, String nombreUsuario, double hectareas, String cultivo, double aguaPlanta,
                           int duracionCosecha, int densidadHectarea, int horasRiego, int consumoDia, int consumoCiclo,
                           String recomendacion) {
        this.idUsuario = id;
        this.nombreUsuario = nombreUsuario;
        this.hectareas = hectareas;
        this.cultivo = cultivo;
        this.aguaPlanta = aguaPlanta;
        this.duracionCosecha = duracionCosecha;
        this.densidadHectarea = densidadHectarea;
        this.horasRiego = horasRiego;
        this.consumoDia = consumoDia;
        this.consumoCiclo = consumoCiclo;
        this.recomendacion = recomendacion;
    }
}
