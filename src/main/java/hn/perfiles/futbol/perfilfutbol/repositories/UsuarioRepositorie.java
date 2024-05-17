package hn.perfiles.futbol.perfilfutbol.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.perfiles.futbol.perfilfutbol.entities.Usuario;

public interface UsuarioRepositorie extends CrudRepository<Usuario, Long>{
    
}
