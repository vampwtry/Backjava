package com.remipics.remipics.services;

import com.remipics.remipics.entities.Usuario;
import com.remipics.remipics.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    private UsuarioRepository repository;

    @Override
    public List<Usuario> getAll(){
        return (List<Usuario>) repository.findAll();
    }
}
