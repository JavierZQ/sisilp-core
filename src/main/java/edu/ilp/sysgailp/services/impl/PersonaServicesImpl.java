package edu.ilp.sysgailp.services.impl;

import edu.ilp.sysgailp.dao.IPersonaDao;
import edu.ilp.sysgailp.entity.Persona;
import edu.ilp.sysgailp.services.IPersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServicesImpl implements IPersonaServices {
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarpersona(){
        return this.personaDao.findAll();
    }

    @Override
    public Persona buscarPersona(String dni) {
        return this.personaDao.buscarpersona(dni);
    }


}
