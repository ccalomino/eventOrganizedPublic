package com.event.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.demo.model.Ingredientes;
import com.event.demo.model.Platos;

@Repository
public interface IPlatosRepo extends JpaRepository<Platos, Long> {
    
    // Método para buscar un plato por su nombre
    public Platos findByNombre(String nombre);
    
    // Método para buscar los platos que contengan un ingrediente dado
    public List<Platos> findByIngredientes(Ingredientes ingrediente);
    
    // Método para buscar los platos que contengan al menos uno de los ingredientes dados
    public List<Platos> findByIngredientesIn(List<Ingredientes> ingredientes);
    
    // Método para buscar los platos que no contengan ninguno de los ingredientes dados
    public List<Platos> findByIngredientesNotIn(List<Ingredientes> ingredientes);
    

    
}

