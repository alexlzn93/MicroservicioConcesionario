package com.alexlzn.concesionario.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexlzn.concesionario.entities.Concesionario;

public interface IConcesionario_DAO extends JpaRepository<Concesionario, Integer> {

}
