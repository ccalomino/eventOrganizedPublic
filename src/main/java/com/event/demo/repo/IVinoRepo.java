package com.event.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.event.demo.dto.VinoCategUva;
import com.event.demo.dto.VinoDatos;
import com.event.demo.model.Vino;

@Repository
public interface IVinoRepo extends JpaRepository<Vino, Long> {

   // Método para buscar vinos por su nombre
    List<Vino> findByNombreContainingIgnoreCase(String nombre);
   
  //------------------------------------------------------------------------------------------  
  // Método para buscar vinos con info de Categ y Uvas
    @Query(value="select v.id, u.nombre, u.color, c.clasificacion, c.tiempo_total, v.nombre as \\\"nombreVino\\\", v.bodega, v.region, v.anno, v.img "
    		+ "from vinos v, categoriavinos c, uvavinos u "
    		+ "where v.categoria_id = c.id and v.uva_id = u.id order by u.nombre, v.nombre",nativeQuery = true)
    List<VinoCategUva> buscarVinosCategUvas();
  //------------------------------------------------------------------------------------------

    
    //------------------------------------------------------------------------------------------  
    // Método para buscar vinos con info de Categ y Uvas
      @Query(value="select 	v.id, u.nombre as \"uva\", u.color as \"colorUva\", u.descripcion as \"descripcionUva\","
      		+ "	c.clasificacion, c.color as \"color\", c.tiempo_barrica, c.tiempo_botella, c.tiempo_total,"
      		+ "	v.nombre as \"nombreVino\", v.bodega, v.region, v.anno, v.img, v.sabor, v.variedad "
      		+ "from vinos v, categoriavinos c, uvavinos u "
      		+ "where v.id =:id and v.categoria_id = c.id and v.uva_id = u.id "
      		+ "order by u.nombre, v.nombre",nativeQuery = true)
     VinoDatos buscarVinoCategUvaPorId(@Param("id") int id);
    //------------------------------------------------------------------------------------------

}
