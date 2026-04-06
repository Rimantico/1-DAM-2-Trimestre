package tema6act4;

public class Producto implements Constantes{
	
	private String nombreProducto;
	private double precio;
	private  boolean ivaCalculado = false;
	
	public Producto(String nombreProducto, double precio) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}
	
	public void calcularIva() {
		if(ivaCalculado == false) {
			double calculo = precio * IVA;
			precio = precio + calculo;
			ivaCalculado = true;
			System.out.println("El IVA del producto ha sido calculado correctamente");
		}else if(ivaCalculado = true) {
			System.out.println("No puedes calcularle dos veces el IVA a un producto");
		}else
			System.out.println("Error");
	}
	
	

}
