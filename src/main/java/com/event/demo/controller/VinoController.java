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

import com.event.demo.dto.VinoCategUva;
import com.event.demo.dto.VinoDatos;
import com.event.demo.model.Vino;
import com.event.demo.service.VinoWebService;

@RestController
@RequestMapping("/vinos")
public class VinoController {

    @Autowired
    private VinoWebService vinoWebService;

    @GetMapping
    public ResponseEntity<List<Vino>> obtenerVinos() {
        List<Vino> vinos = vinoWebService.obtenerVinos();
        return ResponseEntity.ok(vinos);
    }
    
    @GetMapping("/datosCategUvas")
    public ResponseEntity<List<VinoCategUva>> obtenerVinosCategUvas() {
        List<VinoCategUva> vinos = vinoWebService.obtenerVinosCategUvas();
        return ResponseEntity.ok(vinos);
    }
    
    @GetMapping("/datosVino/{id}")
    public ResponseEntity<VinoDatos> obtenerVinoCategUvaPorId(@PathVariable("id") int id) {
        VinoDatos vinos = vinoWebService.obtenerVinoCategUvaPorId(id);
        return ResponseEntity.ok(vinos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vino> obtenerVinoPorId(@PathVariable("id") Long id) {
        Vino vino = vinoWebService.obtenerVinoPorId(id);
        if (vino != null) {
            return ResponseEntity.ok(vino);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

//    @GetMapping("/nombre/{nombre}")
//    public ResponseEntity<List<Vino>> obtenerVinosPorNombre(@PathVariable("nombre") String nombre) {
//        List<Vino> vinos = vinoWebService.obtenerVinosPorNombre(nombre);
//        return ResponseEntity.ok(vinos);
//    }

//    @GetMapping("/tipo/{tipo}")
//    public ResponseEntity<List<Vino>> obtenerVinosPorTipo(@PathVariable("tipo") String tipo) {
//        List<Vino> vinos = vinoWebService.obtenerVinosPorTipo(tipo);
//        return ResponseEntity.ok(vinos);
//    }

    @PostMapping
    public ResponseEntity<Void> guardarVino(@RequestBody Vino vino) {
        vinoWebService.guardarVino(vino);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarVinoPorId(@PathVariable("id") Long id) {
        vinoWebService.borrarVinoPorId(id);
        return ResponseEntity.ok().build();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Void> actualizarVino(@PathVariable Long id, @RequestBody Vino vino) {
   
        Vino vinoExistente = vinoWebService.obtenerVinoPorId(id);
        if (vinoExistente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
       vinoExistente.setAnno(vino.getAnno());
       vinoExistente.setBodega(vino.getBodega());
       vinoExistente.setNombre(vino.getNombre());
       vinoExistente.setVariedad(vino.getVariedad());
        
        vinoWebService.guardarVino(vinoExistente);     
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    
    
    @PostMapping("/{id}/imagen")
    public ResponseEntity<Void> guardarImagenVino(@PathVariable Long id, @RequestParam("imagen") MultipartFile imagen) {
    	Vino vinoExistente = vinoWebService.obtenerVinoPorId(id);
        if (vinoExistente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
        	vinoExistente.setImg(imagen.getBytes());
        	vinoWebService.guardarVino(vinoExistente); 
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    

    
}
