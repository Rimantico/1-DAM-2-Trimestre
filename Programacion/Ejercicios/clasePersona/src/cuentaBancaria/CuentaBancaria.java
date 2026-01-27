package cuentaBancaria;

public class CuentaBancaria {
	protected String titular;
	protected String numeroCuenta;
	protected int saldo;

	public CuentaBancaria(String titular, String numeroCuenta) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
	}

	public int ingresar(int cantidad) {
		saldo += cantidad;
		return saldo;
	}

	public int retirar(int cantidad) {
		if (cantidad > saldo) {
			System.err.println("No puedes retirar una cantidad mayor a la que tienes, introduzca otra cantidad");
		} else {
			saldo = saldo - cantidad;
			return saldo;
		}

		return saldo;
	}

	/**
	 * @return the titular
	 */
	public String getTitular() {
		return titular;
	}

	/**
	 * @param titular the titular to set
	 */
	public void setTitular(String titular) {
		this.titular = titular;
	}

	/**
	 * @return the numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	/**
	 * @param numeroCuenta the numeroCuenta to set
	 */
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	/**
	 * @return the saldo
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		System.out.println("Numero de cuenta: " + numeroCuenta);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo actual: " + saldo);
		return super.toString();
	}
}
