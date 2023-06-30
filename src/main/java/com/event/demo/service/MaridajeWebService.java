package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.dto.MaridajePlatoVinoCategUva;
import com.event.demo.model.Maridaje;

@Service
public interface MaridajeWebService {

    // MaridajeRepo
    public List<Maridaje> obtenerMaridajes();
    public List<MaridajePlatoVinoCategUva> obtenerMaridajesPlatosVinos();
    public Maridaje obtenerMaridajePorId(Long id);
    public void guardarMaridaje(Maridaje maridaje);
    public void borrarMaridajePorId(Long id);
    
}
