package com.event.demo.service;

import java.util.List;

import com.event.demo.model.Ingredientes;
import com.event.demo.model.Maridaje;
import com.event.demo.model.Platos;
import com.event.demo.model.Vino;

public interface EventosWebService {
    // VinoRepo
    public List<Vino> obtenerVinos();
    public Vino obtenerVinoPorId(Long id);
    public List<Vino> obtenerVinosPorNombre(String nombre);
    public List<Vino> obtenerVinosPorAnio(int anio);
    public List<Vino> obtenerVinosPorPrecio(double precioMin, double precioMax);
    public void guardarVino(Vino vino);
    public void borrarVinoPorId(Long id);
    
    // PlatosRepo
    public List<Platos> obtenerPlatos();
    public Platos obtenerPlatoPorId(Long id);
    public List<Platos> obtenerPlatosPorNombre(String nombre);
    public List<Platos> obtenerPlatosPorTipo(String tipo);
    public void guardarPlato(Platos plato);
    public void borrarPlatoPorId(Long id);
    
    // IngredientesRepo
    public List<Ingredientes> obtenerIngredientes();
    public Ingredientes obtenerIngredientePorId(Long id);
    public List<Ingredientes> obtenerIngredientesPorNombre(String nombre);
    public void guardarIngrediente(Ingredientes ingrediente);
    public void borrarIngredientePorId(Long id);
    
    // MaridajeRepo
    public List<Maridaje> obtenerMaridajes();
    public Maridaje obtenerMaridajePorId(Long id);
    public List<Maridaje> obtenerMaridajesPorVino(Vino vino);
    public List<Maridaje> obtenerMaridajesPorPlato(Platos plato);
    public List<Maridaje> obtenerMaridajesPorIngredientes(List<Ingredientes> ingredientes);
    public void guardarMaridaje(Maridaje maridaje);
    public void borrarMaridajePorId(Long id);

}

