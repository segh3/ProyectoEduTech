package com.edutech.usuarios.model.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@EntityScan //Anotacion para indicar que es una entidad de base de datos.
@Data
public class UsuarioEntity { 

    @Id //Anotacion para indicar que es la llave primaria.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Anotacion para indicar que es un id autoincrementable.
    private int idUsuario; //Atributo para el id del usuario.
    @Column(name = "nombre") //Anotacion para indicar el nombre de la columna en la base de datos.
    private String nombre; 
    @Column(name = "apPat") //Anotacion para indicar el nombre de la columna en la base de datos.
    private String apPat; 
    @Column(name = "apMat") //Anotacion para indicar el nombre de la columna en la base de datos.
    private String apMat; 
    @Column(name = "correo") //Anotacion para indicar el nombre de la columna en la base de datos.
    private String correo; 
    @Column(name = "contrasena") //Anotacion para indicar el nombre de la columna en la base de datos.
    private String contrasena;



}
