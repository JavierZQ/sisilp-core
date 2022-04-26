package edu.ilp.sysgailp.entity;

import javax.persistence.*;
import java.security.PrivateKey;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Estudiante extends Persona {
    @Column(name = "codigo",length = 18, nullable = false)
    private String codigo;
    @Column(name = "serie",length = 18)
    private String serie;

    @ManyToOne
    @JoinColumn(name = "IDPERSONA")
    private String escuela;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, String escuela) {
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(Long idpersona, String codigo, String serie, String escuela) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String serie, String escuela) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
}
