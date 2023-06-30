package com.event.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.demo.model.Ingredientes;
import com.event.demo.service.IngredientesWebService;


@RestController
@RequestMapping("/ingredientes")
public class IngredientesController {

	@Autowired
    private IngredientesWebService ingredientesWebService;



    @GetMapping("/")
    public List<Ingredientes> obtenerIngredientes() {
        return ingredientesWebService.obtenerIngredientes();
    }

    @GetMapping("/{id}")
    public Ingredientes obtenerIngredientePorId(@PathVariable Long id) {
        return ingredientesWebService.obtenerIngredientePorId(id);
    }

    @GetMapping("/nombre/{nombre}")
    public List<Ingredientes> obtenerIngredientesPorNombre(@PathVariable String nombre) {
        return ingredientesWebService.obtenerIngredientesPorNombre(nombre);
    }



    @PostMapping
    public void guardarIngrediente(@RequestBody Ingredientes ingrediente) {
        ingredientesWebService.guardarIngrediente(ingrediente);
    }

    @DeleteMapping("/{id}")
    public void borrarIngredientePorId(@PathVariable Long id) {
        ingredientesWebService.borrarIngredientePorId(id);
    }
}
