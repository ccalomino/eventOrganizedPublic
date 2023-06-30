package com.event.demo.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "bebidas")
public class Bebida {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "nombre")
   private String nombre;

   @Column(name = "descripcion")
   private String descripcion;

   @Column(name = "precio")
   private BigDecimal precio;

   @Column(name = "litros")
   private Double litros;
   
   @Column(name = "alcoholica")
   private boolean alcoholica;
   
   
   
	public Bebida(String nombre, BigDecimal precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}

	public Bebida(String nombre, String descripcion, BigDecimal precio, Double litros) {
	super();
	this.nombre = nombre;
	this.descripcion = descripcion;
	this.precio = precio;
	this.litros = litros;
	this.alcoholica = true;
}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double litros) {
		this.litros = litros;
	}

	public boolean isAlcoholica() {
		return alcoholica;
	}

	public void setAlcoholica(boolean alcoholica) {
		this.alcoholica = alcoholica;
	}

  

}
