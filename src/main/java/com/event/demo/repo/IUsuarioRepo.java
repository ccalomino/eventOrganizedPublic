package com.event.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.demo.model.Usuario;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Long> {
    
    // Método para buscar un plato por su nombre
    public Usuario findByNombre(String nombre);
    

    

    
}