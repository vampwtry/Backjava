package com.remipics.remipics.services;

import com.remipics.remipics.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUsuarioService {
    List<Usuario> getAll();
}
