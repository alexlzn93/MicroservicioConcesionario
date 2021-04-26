package com.alexlzn.concesionario.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexlzn.concesionario.dao.IConcesionario_DAO;
import com.alexlzn.concesionario.entities.Coche;
import com.alexlzn.concesionario.entities.Concesionario;

import com.alexlzn.concesionario.interfaces.IConcesionario_SERVICE;

@Service
public class Concesionario_Service implements IConcesionario_SERVICE {
	
	@Autowired 
	private IConcesionario_DAO concesionarioDao;
	
	@Override
	public Concesionario getConcesionarioById(Integer id) {
		Optional<Concesionario> concesionarioID= concesionarioDao.findById(id);
		if (concesionarioID.isPresent()) {
			return concesionarioID.get();
		}
		return null;
	}

	@Override
	public List<Concesionario> getConcesionarios() {
		
		return concesionarioDao.findAll();
	}

	@Override
	public List<Coche> getCochesByIdConcesionario(Integer idConcesionario) {
		
		return concesionarioDao.findById(idConcesionario).get().getCoches();
	}

	@Override
	public Concesionario addConcesionario(Concesionario concesionario) {
		return concesionarioDao.save(concesionario);
		
	}

	@Override
	public void deleteConcesionarioById(Integer idConcesionario) {
		concesionarioDao.deleteById(idConcesionario);
		
	}

	

}
