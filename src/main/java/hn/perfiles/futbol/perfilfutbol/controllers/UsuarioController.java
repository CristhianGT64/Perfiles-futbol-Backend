package hn.perfiles.futbol.perfilfutbol.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.perfiles.futbol.perfilfutbol.entities.Usuario;
import hn.perfiles.futbol.perfilfutbol.service.impl.UsuarioServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class UsuarioController {
    
    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @PostMapping("/usuarios/Crear")
    public Usuario CrearUsuario(@RequestBody Usuario usuario) {
        
        return this.usuarioServiceImpl.CrearUsuario(usuario);
    }
    
    @GetMapping("/usuarios/TraerUsuarios")
    public List<Usuario> TraerTodosUsuarios() {
        return this.usuarioServiceImpl.traerTodosUsuario();
    }
    

}
