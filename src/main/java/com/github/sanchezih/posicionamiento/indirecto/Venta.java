package com.github.sanchezih.posicionamiento.indirecto;

public class Venta {

	private String fecha;
	private double importe;
	private String legajoVendedor;

	/*----------------------------------------------------------------------------*/

	/**
	 * Constructor para inicializar una venta con fecha, importe y legajo del
	 * vendedor
	 * 
	 * @param fecha
	 * @param importe
	 * @param legajoVendedor
	 */
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
