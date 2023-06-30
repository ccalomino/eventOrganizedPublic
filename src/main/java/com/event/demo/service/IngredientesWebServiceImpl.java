package com.event.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.demo.model.Ingredientes;
import com.event.demo.repo.IIngredientesRepo;

@Service("ingredientesWebServiceImpl")
public class IngredientesWebServiceImpl implements IngredientesWebService {

	@Autowired
    private IIngredientesRepo ingredientesRepo;


	@Override
    public List<Ingredientes> obtenerIngredientes() {
        return ingredientesRepo.findAll();
    }

	@Override
    public Ingredientes obtenerIngredientePorId(Long id) {
        return ingredientesRepo.findById(id).orElse(null);
    }

	@Override
    public List<Ingredientes> obtenerIngredientesPorNombre(String nombre) {
        return ingredientesRepo.findByNombreContainingIgnoreCase(nombre);
    }



	@Override
    public void guardarIngrediente(Ingredientes ingrediente) {
        ingredientesRepo.save(ingrediente);
    }

	@Override
    public void borrarIngredientePorId(Long id) {
        ingredientesRepo.deleteById(id);
    }
}
