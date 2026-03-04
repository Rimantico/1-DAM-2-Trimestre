package act10;

public abstract class CuentaBancaria {

	// Attributes
	
	protected int numCuenta;
	protected String titular;
	protected int saldo;
	
	public CuentaBancaria(int numCuenta, String titular, int saldo) {
		this.numCuenta = numCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	// Methods
	
	public abstract void calcularComision();
	
	public void ingresar(int ingreso) {
		saldo = saldo +ingreso;
		System.out.println("Has ingresado " + ingreso + "€");
	}
	
	
	public void retirar(int retirar) throws SaldoInsuficienteException{
		if(retirar> saldo) {
			throw new SaldoInsuficienteException("No tienes suficiente saldo");
		}else
			saldo = saldo - retirar;	
	}
	
	public void mostrarDatos() {
		System.out.println("Numero de Cuenta: " + numCuenta);
		System.out.println("Titular de la Cuenta: " + titular);
		System.out.println("Saldo de la cuenta: " + saldo);
	}
	
	
}
