package com.serviceagricultor.serviceagricultor.controllers;

import com.serviceagricultor.serviceagricultor.model.entity.cultivo;
import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import com.serviceagricultor.serviceagricultor.model.service.impUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api-cultivo")
public class usuariocontroller {
    @Autowired
    private impUsuario imp;


    @PostMapping("/save")
    public usuario guardarUsuario(@RequestBody usuario us) {

        usuario user = us;

        for (cultivo c : user.getCultivo()) {
            c.setUsuario(us);
        }


        imp.save(user);
        // Guarda los cultivos asociados al usuario


        return user;
    }

    @GetMapping("/findAll")
    public List<usuario> findall() {

        return imp.findAll();
    }


}
