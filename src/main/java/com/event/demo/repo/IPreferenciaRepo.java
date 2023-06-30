package com.event.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.demo.model.Preferencia;

public interface IPreferenciaRepo extends JpaRepository<Preferencia, Long> {

    // Método para buscar una peferencia por plato
    public Preferencia findByPlato(String nombre);
    
    // Método para buscar una peferencia por vino
    public Preferencia findByVino(String nombre);
    
    // Método para buscar una peferencia por usuario
    public Preferencia findByUsuario(String nombre);
    
}
