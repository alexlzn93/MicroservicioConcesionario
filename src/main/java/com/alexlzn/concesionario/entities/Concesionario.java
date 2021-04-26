package com.alexlzn.concesionario.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Concesionario {
	@Id @GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String direccion;
	@OneToMany(mappedBy = "concesionario")
	@JsonIgnore
	private List<Coche> coches;
	
	
	public Concesionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Concesionario(Integer id, String nombre, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public List<Coche> getCoches() {
		return coches;
	}
	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Concesionario [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

}
