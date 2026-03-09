package act10;

public final class CuentaCorriente extends CuentaBancaria {

	// Constructor

	public CuentaCorriente(int numCuenta, String titular, int saldo) {
		super(numCuenta, titular, saldo);
	}

	@Override
	public void calcularComision() {
		double comision = 0.03;
		saldo = (saldo * comision) + saldo;
	}

}
