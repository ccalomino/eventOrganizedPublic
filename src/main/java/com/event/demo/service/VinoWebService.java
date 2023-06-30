package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.dto.VinoCategUva;
import com.event.demo.dto.VinoDatos;
import com.event.demo.model.Vino;

@Service
public interface VinoWebService {

    // VinoRepo
    public List<Vino> obtenerVinos();
    public Vino obtenerVinoPorId(Long id);
    public List<Vino> obtenerVinosPorNombre(String nombre);
    public List<Vino> obtenerVinosPorAnio(int anio);
//    public List<Vino> obtenerVinosPorPrecio(double precioMin, double precioMax);
    public void guardarVino(Vino vino);
    public void borrarVinoPorId(Long id);
    public List<VinoCategUva> obtenerVinosCategUvas();
    public VinoDatos obtenerVinoCategUvaPorId(int id);
}
