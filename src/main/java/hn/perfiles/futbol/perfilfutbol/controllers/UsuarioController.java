package hn.perfiles.futbol.perfilfutbol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.perfiles.futbol.perfilfutbol.entities.Usuario;
import hn.perfiles.futbol.perfilfutbol.service.impl.UsuarioServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/usuarios/Crear")
    public Usuario postMethodName(@RequestBody Usuario usuario) {
        
        return this.usuarioServiceImpl.CrearUsuario(usuario);
    }
    


}
