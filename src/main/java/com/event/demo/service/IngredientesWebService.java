package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.model.Ingredientes;

@Service
public interface IngredientesWebService {

    public List<Ingredientes> obtenerIngredientes();
    public Ingredientes obtenerIngredientePorId(Long id);
    public List<Ingredientes> obtenerIngredientesPorNombre(String nombre);
    public void guardarIngrediente(Ingredientes ingrediente);
    public void borrarIngredientePorId(Long id);
    
}
