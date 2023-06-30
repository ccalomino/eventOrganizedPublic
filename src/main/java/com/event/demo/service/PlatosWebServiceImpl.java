package com.event.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.event.demo.model.Platos;
import com.event.demo.repo.IPlatosRepo;

@Service("platosWebServiceImpl")
public class PlatosWebServiceImpl implements PlatosWebService {

    @Autowired
    private IPlatosRepo platosRepo;

    @Override
    public List<Platos> obtenerPlatos() {
        return platosRepo.findAll();
    }

    @Override
    public Platos obtenerPlatoPorId(Long id) {
        return platosRepo.findById(id).orElse(null);
    }



    @Override
    public void guardarPlato(Platos plato) {
        platosRepo.save(plato);
    }



	@Override
	public void borrarPlatoPorId(Long id) {
		platosRepo.deleteById(id);	
	}

	
	public List<Platos> obtenerPlatosOrdenados() {
	    Sort sort = Sort.by(Sort.Direction.ASC, "categoria", "nombre");
	    return platosRepo.findAll(sort);
	}


}

