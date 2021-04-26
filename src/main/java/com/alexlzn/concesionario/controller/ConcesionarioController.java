package com.alexlzn.concesionario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alexlzn.concesionario.entities.Coche;
import com.alexlzn.concesionario.entities.Concesionario;
import com.alexlzn.concesionario.service.Concesionario_Service;

@RestController
public class ConcesionarioController {

	@Autowired
	private Concesionario_Service concesionarioService;
	@GetMapping("/concesionarios")
	public List<Concesionario> getConcesionarios(){
		
		return concesionarioService.getConcesionarios();
	}
	@GetMapping("/concesionarios/{id}")
	public Concesionario getConcesionarioByID(@PathVariable Integer id){
		
		return concesionarioService.getConcesionarioById(id);
	}
	//Lista de Coches por el id del Concesionario
	@GetMapping("/cochesIdConcesionario/{idconcesionario}")
	public List<Coche> getCochesByIdConcesionario(@PathVariable("idconcesionario") Integer idConcesionario){
		System.out.println("ID Concesionario: " + idConcesionario);
		return concesionarioService.getCochesByIdConcesionario(idConcesionario);
	}
	//Añadiendo uun nuevo Concesionario 
	@PostMapping("/crearConcesionario")
	public Concesionario saveConcesionario(@RequestBody Concesionario concesionario) {
		
		return concesionarioService.addConcesionario(concesionario);
	}
	@DeleteMapping("/borrarConcesionario/{id}")
	public void borrarConcesionarioID(@PathVariable("id") Integer idConcesionario) {
		 concesionarioService.deleteConcesionarioById(idConcesionario);
	}
	
}
