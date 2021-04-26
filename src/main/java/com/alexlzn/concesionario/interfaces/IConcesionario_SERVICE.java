package com.alexlzn.concesionario.interfaces;

import java.util.List;

import com.alexlzn.concesionario.entities.Coche;
import com.alexlzn.concesionario.entities.Concesionario;

public interface IConcesionario_SERVICE {

	Concesionario getConcesionarioById(Integer id);
	List<Concesionario> getConcesionarios();
	List<Coche> getCochesByIdConcesionario(Integer idConcesionario);
	Concesionario addConcesionario(Concesionario concesionario);
	
	
}
