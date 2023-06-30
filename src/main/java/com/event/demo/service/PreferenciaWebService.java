package com.event.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.event.demo.model.Preferencia;

@Service
public interface PreferenciaWebService {

	// Obtener preferencias
	 public List<Preferencia> obtenerPreferencias();
}
