package com.github.sanchezih.posicionamiento.directo;

public class Main {

	public static void main(String[] args) {

		Historial historial = new Historial();

		// Pagos realizados en el mes de enero (mes 1)
		historial.acumularGasto(new PagoDeFactura(5000, "Fibertel", 1));
		historial.acumularGasto(new PagoDeFactura(3000, "Netflix", 1));

		// Pagos realizados en el mes de febrero (mes 2)
		historial.acumularGasto(new PagoDeFactura(5000, "Fibertel", 2));
		historial.acumularGasto(new PagoDeFactura(3000, "Netflix", 2));

		// Pagos realizados en el mes de marzo (mes 3)
		historial.acumularGasto(new PagoDeFactura(6500, "Fibertel", 3));
		historial.acumularGasto(new PagoDeFactura(3200, "Netflix", 3));

		// Mostrar los gastos acumulados por cada mes
		historial.mostrarGastosMensuales();

	}

}
