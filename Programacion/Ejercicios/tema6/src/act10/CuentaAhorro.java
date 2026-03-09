package act10;

public class CuentaAhorro extends CuentaBancaria{
	
	public CuentaAhorro(int numCuenta, String titular, double saldo) {
		super(numCuenta, titular, saldo);
		
		
	}

	public void calcularComision() {
		double comision = 0.05;
		saldo = (saldo * comision) + saldo;		
	}
}
