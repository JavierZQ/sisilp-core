package edu.ilp.sysgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "docente")
@ PrimaryKeyJoinColumn ( referencedColumnName = "IDPERSONA" )
public class Docente extends Persona {

    @Column(name = "cod_docente",length = 15)
    private String CodDocente;

    @Column(name = "horas_asignadas")
    private Double horasAsignadas;

    public Docente() {
    }

    public Docente(String codDocente, Double horasAsignadas) {
        CodDocente = codDocente;
        this.horasAsignadas = horasAsignadas;
    }

    public Docente(Long idpersona, String codDocente, Double horasAsignadas) {
        super(idpersona);
        CodDocente = codDocente;
        this.horasAsignadas = horasAsignadas;
    }

    public Docente(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codDocente, Double horasAsignadas) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        CodDocente = codDocente;
        this.horasAsignadas = horasAsignadas;
    }

    public String getCodDocente() {
        return CodDocente;
    }

    public void setCodDocente(String codDocente) {
        CodDocente = codDocente;
    }

    public Double getHorasAsignadas() {
        return horasAsignadas;
    }

    public void setHorasAsignadas(Double horasAsignadas) {
        this.horasAsignadas = horasAsignadas;
    }
}
