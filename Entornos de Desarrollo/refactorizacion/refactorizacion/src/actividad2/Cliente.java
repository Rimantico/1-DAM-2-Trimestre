package actividad2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Cliente {

	private String nombre;
	private ArrayList<Alquiler> alquileres = new ArrayList<Alquiler>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void addAlquiler(Alquiler arg) {
        alquileres.add(arg);
    }

    public String getNombre() {
        return nombre;
    }
    
    public String cuenta() {
    	
    	double precioTotal = 0;
    	int puntosFrecuenciaAlquiler = 0;
    	
    	String resultado = "Registro de alquiler para " + getNombre() + "\n";
    	
    	for(Alquiler alquiler : alquileres) {
    		double importe = alquiler.calcularImporte();
    		
    		puntosFrecuenciaAlquiler += alquiler.calcularPuntosFrecuencia();
    		
    		resultado += "\t" + alquiler.getVehiculo().getMatricula() + "\t" + importe + "\n";
    		
    		precioTotal += importe;
    	}
    	
    	resultado += "Importe total " + precioTotal + "\n";
    	resultado += "Has ganado" + puntosFrecuenciaAlquiler + " puntos de fidelidad";
    	
    	return resultado;
     }

    
    
}