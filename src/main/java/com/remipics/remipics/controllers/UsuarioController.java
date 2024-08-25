package com.remipics.remipics.controllers;

import com.remipics.remipics.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
        private IUsuarioService serviceU; //interfaz de usuario en service

    @Autowired
        UsuarioRepository usuarioRespository; //interfaz de usuario en repository

    @GetMapping("Usuarios")

        public List<Usuario> getAll(){
            return serviceU.getAll();
        }

}
