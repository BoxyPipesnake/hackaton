package com.serviceagricultor.serviceagricultor.model.DTO;

import com.serviceagricultor.serviceagricultor.model.entity.cultivo;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UsuarioDTO  {
    private Long id;
    private String nombre;
    private String apellido;
    private List<cultivo> cultivo;

    public UsuarioDTO(){
        cultivo=new ArrayList<cultivo>();
    }
}
