package com.event.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.event.demo.dto.MaridajePlatoVinoCategUva;
import com.event.demo.model.Maridaje;

@Repository
public interface IMaridajeRepo extends JpaRepository<Maridaje, Long> {

   
    // Consulta para obtener los platos junto con su maridaje, detallando categoria, uva y un vino como ejemplo
    @Query(value="select p.nombre as \\\"nombrePlato\\\", p.categoria as \\\"categoriaPlato\\\", u.nombre as \\\"nombreUva\\\", v.nombre as \\\"nombreVino\\\", v.bodega, p.imgagen as \\\"i1\\\", v.img as \\\"i2\\\", p.imgagen as \\\"i11\\\""
    		+ "from maridaje m, platos p, vinos v, categoriavinos c, uvavinos u "
    		+ "where m.plato_id = p.id and m.vino_id = v.id and v.categoria_id = c.id and v.uva_id = u.id "
    		+ "order by u.nombre, v.nombre",nativeQuery = true)
    List<MaridajePlatoVinoCategUva> findAllPlatosMaridajes();
    


}

