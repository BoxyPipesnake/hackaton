package com.serviceagricultor.serviceagricultor.model.service;

import com.serviceagricultor.serviceagricultor.model.entity.cultivo;
import com.serviceagricultor.serviceagricultor.repository.cultivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class impCultivo {

    @Autowired
    private cultivoRepository imp;


    @Transactional
    public void savecultivo(cultivo c) {
        imp.save(c);

    }
    @Transactional

    public List<cultivo> findall(){
        return (List<cultivo>) imp.findAll();
    }
}
