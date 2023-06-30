package com.event.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.demo.model.Bebida;


@Repository
public interface IBebidaRepo extends JpaRepository<Bebida, Integer>{

	 List<Bebida> findByNombre(String nombre);
	
	 List<Bebida> findByAlcoholica(boolean alcoholica);
	 
	 
}
