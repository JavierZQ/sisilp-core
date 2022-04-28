package edu.ilp.sysgailp.services;

import edu.ilp.sysgailp.entity.Escuela;

import java.util.List;

public interface IEscuelaServices {
    //listar escuela toda las escuelas
    List<Escuela>listarEscuela();

    //obtener escuela por codigo
    Escuela obtenerEscuelaPorCodigo(String codigo);
}
