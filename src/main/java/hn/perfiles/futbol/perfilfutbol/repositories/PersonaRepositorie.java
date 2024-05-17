package hn.perfiles.futbol.perfilfutbol.repositories;

import org.springframework.data.repository.CrudRepository;

import hn.perfiles.futbol.perfilfutbol.entities.Persona;

public interface PersonaRepositorie extends CrudRepository<Persona, Long>{
    
}
