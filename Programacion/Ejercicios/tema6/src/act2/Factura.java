package act2;

public class Factura  implements Imprimible{
	
	public enum Estado{
		PENDIENTE,PAGADA,CANCELADA
	}
	
	public enum MetodoPago{
		TARJETA,FISICO
	}
	
	private int numeroFactura;
	private Estado estadoFactura;
	private MetodoPago metodoPago;
	private int totalPagar;
	
	public Factura(int numeroFactura, Estado estadoFactura, MetodoPago metodoPago, int totalPagar) {
		this.numeroFactura = numeroFactura;
		this.estadoFactura = estadoFactura;
		this.metodoPago = metodoPago;
		this.totalPagar = totalPagar;
	}
	
	
	@Override
	public String toString() {
		return "Numero Factura: "+ numeroFactura
				+"\n"
				+ "EstadoFactura" + estadoFactura
				+"\n"
				+ "Metodo Pago: " + metodoPago
				+"\n"
				+ "Total a pagar: " + totalPagar;
	}
	

}
