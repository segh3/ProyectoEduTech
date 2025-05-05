package com.edutech.usuarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Funcion para generar los getters y setters.
@AllArgsConstructor //Constructor con todos los atributos.
@NoArgsConstructor //Constructor sin atributos.
public class Usuario { 
    private int idUsuario; 
    private String nombre;
    private String apPat;
    private String apMat;
    private String correo;
    private String contrasena;
}
