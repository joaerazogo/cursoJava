package com.novellius;

import org.springframework.beans.factory.annotation.Autowired;

public class Administrador {

	private int idAd;
	private String nombre;
	
	//Yo puedo anotar esta propiedad que deseo inyectar
	  //nos va a servir para que la dependencia de Dirección sea inyectada por spring 
	private Direccion direccion; //propiedad
	
	public Administrador() {
		
	}
	
	public Administrador(int idAd, String nombre) {
		this.idAd = idAd;
		this.nombre = nombre;
	}
	
	//Yo puedo anotar este set de la propiedad que deseo inyectar
	@Autowired
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	public void imprimirDireccion() {
		System.out.println("Encino 2989");
	}
}
