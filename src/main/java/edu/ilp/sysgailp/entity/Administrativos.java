package edu.ilp.sysgailp.entity;

import jdk.jfr.Name;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "administrativo")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Administrativos extends Persona {

    @Column(name = "idadministrativos",length = 15, nullable = false)
    private Long idAministrativos;
    @Column(name = "cargo",length = 100, nullable = false)
    private String cargo;

    public Administrativos() {
    }

    public Administrativos(Long idAministrativos, String cargo) {
        this.idAministrativos = idAministrativos;
        this.cargo = cargo;
    }

    public Administrativos(Long idpersona, Long idAministrativos, String cargo) {
        super(idpersona);
        this.idAministrativos = idAministrativos;
        this.cargo = cargo;
    }

    public Administrativos(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, Long idAministrativos, String cargo) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.idAministrativos = idAministrativos;
        this.cargo = cargo;
    }

    public Long getIdAministrativos() {
        return idAministrativos;
    }

    public void setIdAministrativos(Long idAministrativos) {
        this.idAministrativos = idAministrativos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
