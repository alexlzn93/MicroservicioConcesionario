package com.alexlzn.concesionario.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Coche implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "idconcesionario")
	private Concesionario concesionario;
	private String marca;
	private String modelo;
	private Integer precio;
	private String color;
	
	public Coche(Concesionario concesionario) {
		super();
		this.concesionario = concesionario;
	}
	public Coche() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coche(Concesionario concesionario, String marca, String modelo, Integer precio, String color) {
		super();
		this.concesionario = concesionario;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Concesionario getConcesionario() {
		return concesionario;
	}
	public void setConcesionario(Concesionario concesionario) {
		this.concesionario = concesionario;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Coche [concesionario=" + concesionario + ", marca=" + marca + ", modelo=" + modelo + ", precio="
				+ precio + ", color=" + color + "]";
	}
	
}
