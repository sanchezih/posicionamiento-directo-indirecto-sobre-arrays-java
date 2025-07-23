package com.github.sanchezih.posicionamiento.indirecto;

public class Venta {

	private String fecha;
	private double importe;
	private String legajoVendedor;

	/*----------------------------------------------------------------------------*/

	public Venta(String fecha, double importe, String legajoVendedor) {
		this.fecha = fecha;
		this.importe = importe;
		this.legajoVendedor = legajoVendedor;
	}

	/*----------------------------------------------------------------------------*/

	public double getImporte() {
		return importe;
	}

	public String getLegajoVendedor() {
		return legajoVendedor;
	}

}
