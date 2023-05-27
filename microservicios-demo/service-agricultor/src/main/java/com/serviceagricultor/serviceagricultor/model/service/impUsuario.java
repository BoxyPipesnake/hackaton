package com.serviceagricultor.serviceagricultor.model.service;

import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import com.serviceagricultor.serviceagricultor.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class impUsuario {
    @Autowired
    private usuarioRepository imp;


    public void save(usuario us){

        imp.save(us);
    }

    public List<usuario>
}
