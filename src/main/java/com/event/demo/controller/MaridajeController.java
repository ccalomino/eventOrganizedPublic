package com.event.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.event.demo.dto.MaridajePlatoVinoCategUva;
import com.event.demo.model.Maridaje;
import com.event.demo.service.MaridajeWebService;

@RestController
@RequestMapping("/maridajes")
public class MaridajeController {

	@Autowired
    private MaridajeWebService maridajeWebService;

    
    @GetMapping
    public ResponseEntity<List<Maridaje>> obtenerMaridajes() {
    	List<Maridaje> maridajes = maridajeWebService.obtenerMaridajes();
        return ResponseEntity.ok(maridajes);
    }
    
    @GetMapping("/maridajePlatosVinos")
    public ResponseEntity<List<MaridajePlatoVinoCategUva>> obtenerMaridajesPlatosVinos() {
    	List<MaridajePlatoVinoCategUva> maridajes = maridajeWebService.obtenerMaridajesPlatosVinos();
        return ResponseEntity.ok(maridajes);
    }



    @GetMapping("/{id}")
    public ResponseEntity<Maridaje> obtenerMaridajePorId(@PathVariable("id") Long id) {
    	Maridaje maridaje = maridajeWebService.obtenerMaridajePorId(id);
        if (maridaje != null) {
            return ResponseEntity.ok(maridaje);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PostMapping
    public void guardarMaridaje(@RequestBody Maridaje maridaje) {
        maridajeWebService.guardarMaridaje(maridaje);
    }

    @DeleteMapping("/{id}")
    public void borrarMaridajePorId(@PathVariable Long id) {
        maridajeWebService.borrarMaridajePorId(id);
    }
}
