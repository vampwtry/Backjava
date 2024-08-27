package com.remipics.remipics.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table (name = "usuario")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long usuario_id; //long es un entero
    private String correo;
    private String nombre;
    private String apellido;
    private String fecha_naci;
    private String sexo;
    private String contraseña;

}
