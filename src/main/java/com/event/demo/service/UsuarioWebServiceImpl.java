package com.event.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.demo.model.Usuario;
import com.event.demo.repo.IUsuarioRepo;

@Service("usuarioWebServiceImpl")
public class UsuarioWebServiceImpl implements UsuarioWebService {

    @Autowired
    private IUsuarioRepo usuarioRepo;

    @Override
    public List<Usuario> obtenerUsuarios() {
        return usuarioRepo.findAll();
    }


}


