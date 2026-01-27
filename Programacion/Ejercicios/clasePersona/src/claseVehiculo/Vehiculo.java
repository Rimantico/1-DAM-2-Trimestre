package claseVehiculo;

public class Vehiculo {
	
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected int anoMatriculacion;
	
	
	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param anoMatriculacion
	 */
	public Vehiculo(String matricula, String marca, String modelo, int anoMatriculacion) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.anoMatriculacion = anoMatriculacion;
	}
	
	public void antiguedadVehiculo() {
		int edad= 0;
		for(int i = anoMatriculacion ; i>= 2025; i++) {
			edad++;
		}
		System.out.println("El vehiculo tiene " + edad + " años de antigüedad");
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the anoMatriculacion
	 */
	public int getAnoMatriculacion() {
		return anoMatriculacion;
	}

	/**
	 * @param anoMatriculacion the anoMatriculacion to set
	 */
	public void setAnoMatriculacion(int anoMatriculacion) {
		this.anoMatriculacion = anoMatriculacion;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", anoMatriculacion="
				+ anoMatriculacion + "]";
	}

}
