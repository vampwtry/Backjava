package com.remipics.remipics.controllers;

import com.remipics.remipics.entities.Usuario;
import com.remipics.remipics.repository.UsuarioRepository;
import com.remipics.remipics.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UsuarioController {

    @Autowired
        private IUsuarioService serviceU; //interfaz de usuario en service

    @Autowired
    UsuarioRepository usuarioRepository; //interfaz de usuario en repository

    @GetMapping("json/Users")
    @ResponseBody
        public List<Usuario> getAll(){
            return serviceU.getAll();
        }

    @GetMapping("tableUsuarios")
    public String microHtml(Model model){
        List<Usuario> usuarios = serviceU.getAll();
        model.addAttribute("usuarios",usuarios);
        return "Usuario/microUsuario";
    }

}
