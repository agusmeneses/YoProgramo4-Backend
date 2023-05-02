package com.agustin.SpringBoot.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.agustin.SpringBoot.model.Persona;
import com.agustin.SpringBoot.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@CrossOrigin(origins = "https://argentina-programa-14751.web.app")
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    
    @PostMapping("/new/persona") //Da de alta una Persona
    public void agregarPersona (@RequestBody Persona pers){ 
        persoServ.crearPersona(pers);                       
    }
    
    @GetMapping ("/ver/personas") //Metodo GET para ver la lista de las personas
    @ResponseBody                 //Nos aseguramos de que la respuesta al cliente sea en JSON
    public List<Persona> verPersonas(){
        return persoServ.verPersonas();
    }
    
    @GetMapping ("/buscar/{id}")
    public Persona buscarPersona(@PathVariable Long id){
        return persoServ.buscarPersona(id);
    }
    
    
    @DeleteMapping("/delete/{id}") //Metodo DELETE que borra el id de /delete/"id"
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/modificar/{id}") //Actualiza una Persona
    public void modificarPersona(@PathVariable("id") Long id, @RequestBody Persona pers){
        pers.setId(id); //seteamos el id recibido en el objeto Persona
        persoServ.modificarPersona(pers); //llamamos al método que actualiza la persona
    }
    
}

