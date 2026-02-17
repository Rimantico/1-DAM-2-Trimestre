package examenTema4b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cohete {

	// Clase hecha por: Juan Gómez Ruiz

	// Enumerators

	public enum TipoCombustible {
		HIDROGENOLIQUIDO, QUEROSENO, METANO;
	}

	public enum TipoEncendido {
		HIPERGOLICO, PRIOGENICO, ELECTRICO;
	}

	// Attributes

	protected String nombre;
	protected String codigo;
	protected TipoCombustible combustible;
	protected TipoEncendido encendido;
	protected boolean motorEncendido;

	// Constructor

	public Cohete(String nombre, String codigo, TipoCombustible combustible, TipoEncendido encendido,
			boolean motorEncendido) {
		this.nombre = nombre;
		setCodigo(codigo);
		if (combustible.equals(TipoCombustible.HIDROGENOLIQUIDO) || combustible.equals(TipoCombustible.METANO)
				|| combustible.equals(TipoCombustible.QUEROSENO)) {
			this.combustible = combustible;
		} else
			System.out.println("Combustible incorrecto: " + combustible);
		if (encendido.equals(TipoEncendido.ELECTRICO) || encendido.equals(TipoEncendido.HIPERGOLICO)
				|| encendido.equals(TipoEncendido.PRIOGENICO)) {
			this.encendido = encendido;
		} else
			System.out.println("Encendido incorrecto;: " + encendido);
		this.motorEncendido = motorEncendido;
	}

	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoCombustible getCombustible() {
		return combustible;
	}

	public void setCombustible(TipoCombustible combustible) {
		this.combustible = combustible;
	}

	public TipoEncendido getEncendido() {
		return encendido;
	}

	public void setEncendido(TipoEncendido encendido) {
		this.encendido = encendido;
	}

	public boolean isMotorEncendido() {
		return motorEncendido;
	}

	public void setMotorEncendido(boolean motorEncendido) {
		this.motorEncendido = motorEncendido;
	}

	// Methods

	public void setCodigo(String codigo) {
		String codigoRegex = "^[A-Z]{4}\\s[0-9]{6}\\s[0-9]{2}$";

		Pattern codigoPatron = Pattern.compile(codigoRegex);
		Matcher coincidir = codigoPatron.matcher(codigo);

		if (coincidir.matches()) {
			this.codigo = codigo;
		} else {
			System.out.println("Codigo incorrecto : " + codigo);
		}

	}

	public void encenderMotor() {
		setMotorEncendido(true);
		System.out.println("El motor ha sido encendido");
	}

	public void apagarMotor() {
		setMotorEncendido(false);
		System.out.println("El motor ha sido apagado");
	}

	@Override
	public String toString() {

		return "Nombre: " + nombre + "\nCódigo: " + codigo + "\nCombustible: " + combustible + "\nEncendido: "
				+ encendido + "\nMotor Encendido: " + motorEncendido;
	}

}
