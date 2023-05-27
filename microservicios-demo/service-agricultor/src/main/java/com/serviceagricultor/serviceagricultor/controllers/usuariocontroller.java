package com.serviceagricultor.serviceagricultor.controllers;

import com.serviceagricultor.serviceagricultor.model.entity.cultivo;
import com.serviceagricultor.serviceagricultor.model.service.impCultivo;
import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import com.serviceagricultor.serviceagricultor.model.service.impUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-cultivo")
public class usuariocontroller {
    @Autowired
    private impUsuario imp;

    @Autowired
    private impCultivo cultivoimp;

    @PostMapping("/save")
    public ResponseEntity<?> guardar(@RequestBody usuario us) {





        return ResponseEntity.ok(us);
    }


    @GetMapping("/findAll")
    public List<usuario> findall() {

        return imp.findAll();
    }


}
