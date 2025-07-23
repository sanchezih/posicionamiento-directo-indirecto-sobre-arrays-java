package com.github.sanchezih.posicionamiento.indirecto;

public class Empresa {

	private static final int CANT_EMPLEADOS = 8;

	// Array que almacena los vendedores
	private Vendedor[] vendedores = new Vendedor[CANT_EMPLEADOS];

	/*----------------------------------------------------------------------------*/

	/**
	 * Metodo para asignar el array de vendedores a la empresa
	 * 
	 * @param vendedores
	 */
	public void setVendedores(Vendedor[] vendedores) {
		this.vendedores = vendedores;
	}

	/**
	 * Metodo para mostrar la venta realizada indicando el nombre del vendedor
	 * 
	 * @param venta Venta realizada con legajo del vendedor
	 */
	public void mostrarVenta(Venta venta) {

		Vendedor vendedor = null;

		// Se busca el vendedor en el array por su legajo (clave)
		vendedor = buscarVendedor(venta.getLegajoVendedor());

		if (vendedor != null) {
			System.out.println(vendedor.getNombre() + " vendio un monto de $" + venta.getImporte());
		} else {
			System.out.println("Vendedor desconocido");
		}
	}

	/**
	 * Metodo privado para buscar un vendedor por legajo
	 * 
	 * @param legajo Legajo del vendedor a buscar
	 * @return Vendedor si se encuentra, null si no
	 */
	private Vendedor buscarVendedor(String legajo) {

		int i = 0;
		Vendedor vendedorEncontrado = null;

		// Bucle para buscar secuencialmente el vendedor por legajo
		while (i < this.vendedores.length && vendedorEncontrado == null) {

			// Para comparar strings se debe usar equals en lugar de ==
			if (this.vendedores[i].getLegajo().equals(legajo)) {
				vendedorEncontrado = this.vendedores[i];
			} else {
				i++;
			}
		}

		return vendedorEncontrado;
	}

}
