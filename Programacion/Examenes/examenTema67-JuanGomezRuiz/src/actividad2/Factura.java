package actividad2;

public class Factura implements Metodos {
	
	
	// Clase hecha por Juan Gómez Ruiz

	
	// Atributos
	
	private int identificador;
	private double descuento;
	private Cliente cliente;
	private double totalFactura;
	private Vehiculo vehiculo;
	public Factura(int identificador, Vehiculo vehiculo, Cliente cliente) throws ValidarCodigoException {
		super();
		validarIdentificador();
		this.identificador = identificador;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		calcularFactura();
	}
	
	// Getters y setters
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotalFactura() {
		return totalFactura;
	}

	public void setTotalFactura(double totalFactura) {
		this.totalFactura = totalFactura;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	// Metodos

	public void validarIdentificador() throws ValidarCodigoException {
		if(identificador > 999999) {
			throw new ValidarCodigoException("Codigo invalido");
		}else if(identificador < 999999){
			String resultado;
			 resultado = String.format("%0" + 6 + "d", identificador);
		System.out.println(resultado);
		}
			
	}
	// Los calculos en general no estan bien
	
	public void calcularFactura() {
		if(vehiculo != null && vehiculo.getPrecio()>30000) {
			descuento = 0.12;
		}else if(vehiculo != null && vehiculo.getPrecio()>20000) {
			descuento = 0.08;
		}else if(vehiculo != null && vehiculo.getMarca().equals("Seat")&& vehiculo.getPrecio()>30000 ) {
			descuento = 0.17;
		}else if(vehiculo != null && vehiculo.getMarca().equals("Seat")&& vehiculo.getPrecio()>20000) {
			descuento = 0.13;
		}
		else if(vehiculo != null && vehiculo.getMarca().equals("Seat")) {
			descuento = 0.1;
		}else
			descuento = 0;
		
		double precioConIVA =vehiculo.getPrecio() * 0.21;
		precioConIVA = vehiculo.getPrecio() + precioConIVA;
		
		double precioDescontado = precioConIVA * descuento;
		precioDescontado = precioConIVA - descuento;
		
		totalFactura = precioDescontado;
		
	}
	
	
	@Override
	public void acercaDe() {
		System.out.println("Autocares Juan");
		System.out.println("AP1231");	
	}

	@Override
	public String toString() {
		return "Factura [identificador=" + identificador + ", descuento=" + descuento + ", cliente=" + cliente
				+ ", totalFactura=" + totalFactura + ", vehiculo=" + vehiculo + "]";
	}
	

}
