package edu.tallerweb.cuentas;

/**
 * Similar a la CuentaSueldo, pero se pide que luego de la quinta extracción de
 * dinero se cobre un costo adicional por extracción de $ 6
 */
public class CajaAhorros extends AbstractCuenta {

	/**
	 * No hay reglas adicionales para el depósito
	 * 
	 * @param monto
	 *            a depositar
	 */

	private Double monto = 0.0;
	private Integer cant_extracciones = 0;

	public void depositar(final Double monto) {

		if (monto < 0.0) {
			throw new CuentaBancariaException(
					"No se puede depositar saldo negativo");

		}

		this.monto = this.monto + monto;

	}

	/**
	 * Se cobran $6 adicionales por cada extracción luego de la quinta.
	 * 
	 * @param monto
	 *            a extraer
	 */
	public void extraer(final Double monto) {

		if (monto < 0.0) {

			throw new CuentaBancariaException(
					"No se puede extraer saldo negativo");

		}

		if (this.monto < monto) {
			throw new CuentaBancariaException(
					"No se puede extraer dinero si no existe en el saldo");

		}
		{
		this.cant_extracciones++;

		if (this.cant_extracciones > 5) {
			this.monto = this.monto - monto - 6.0;

		} else {
			this.monto -= monto;

		}
		}
	}

	/**
	 * Permite saber el saldo de la cuenta
	 * 
	 * @return el saldo de la cuenta
	 */
	public Double getSaldo() {

		return this.monto;

		// throw new RuntimeException("No implementado aún");
	}

}
