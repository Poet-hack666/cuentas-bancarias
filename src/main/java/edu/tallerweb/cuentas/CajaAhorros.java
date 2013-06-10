package edu.tallerweb.cuentas;

/**
 * Similar a la CuentaSueldo, pero se pide que luego de la quinta extracción de
 * dinero se cobre un costo adicional por extracción de $ 6
 */
public class CajaAhorros extends AbstractCuenta {

	/**
	 * No hay reglas adicionales para el depósito 
	 * @param monto
	 * a depositar
	 */

	private Double monto = 0.0;
	private Integer cantidaExtracciones = 0;
	private final  Double adicional = 6.0;

	public void depositar(final Double monto) {

		if (monto < 0.0) {
			throw new CuentaBancariaException(
					"No se puede depositar saldo negativo");
		}

		else {

			this.monto = this.monto + monto;
		}

	}

	/**
	 * Se cobran $6 adicionales por cada extracción luego de la quinta.
	 * @param monto
	 * a extraer
	 */
	public void extraer(final Double monto) {

		if (monto <= 0.0 || this.monto <= monto) {

			throw new CuentaBancariaException(
					"No se puede extraer saldo negativo");
		}

		else {
			this.cantidaExtracciones++;
		}

		if (this.cantidaExtracciones <= 5) {

			this.monto -= monto;
		} else {

			this.monto = this.monto - monto;
			this.monto -= this.adicional;

		}

	}

	/**
	 * Permite saber el saldo de la cuenta
	 * @return el saldo de la cuenta
	 */
	public Double getSaldo() {

		return this.monto;

	}

}
