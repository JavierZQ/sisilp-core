package edu.ilp.sysgailp.dao;


import edu.ilp.sysgailp.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository<Persona,Long> {
    @Query(value = "SELECT e FROM Persona e WHERE e.dni = ?1")
    Persona buscarpersona(String dni);
}
