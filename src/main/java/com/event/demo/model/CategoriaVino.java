package com.event.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoriavinos")
public class CategoriaVino {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "color")
    private String color;
    
    @Column(name = "clasificacion")
    private String clasificacion;
    
    @Column(name = "tiempoBarrica")
    private int tiempoBarrica;
    
    @Column(name = "tiempoBotella")
    private int tiempoBotella;
    
    @Column(name = "tiempoTotal")
    private int tiempoTotal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public int getTiempoBarrica() {
		return tiempoBarrica;
	}

	public void setTiempoBarrica(int tiempoBarrica) {
		this.tiempoBarrica = tiempoBarrica;
	}

	public int getTiempoBotella() {
		return tiempoBotella;
	}

	public void setTiempoBotella(int tiempoBotella) {
		this.tiempoBotella = tiempoBotella;
	}

	public int getTiempoTotal() {
		return tiempoTotal;
	}

	public void setTiempoTotal(int tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}
    
	
    
    
}
