package edu.ilp.sysgailp.services.impl;

import edu.ilp.sysgailp.dao.IEstudianteDao;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.services.IEstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstudianteServicesImpl implements IEstudianteServices {

    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listarEstudiante() {
        return this.estudianteDao.findAll();
    }
}
