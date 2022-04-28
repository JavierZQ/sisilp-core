package edu.ilp.sysgailp.controller;

import edu.ilp.sysgailp.entity.Escuela;
import edu.ilp.sysgailp.entity.Estudiante;
import edu.ilp.sysgailp.entity.Persona;
import edu.ilp.sysgailp.services.IEscuelaServices;
import edu.ilp.sysgailp.services.IEstudianteServices;
import edu.ilp.sysgailp.services.IPersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.SqlResultSetMapping;
import java.util.List;

@RestController
@RequestMapping("login")
public class PruebaController {

     @Autowired
    private IEscuelaServices escuelaService;

    @GetMapping("/listaEscuela")
    public List<Escuela> listaEscuela(){
        return  this.escuelaService.listarEscuela();
    }
    @GetMapping("/buscarEsculaByCodigo")
    public Escuela buscarEsculaByCodigo(@RequestParam String codigo){
        return  this.escuelaService.obtenerEscuelaPorCodigo(codigo);
    }
    @Autowired
    private IPersonaServices PersonaService;
    @GetMapping("/listaPersona")
    public List<Persona> listarPersona() {
        return this.PersonaService.listarpersona();
    }
    @GetMapping("/buscarpersona")
    public Persona buscarPerso(@RequestParam String dni) {
        return this.PersonaService.buscarPersona(dni);
    }
    @Autowired
    private IEstudianteServices EstidianteSevices;
    @GetMapping("/listaEstudiante")
    public List<Estudiante> listaEstudiante(){
        return  this.EstidianteSevices.listarEstudiante();
    }
    @GetMapping("/saludo")
    public String saludo(){
        return "hola amigos Ayucucho-peru 2022";
    }
    @GetMapping("/bienvenido")
    public String identificacion(@RequestParam String datos){
        return "Bienvenido a la Pontificia: " + datos;
    }
}
