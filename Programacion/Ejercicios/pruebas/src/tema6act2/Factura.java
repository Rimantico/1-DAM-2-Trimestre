package tema6act2;

public class Factura implements Imprimible{
	
	private int idFactura;
	private String contenidoFactura;
	
	public Factura(int idFactura, String contenidoFactura) {
		this.idFactura = idFactura;
		this.contenidoFactura = contenidoFactura;
	}
	
	@Override
	public String toString() {
		
		return "ID de la factura: " + idFactura + "\n"
				+ " Contenido de la factura: " + contenidoFactura;
	}
}
