package com.agustin.SpringBoot.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    //Clase Persona con sus Getters, Setters y Constructor
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String cargo;
    private String descrip;
    private String foto;
    private String inst;
    private String carrera;
    private String fin;
    private String logo;
    private String skill;
    private String skill2;
    private String skill3;
    private String skill4;
    private String p_nombre;
    private String p_fecha;
    private String p_desc;
    private String p_link;
    
    
    public Persona(){
    }
    
    public Persona(Long id, String nombre, String cargo, String descrip, String foto,String skill, String skill2,
        String skill3, String skill4, String inst, String carrera, String fin, String logo, String p_nombre, String p_fecha,
        String p_desc, String p_link){ //Constructor
        this.id=id;
        this.nombre=nombre;
        this.cargo=cargo;
        this.descrip=descrip;
        this.foto=foto;
        this.inst= inst;
        this.carrera = carrera;
        this.fin= fin;
        this.logo = logo;
        this.skill=skill;
        this.skill2=skill2;
        this.skill3=skill3;
        this.skill4=skill4;
        this.p_nombre=p_nombre;
        this.p_fecha=p_fecha;
        this.p_desc=p_desc;
        this.p_link=p_link;
    }
}
