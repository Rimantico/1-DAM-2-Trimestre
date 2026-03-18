package actividad2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlquilerTest {

    @Test
    void testImporteTurismo() {

        Vehiculo veh = new Vehiculo("1234AAA", Vehiculo.TURISMO);
        Alquiler alquiler = new Alquiler(veh, 5);

        double resultado = alquiler.calcularImporte();

        assertEquals(20, resultado);
    }

    @Test
    void testImporteFurgoneta() {

        Vehiculo veh = new Vehiculo("1234BBB", Vehiculo.FURGONETA);
        Alquiler alquiler = new Alquiler(veh, 3);

        double resultado = alquiler.calcularImporte();

        assertEquals(90, resultado);
    }

    @Test
    void testImporteMotocicleta() {

        Vehiculo veh = new Vehiculo("1234CCC", Vehiculo.MOTOCICLETA);
        Alquiler alquiler = new Alquiler(veh, 2);

        double resultado = alquiler.calcularImporte();

        assertEquals(10, resultado);
    }

    @Test
    void testPuntosNormales() {

        Vehiculo veh = new Vehiculo("1111AAA", Vehiculo.TURISMO);
        Alquiler alquiler = new Alquiler(veh, 3);

        int puntos = alquiler.calcularPuntosFrecuencia();

        assertEquals(1, puntos);
    }

    @Test
    void testPuntosFurgonetaExtra() {

        Vehiculo veh = new Vehiculo("1111BBB", Vehiculo.FURGONETA);
        Alquiler alquiler = new Alquiler(veh, 3);

        int puntos = alquiler.calcularPuntosFrecuencia();

        assertEquals(2, puntos);
    }
}
