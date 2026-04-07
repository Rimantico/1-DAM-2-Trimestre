package actividad2;

public class Vehiculo implements Metodos {
	
	// Clase hecha por Juan Gómez Ruiz
	
	// Enumeradores
	
	public enum Modelo{
		COCHE,MOTO,FURGONETA,OTRO;
	}
	
	// Atributos de la clase ( Funciona solo el de Vehiculos)
	
	public static int cantidadTotalVehiculos = 0;
	public static int cantidadTotalCoches = 0;
	public static int cantidadTotalMotos = 0;
	public static int cantidadTotalFurgonetas = 0;
	
	// Atributos
	
	private String codigo;
	private String matricula;
	private String marca;
	private Modelo modelo;
	private String fabricante;
	private double precio;
	
	// Constructor
	
	public Vehiculo(String codigo, String matricula, String marca, Modelo modelo, String fabricante, double precio) throws ValidarCodigoException {
		validarCodigo(codigo);
		this.codigo = codigo;
		this.matricula = matricula;
		this.marca = marca;
		tipoVehiculo();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.precio = precio;
	}
	
	// Getters y Setters

	public static int getCantidadTotalVehiculos() {
		return cantidadTotalVehiculos;
	}

	public static void setCantidadTotalVehiculos(int cantidadTotalVehiculos) {
		Vehiculo.cantidadTotalVehiculos = cantidadTotalVehiculos;
	}

	public static int getCantidadTotalMotos() {
		return cantidadTotalMotos;
	}

	public static void setCantidadTotalMotos(int cantidadTotalMotos) {
		Vehiculo.cantidadTotalMotos = cantidadTotalMotos;
	}

	public static int getCantidadTotalFurgonetas() {
		return cantidadTotalFurgonetas;
	}

	public static void setCantidadTotalFurgonetas(int cantidadTotalFurgonetas) {
		Vehiculo.cantidadTotalFurgonetas = cantidadTotalFurgonetas;
	}
	

	public static int getCantidadTotalCoches() {
		return cantidadTotalCoches;
	}

	public static void setCantidadTotalCoches(int cantidadTotalCoches) {
		Vehiculo.cantidadTotalCoches = cantidadTotalCoches;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// Metodos
	
	public void validarCodigo(String codigo) throws ValidarCodigoException {
		String regex = "^MA-00AB[1-9]{4}$";
		
		if(!codigo.matches(regex)) {
			throw new ValidarCodigoException("Codigo erroneo");
		}
	}
	
	public void tipoVehiculo() {
		if(modelo == Modelo.COCHE) {
			cantidadTotalCoches++;
			cantidadTotalVehiculos++;
		}else if(modelo == Modelo.FURGONETA) {
			cantidadTotalFurgonetas++;
			cantidadTotalVehiculos++;
		}else if( modelo == Modelo.MOTO) {
			cantidadTotalMotos++;
			cantidadTotalVehiculos++;
		}else
			cantidadTotalVehiculos++;
	}

	@Override
	public String toString() {
		return "Vehiculo [codigo=" + codigo + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", fabricante=" + fabricante + ", precio=" + precio + "]";
	}
	
	@Override
	public void acercaDe() {
		System.out.println("Autocares Juan");
		System.out.println("AP1231");	
	}
	
	
	

}
