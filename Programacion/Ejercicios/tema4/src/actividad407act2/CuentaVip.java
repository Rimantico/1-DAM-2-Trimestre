package actividad407act2;

import actividad406.CuentaBancaria;

public class CuentaVip extends CuentaBancaria {
	
	// Atributos
	
	private boolean cuentaVIP;
	private final double  bonificacion = 0.01;
	
	// Constructor
	
	public CuentaVip(String titular, String numeroCuenta, boolean cuentaVIP ) {
		super(titular,numeroCuenta);
		this.cuentaVIP = cuentaVIP;
		
	}
	
	// Metodos
	
	public void bonificacion() {
		if(cuentaVIP == false) {
			System.out.println("Al no ser VIP no se aplica la bonificación");
		}else 
			if(getSaldo()>100000) {
				double suma = getSaldo()*bonificacion;
				int paso = (int) suma;
				ingresar(paso);
			}else
				System.out.println("Tu cuenta no cumple con los requisitos establecidos para recibir la bonificación");
		
	}
	
}
