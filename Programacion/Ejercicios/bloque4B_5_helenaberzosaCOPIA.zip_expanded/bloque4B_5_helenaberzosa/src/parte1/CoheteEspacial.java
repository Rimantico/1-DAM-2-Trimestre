package parte1;

import java.util.regex.*;

public class CoheteEspacial {

	// ATRIBUTOS
	protected String nombre;
	protected String codigo = "^[A-Z]{4}+\\s+[0-9]{6}+\\s+[0-9]{2}$";
	protected String tipoCombustible;
	protected String tipoEncendido;

	// ENUMS
	enum tipoCombustible {
		HIDROGENOLIQUIDO, QUEROSENOREFINADO, METANOLIQUIDO
	}

	enum tipoEncendido {
		HIPERGOLICO, PIROGENICO, ELECTRICO
	}

	// CONSTRUCTOR
	public CoheteEspacial(String nombre, String codigo, String tipoCombustible, String tipoEncendido) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.tipoCombustible = tipoCombustible;
		this.tipoEncendido = tipoEncendido;
	}

	// MÉTODOS GETTERS & SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public String getTipoEncendido() {
		return tipoEncendido;
	}

	public void setTipoEncendido(String tipoEncendido) {
		this.tipoEncendido = tipoEncendido;
	}

	// MÉTODOS
	public void visualizarDatos() {
		System.out.println("Nombre: " + nombre + " - Código: " + codigo + " - Tipo de combustible: " + tipoCombustible
				+ " - Tipo de encendido: " + tipoEncendido + ".");
	}

	public void encenderMotor() {
		System.out.println("El motor se ha encendido.");
	}

	public void apagarMotor() {
		System.out.println("El motor se ha apagado.");
	}

}
