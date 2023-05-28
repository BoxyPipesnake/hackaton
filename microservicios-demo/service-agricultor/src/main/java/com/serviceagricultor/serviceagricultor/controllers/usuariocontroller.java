package com.serviceagricultor.serviceagricultor.controllers;

import com.serviceagricultor.serviceagricultor.model.DTO.UsuarioDTO;
import com.serviceagricultor.serviceagricultor.model.entity.cultivo;
import com.serviceagricultor.serviceagricultor.model.entity.usuario;
import com.serviceagricultor.serviceagricultor.model.service.impUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api-cultivo")
public class usuariocontroller {
    @Autowired
    private impUsuario imp;


    @PostMapping("/save")
    @CrossOrigin(origins = "*")
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
    @CrossOrigin(origins = "*")
    public List<usuario> findall() {

        return imp.findAll();
    }

    @GetMapping("/cultivos/user/{id}")
    @CrossOrigin(origins = "*")
    public UsuarioDTO findall(@PathVariable(name = "id") Long id) {
        UsuarioDTO dto = new UsuarioDTO();
        dto.setId(imp.findById(id).get().getId());
        dto.setNombre(imp.findById(id).get().getNombre());
        dto.setApellido(imp.findById(id).get().getApellido());
        dto.setCultivo(imp.findById(id).get().getCultivo());

        return dto;


    }

}
