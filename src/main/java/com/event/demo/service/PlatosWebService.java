package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.model.Platos;

@Service
public interface PlatosWebService {

    // PlatosRepo
    public List<Platos> obtenerPlatos();
    public Platos obtenerPlatoPorId(Long id);
    public void guardarPlato(Platos plato);
    public void borrarPlatoPorId(Long id);
    public List<Platos> obtenerPlatosOrdenados();
    
}
