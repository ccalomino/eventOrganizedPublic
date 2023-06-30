package com.event.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "maridaje")
public class Maridaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "plato_id")
    private Platos plato;

    @ManyToOne
    @JoinColumn(name = "vino_id")
    private Vino vino;

	public Long getId() {
		return id;
	}
	
    
    @Column(name = "descripcion")
    private String descripcion;
    
    
    

	public void setId(Long id) {
		this.id = id;
	}

	public Platos getPlato() {
		return plato;
	}

	public void setPlato(Platos plato) {
		this.plato = plato;
	}

	public Vino getVino() {
		return vino;
	}

	public void setVino(Vino vino) {
		this.vino = vino;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


}