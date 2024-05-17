package hn.perfiles.futbol.perfilfutbol.service;

import java.util.List;

import hn.perfiles.futbol.perfilfutbol.entities.Usuario;

public interface UsuarioService {
    
    public Usuario CrearUsuario(Usuario usuario);

    public List<Usuario> traerTodosUsuario();

}
