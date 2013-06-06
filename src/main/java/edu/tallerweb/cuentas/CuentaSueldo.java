package edu.tallerweb.cuentas;

public class CuentaSueldo {

	public Double monto=0.0;

	public void CuentaSueldo(final Double monto)
	{
		this.monto=monto;
		
		
		
	}
	
	
	public void depositar(final Double monto) {
		
		if(monto<0)
		{
			throw new CuentaBancariaException("No se puede depositar saldo negativo");
			
			
		}
		
		
		
		this.monto=this.monto+monto;
		
		
	}

	
	public void extraer(final Double monto) {

		if (this.monto < monto) {
			throw new CuentaBancariaException("No se puede extraer saldo negativo");
			
		}
		else
		{
			this.monto=this.monto-monto;
		}
	
	
	}


	public Double getSaldo() {
	
	return monto;
	
	
	}

}
