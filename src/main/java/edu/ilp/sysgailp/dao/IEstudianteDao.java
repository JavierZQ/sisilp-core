package edu.ilp.sysgailp.dao;

import edu.ilp.sysgailp.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante,Long> {
}
