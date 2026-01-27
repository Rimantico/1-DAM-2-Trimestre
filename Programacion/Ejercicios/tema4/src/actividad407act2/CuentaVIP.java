package actividad407act2;

import cuentaBancaria.CuentaBancaria;

public class CuentaVIP extends CuentaBancaria {
	
	// Statics
	
	protected static final double BONIFICACION = 0.01;
	
	// Attributes 
	
	protected boolean cuentaVIP;
	
	
	// Constructor
	
	public CuentaVIP(String titular, String numeroCuenta, boolean cuentaVIP) {
		super(titular,numeroCuenta);
		this.cuentaVIP = cuentaVIP;
	}
	
	// Methods
	
	public void comprobarCuenta() {
		if(cuentaVIP == true) {
			if(saldo >= 1000000) {
				System.out.println("Aqui tienes una bonificación:");
				saldo = (int) ((saldo * BONIFICACION)+saldo);
			}else
				System.out.println("Esta cuenta no aspira a la bonificación");
		}else
			System.out.println("Tu cuenta no es VIP por lo tanto no optas a la bonificacion");
	}
	
	
}
