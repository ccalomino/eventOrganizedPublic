package com.event.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.demo.dto.MaridajePlatoVinoCategUva;
import com.event.demo.model.Maridaje;
import com.event.demo.repo.IMaridajeRepo;

@Service("maridajeWebServiceImpl")
public class MaridajeWebServiceImpl implements MaridajeWebService{

	@Autowired
    private IMaridajeRepo maridajeRepo;


    @Override
    public List<Maridaje> obtenerMaridajes() {
        return maridajeRepo.findAll();
    }
    
    @Override
    public List<MaridajePlatoVinoCategUva> obtenerMaridajesPlatosVinos() {
        return maridajeRepo.findAllPlatosMaridajes();
    }

    @Override
    public Maridaje obtenerMaridajePorId(Long id) {
        return maridajeRepo.findById(id).orElse(null);
    }

 


    @Override
    public void guardarMaridaje(Maridaje maridaje) {
        maridajeRepo.save(maridaje);
    }

    @Override
    public void borrarMaridajePorId(Long id) {
        maridajeRepo.deleteById(id);
    }

}
