package com.github.sanchezih.posicionamiento.indirecto;

public class Vendedor {

	private String legajo;
	private String nombre;

	/*----------------------------------------------------------------------------*/

	/**
	 * Constructor para inicializar un vendedor con legajo y nombre
	 * 
	 * @param legajo
	 * @param nombre
	 */
	public Vendedor(String legajo, String nombre) {
		this.legajo = legajo;
		this.nombre = nombre;
	}

	/*----------------------------------------------------------------------------*/

	public String getLegajo() {
		return legajo;
	}

	public String getNombre() {
		return nombre;
	}

}
