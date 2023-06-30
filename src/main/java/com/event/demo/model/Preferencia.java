package com.event.demo.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "preferencia")
public class Preferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plato")
    private String plato;

    @Column(name = "vino")
    private String vino;

    @Column(name = "usuario")
    private String usuario;

    // Constructors, getters, and setters
    // ...
}
