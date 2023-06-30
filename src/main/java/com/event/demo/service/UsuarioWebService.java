package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.model.Usuario;

@Service
public interface UsuarioWebService {

    // UsuarioRepo
    public List<Usuario> obtenerUsuarios();

    
}