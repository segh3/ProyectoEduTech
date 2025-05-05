package com.edutech.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutech.usuarios.model.Usuario;
import com.edutech.usuarios.model.entity.UsuarioEntity;
import com.edutech.usuarios.repository.UsuarioRepository;

@Service 

public class UsuarioService {
    @Autowired 
    private UsuarioRepository usuarioRepository; //Inyeccion de dependencias para el repositorio de usuarios.
    public String crearUsuario(Usuario user){
        try{
            Boolean estado = usuarioRepository.existsByCorreo(user.getCorreo()); //Verifica si el correo ya existe en la base de datos.
            if (!estado) {
                UsuarioEntity usuarioNuevo = new UsuarioEntity(); //Crea un nuevo objeto de tipo UsuarioEntity.
                usuarioNuevo.setIdUsuario(user.getIdUsuario()); //Asigna el id del usuario.
                usuarioNuevo.setNombre(user.getNombre()); //Asigna el nombre del usuario.
                usuarioNuevo.setApPat(user.getApPat()); //Asigna el apellido paterno del usuario.
                usuarioNuevo.setApMat(user.getApMat()); //Asigna el apellido materno del usuario.
                usuarioNuevo.setCorreo(user.getCorreo()); //Asigna el correo del usuario.
                usuarioNuevo.setContrasena(user.getContrasena()); //Asigna la contraseña del usuario.
                usuarioRepository.save(usuarioNuevo); //Guarda el nuevo usuario en la base de datos.
                return "Usuario creado correctamente"; //Retorna un mensaje de exito.
            }
            return "El correo ya existe"; //Retorna un mensaje de error si el correo ya existe.
        }catch(Exception e){
            return "Error al crear el usuario";
        }
        
    }
}
