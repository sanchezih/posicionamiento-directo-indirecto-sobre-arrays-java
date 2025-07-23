package com.github.sanchezih.posicionamiento.directo;

import com.github.sanchezih.util.ds.UtilArrays;

public class Historial {

	private static final int CANT_MESES = 12;

	// Array que almacena el gasto acumulado por cada mes.
	// La posicion 0 corresponde a enero, 1 a febrero, etc.
	private double[] gastosMensuales = new double[CANT_MESES];

	/*----------------------------------------------------------------------------*/

	/**
	 * Metodo para acumular el gasto de una factura en el mes correspondiente.
	 * 
	 * @param pagoDeFactura Objeto que contiene el importe, empresa y mes del pago.
	 */
	public void acumularGasto(PagoDeFactura pagoDeFactura) {
		// Acceso directo al array usando el mes menos 1 como indice para acumular
		// importe
		this.gastosMensuales[pagoDeFactura.getMes() - 1] += pagoDeFactura.getImporte();
	}

	/**
	 * Metodo para mostrar los gastos mensuales almacenados.
	 */
	public void mostrarGastosMensuales() {
		// Uso de un metodo auxiliar para imprimir el array
		UtilArrays.mostrar(this.gastosMensuales);
	}
}
