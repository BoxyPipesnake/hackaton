package com.serviceagricultor.serviceagricultor.controllers;

import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import com.serviceagricultor.serviceagricultor.model.service.impUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-cultivo")
public class usuariocontroller {
    @Autowired
    private impUsuario imp;

    @PostMapping("/save")
    public ResponseEntity<?> guardar(@RequestBody usuario us) {

        imp.save(us);



        return ResponseEntity.ok(us);
    }
}
