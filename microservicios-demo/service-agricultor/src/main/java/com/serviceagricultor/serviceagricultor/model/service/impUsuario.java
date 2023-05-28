package com.serviceagricultor.serviceagricultor.model.service;

import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import com.serviceagricultor.serviceagricultor.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class impUsuario {
    @Autowired
    private usuarioRepository imp;


    @Transactional
    public void save(usuario us) {

        imp.save(us);
    }


    @Transactional
    public List<usuario> findAll() {

        return (List<usuario>) imp.findAll();
    }

    @Transactional
    public Optional<usuario> findById(Long id) {

        return imp.findById(id);
    }



}
