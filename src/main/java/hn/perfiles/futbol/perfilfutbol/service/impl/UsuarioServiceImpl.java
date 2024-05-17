package hn.perfiles.futbol.perfilfutbol.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.perfiles.futbol.perfilfutbol.entities.Usuario;
import hn.perfiles.futbol.perfilfutbol.repositories.UsuarioRepositorie;
import hn.perfiles.futbol.perfilfutbol.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepositorie usuarioRepositorie;

    @Override
    public Usuario CrearUsuario(Usuario usuario) {

        usuario.setEstado(1);
        return this.usuarioRepositorie.save(usuario);
    }

    @Override
    public List<Usuario> traerTodosUsuario() {
        return (List<Usuario>) this.usuarioRepositorie.findAll();
    }
    
}
