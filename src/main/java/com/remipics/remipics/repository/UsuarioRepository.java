package com.remipics.remipics.repository;


import com.remipics.remipics.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

    public  interface UsuarioRepository extends CrudRepository<Usuario, Long>{

    }

