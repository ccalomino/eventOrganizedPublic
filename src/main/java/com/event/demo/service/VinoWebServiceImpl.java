package com.event.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.event.demo.dto.VinoCategUva;
import com.event.demo.dto.VinoDatos;
import com.event.demo.model.Vino;
import com.event.demo.repo.IVinoRepo;

@Service("vinoWebServiceImpl")
public class VinoWebServiceImpl implements VinoWebService {
    
    @Autowired
    private IVinoRepo vinoRepo;

    @Override
    public List<Vino> obtenerVinos() {
        return vinoRepo.findAll(Sort.by(Sort.Direction.ASC, "nombre"));
    }

    @Override
    public Vino obtenerVinoPorId(Long id) {
        return vinoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Vino> obtenerVinosPorNombre(String nombre) {
        return vinoRepo.findByNombreContainingIgnoreCase(nombre);
    }



//    @Override
//    public List<Vino> obtenerVinosPorPrecio(double precioMin, double precioMax) {
//        return vinoRepo.findByPrecioBetween(precioMin, precioMax);
//    }

    @Override
    public void guardarVino(Vino vino) {
        vinoRepo.save(vino);
    }

    @Override
    public void borrarVinoPorId(Long id) {
        vinoRepo.deleteById(id);
    }

	@Override
	public List<Vino> obtenerVinosPorAnio(int anio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VinoCategUva> obtenerVinosCategUvas() {
		
		return vinoRepo.buscarVinosCategUvas();
	}


	@Override
	public VinoDatos obtenerVinoCategUvaPorId(int id){
		return vinoRepo.buscarVinoCategUvaPorId(id);
	}
}
	
