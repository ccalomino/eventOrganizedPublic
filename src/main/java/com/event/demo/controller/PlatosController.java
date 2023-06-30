package com.event.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.event.demo.model.Platos;
import com.event.demo.service.PlatosWebService;

@RestController
@RequestMapping("/platos")
public class PlatosController {

    @Autowired
    private PlatosWebService platosWebService;

    @GetMapping
    public ResponseEntity<List<Platos>> obtenerPlatos() {
        List<Platos> platos = platosWebService.obtenerPlatosOrdenados();
        return ResponseEntity.ok(platos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Platos> obtenerPlatoPorId(@PathVariable Long id) {
        Platos plato = platosWebService.obtenerPlatoPorId(id);
        if (plato != null) {
            return new ResponseEntity<>(plato, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

//    @GetMapping("/buscarPorNombre")
//    public ResponseEntity<List<Platos>> obtenerPlatosPorNombre(@RequestParam String nombre) {
//        List<Platos> platos = platosWebService.obtenerPlatosPorNombre(nombre);
//        return new ResponseEntity<>(platos, HttpStatus.OK);
//    }
//
//    @GetMapping("/buscarPorTipo")
//    public ResponseEntity<List<Platos>> obtenerPlatosPorTipo(@RequestParam String tipo) {
//        List<Platos> platos = platosWebService.obtenerPlatosPorTipo(tipo);
//        return new ResponseEntity<>(platos, HttpStatus.OK);
//    }

    @PostMapping("/")
    public ResponseEntity<Void> guardarPlato(@RequestBody Platos plato) {
        platosWebService.guardarPlato(plato);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarPlato(@PathVariable Long id, @RequestBody Platos plato) {
   
        Platos platoExistente = platosWebService.obtenerPlatoPorId(id);
        if (platoExistente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        platoExistente.setNombre(plato.getNombre());
        platoExistente.setDescripcion(plato.getDescripcion());
   
        platoExistente.setPrecio(plato.getPrecio());
        platoExistente.setCategoria(plato.getCategoria());
        
        platosWebService.guardarPlato(platoExistente);     
        return new ResponseEntity<>(HttpStatus.OK);
    }

    
    
    @PostMapping("/{id}/imagen")
    public ResponseEntity<Void> guardarImagen(@PathVariable Long id, @RequestParam("imagen") MultipartFile imagen) {
    	Platos platoExistente = platosWebService.obtenerPlatoPorId(id);
        if (platoExistente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
        	platoExistente.setImagen(imagen.getBytes());
        	platosWebService.guardarPlato(platoExistente); 
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
    
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarPlatoPorId(@PathVariable Long id) {
        platosWebService.borrarPlatoPorId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

