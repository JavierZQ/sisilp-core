package edu.ilp.sysgailp.services.impl;

import edu.ilp.sysgailp.dao.IEscuelaDao;
import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.services.IEscuelaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EscuelaServicesImpl implements IEscuelaServices {

    @Autowired
    private IEscuelaDao escuelaDao;

    @Override
    public List<Escuela> listarEscuela() {
        return this.escuelaDao.findAll();
    }

    @Override
    public Escuela obtenerEscuelaPorCodigo(String codigo) {
        return this.escuelaDao.obtenerEscuelaPorCodigo(codigo);
    }
}
