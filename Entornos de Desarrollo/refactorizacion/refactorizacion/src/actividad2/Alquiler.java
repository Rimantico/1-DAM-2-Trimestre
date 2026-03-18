package actividad2;

public class Alquiler {

	 	private Vehiculo vehiculo;
	    private int diasAlquiler;

	    public Alquiler(Vehiculo vehiculo, int diasAlquiler) {
	        this.vehiculo = vehiculo;
	        this.diasAlquiler = diasAlquiler;
	    }
	    public int getDiasAlquiler() {
	        return diasAlquiler;
	    }
	    public Vehiculo getVehiculo() {
	        return vehiculo;
	    }
	    
	    // Método para calcular el precio
	    
	    public double calcularImporte() {
	    	double total = 0;
	    	switch(vehiculo.getCodigoPrecio()) {
	    	
	    	case Vehiculo.TURISMO:
	    		total += 20;
	    		if(diasAlquiler > 10) 
	    			total+= (diasAlquiler - 10) * 7.5;
	    			break;
	    	case Vehiculo.FURGONETA:
	    		total+= diasAlquiler * 30;
	    		break;
	    		
	    	case Vehiculo.MOTOCICLETA:
	    		total +=10;
	    		if(diasAlquiler > 5)
	    			total += (diasAlquiler - 5) * 7.5;
	    		break;
	    	}
	    	return total;
	    }
	    
	    // Método para calcular puntos
	    
	    public int calcularPuntosFrecuencia() {
	    	int puntos = 1;
	    	
	    	if((vehiculo.getCodigoPrecio()== Vehiculo.FURGONETA) && diasAlquiler > 2) {
	    		puntos++;
	    	}
	    	
	    	return puntos;
	    }
	
}
