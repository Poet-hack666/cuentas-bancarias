package edu.tallerweb.cuentas;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTests {

	@Test
	public void queVerifiqueLaConsigna() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(4000.0);
		cuenta.extraer(500.0);
	
		Assert.assertEquals("al extraer $ 500.0 de una cuenta con $ 4000.0 se obtienen $ 3500.0",
				3500.0, cuenta.getSaldo(), 0.0);
	}
	
	
	@Test(expected=CuentaBancariaException.class)
	public void queNosePuedaRetirarDeCuentaSueldoSaldoNegativo() {
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(3500.0);

		cuenta.extraer(4000.0);
	}

	
	
	
	
	@Test
	public void queVerifiqueCajaAhorroRestaLos6Pesos() {
		CajaAhorros cuenta = new CajaAhorros();
		cuenta.depositar(4000.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		cuenta.extraer(100.0);
		
	
		
		
		Assert.assertEquals("al extraer $ 600.0 de una cuenta con $ 4000.0 se obtienen $ 3.0",
				3394.0, cuenta.getSaldo(), 0.0);
	}
	
	
	@Test(expected=CuentaBancariaException.class)
	public void queNoSePuedaRetirarDeLaCajaDeAhorrosSiNoTengoSaldo(){
		
	CuentaSueldo cuenta = new CuentaSueldo(); 
		
	cuenta.depositar(50.0);
	
	cuenta.extraer(100.0);
	
	
		

		
	}

	




@Test

public void quePuedaDepositarEnLaCuentaCorriente(){
	
CuentaCorriente cuenta=new CuentaCorriente(500.0);
	cuenta.depositar(200.0);
	Assert.assertEquals("si  deposito  200 pesos,obtendre 200 de saldo ",200.0,cuenta.getSaldo(),0.0);

}


@Test

public void quePuedaRetirarDinero(){
	
CuentaCorriente cuenta=new CuentaCorriente(500.0);
	cuenta.depositar(200.0);
	cuenta.extraer(100.0);
	Assert.assertEquals("si  deposito  200 pesos,y quito 100 obtendre 100 de saldo ",100.0,cuenta.getSaldo(),0.0);

}

@Test

public void quePuedaRetirarDineroDescubierto(){
	
CuentaCorriente cuenta=new CuentaCorriente(500.0);
	
	cuenta.extraer(100.0);
	Assert.assertEquals("si   quito 100 obtendre 375 de descubierto ",395.0,cuenta.getDescubierto(),0.0);

}




@Test

public void quePuedaDepositarEnElDescubierto()
{
	CuentaCorriente cuenta=new CuentaCorriente(100.0);
	
	cuenta.extraer(10.0);
	cuenta.depositar(10.0);
	Assert.assertEquals("si mi descubierto es de 100 y luego retiro 10,se restaran 15 al descubierto,y al depositar 10 tendre 95",99.5,cuenta.getDescubierto(),0.0);

}











}





	
	

