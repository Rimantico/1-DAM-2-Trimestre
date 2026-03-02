package act4;

public class Producto implements Constante{
	
	// Attributes
	
	private String nombreProducto;
	private double valorProducto;
	
	// Constructor
	
	public Producto(String nombreProducto, double valorProducto) {
		this.nombreProducto = nombreProducto;
		this.valorProducto = valorProducto;
	}
	
	// Methods
	
	public double calcularIVA() {
		double precioFinal = (valorProducto * IVA)+valorProducto;
		return precioFinal;
		
	}
	
	@Override
	public String toString() {
		return "Nombre del Producto: " + nombreProducto + "\n" + "Precio con IVA: " + calcularIVA();
	}
	

}
