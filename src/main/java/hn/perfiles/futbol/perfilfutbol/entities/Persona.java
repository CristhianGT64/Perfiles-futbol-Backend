package hn.perfiles.futbol.perfilfutbol.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "persona")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;

    private String nombres;

    private String apellidos;

    private Date fecha_nacimiento;

    private String nacionalidad;

    private Integer edad;

    private Integer altura; 

    private Integer peso;

    @JsonIgnore
    @OneToOne(mappedBy = "persona")
    private Usuario usuario;
}
