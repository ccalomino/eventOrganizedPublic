package com.event.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.event.demo.model.Ingredientes;


public interface IIngredientesRepo extends JpaRepository<Ingredientes, Long> {
    
    /**
     * Método que devuelve una lista de ingredientes que contengan en su nombre
     * el texto pasado como parámetro.
     * 
     * @param nombre Texto a buscar en el nombre de los ingredientes.
     * @return Lista de ingredientes que cumplen con la condición de búsqueda.
     */
    List<Ingredientes> findByNombreContainingIgnoreCase(String nombre);
    
    /**
     * Método que devuelve una lista de ingredientes que contengan en su descripción
     * el texto pasado como parámetro.
     * 
     * @param descripcion Texto a buscar en la descripción de los ingredientes.
     * @return Lista de ingredientes que cumplen con la condición de búsqueda.
     */
    List<Ingredientes> findByDescripcionContainingIgnoreCase(String descripcion);
    
  
}

