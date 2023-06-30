package com.event.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.demo.model.Preferencia;
import com.event.demo.repo.IPreferenciaRepo;

@Service("preferenciaWebServiceImpl")
public class PreferenciaWebServiceImpl implements PreferenciaWebService{

    @Autowired
    private IPreferenciaRepo preferenciaRepo;

    @Override
    public List<Preferencia> obtenerPreferencias() {
        return preferenciaRepo.findAll();
    }
    
}
