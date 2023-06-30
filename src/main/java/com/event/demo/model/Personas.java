package com.event.demo.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "personas")
public class Personas extends Usuario {
    

    
    @Column(name = "genero")
    private String genero;
    
    @Column(name = "edad")
    private int edad;

    
    
    
	public Personas(Long id, String genero, int edad) {
		super();

		this.genero = genero;
		this.edad = edad;
	}







	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
    
   

    
    
}
