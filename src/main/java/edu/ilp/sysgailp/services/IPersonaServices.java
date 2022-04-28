package edu.ilp.sysgailp.services;



import edu.ilp.sysgailp.entity.Persona;

import java.util.List;

public interface IPersonaServices {
    //listar escuela toda las escuelas
    List<Persona> listarpersona();

    Persona buscarPersona(String dni);
}
