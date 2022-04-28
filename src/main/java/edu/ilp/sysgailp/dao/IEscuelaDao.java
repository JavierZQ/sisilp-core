package edu.ilp.sysgailp.dao;

import edu.ilp.sysgailp.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEscuelaDao extends JpaRepository<Escuela,Long> {


    @Query(value = "SELECT e FROM Escuela e WHERE e.codigoescuela = ?1")
    Escuela obtenerEscuelaPorCodigo(String codigo);
    @Query("SELECT e FROM Escuela e WHERE e.codigoescuela = :codigo")
    Escuela obtenerEscuelaPorPran(String codigo);
}
