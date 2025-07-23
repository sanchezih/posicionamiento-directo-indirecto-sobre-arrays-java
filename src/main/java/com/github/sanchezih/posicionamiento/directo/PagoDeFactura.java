package com.github.sanchezih.posicionamiento.directo;

public class PagoDeFactura {

	private double importe;
	private String empresa;
	private int mes;

	/*----------------------------------------------------------------------------*/

	/**
	 * Constructor para inicializar los datos de un pago de factura.
	 * 
	 * @param importe Monto pagado.
	 * @param empresa Nombre de la empresa proveedora del servicio.
	 * @param mes     Numero del mes (1 a 12) en que se realizo el pago.
	 */
	public PagoDeFactura(double importe, String empresa, int mes) {
		this.importe = importe;
		this.empresa = empresa;
		this.mes = mes;
	}

	/*----------------------------------------------------------------------------*/

	/**
	 * Metodo para obtener el importe del pago
	 * 
	 * @return
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * Metodo para obtener el mes del pago
	 * 
	 * @return
	 */
	public int getMes() {
		return mes;
	}

}
