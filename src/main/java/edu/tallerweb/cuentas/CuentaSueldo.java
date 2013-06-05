package edu.tallerweb.cuentas;

/**
 * Es el tipo de cuenta más simple, ya que se rige por la premisa
 * de que en tanto y en cuanto se tenga tanto o más dinero en
 * cuenta del que se quiere extraer, la operación se debe efectuar
 * correctamente.
 */
public class CuentaSueldo {

	/**
	 * No hay reglas adicionales para el depósito
	 * @param monto a depositar
	 */
	public Double monto;

	
	public void depositar(final Double monto) {
		/*throw new RuntimeException("No implementado aún");*/
		
		
		this.monto=monto;
		
		
	}

	/**
	 * No hay reglas adicionales para la extracción
	 * @param monto a extraer
	 */
	public void extraer(final Double monto) {

		if (this.monto < monto) {
			throw new CuentaBancariaException("Algo");
			
		}
		
		
		
	this.monto=this.monto-monto;
	
	
	
	}

	/**
	 * Permite saber el saldo de la cuenta
	 * @return el saldo de la cuenta
	 */
	public Double getSaldo() {
	//	throw new RuntimeException("No implementado aún");
	
	return monto;
	
	
	}

}
