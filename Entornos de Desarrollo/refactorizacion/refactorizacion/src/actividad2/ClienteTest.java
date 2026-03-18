package actividad2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    @Test
    void testCuentaCliente() {

        Vehiculo veh1 = new Vehiculo("2345JHH", Vehiculo.FURGONETA);
        Vehiculo veh2 = new Vehiculo("6754MLN", Vehiculo.TURISMO);
        Vehiculo veh3 = new Vehiculo("8765KHY", Vehiculo.MOTOCICLETA);

        Alquiler a1 = new Alquiler(veh1, 2);
        Alquiler a2 = new Alquiler(veh2, 2);
        Alquiler a3 = new Alquiler(veh3, 1);

        Cliente cliente = new Cliente("Enrique Martinez");

        cliente.addAlquiler(a1);
        cliente.addAlquiler(a2);
        cliente.addAlquiler(a3);

        String resultado = cliente.cuenta();

        assertTrue(resultado.contains("Enrique Martinez"));
        assertTrue(resultado.contains("2345JHH"));
        assertTrue(resultado.contains("6754MLN"));
        assertTrue(resultado.contains("8765KHY"));
    }
}