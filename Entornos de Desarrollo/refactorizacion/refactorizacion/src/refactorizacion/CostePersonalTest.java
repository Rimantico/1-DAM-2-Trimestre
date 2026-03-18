package refactorizacion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CostePersonalTest {

    @Test
    public void testDirector() {

        Trabajador t1 = new Trabajador(3000, 10, TipoTrabajador.DIRECTOR);

        Trabajador[] trabajadores = {t1};

        float resultado = CostePersonal.costeDelPersonal(trabajadores);

        assertEquals(3000, resultado);
    }

    @Test
    public void testSubdirector() {

        Trabajador t1 = new Trabajador(2500, 5, TipoTrabajador.SUBDIRECTOR);

        Trabajador[] trabajadores = {t1};

        float resultado = CostePersonal.costeDelPersonal(trabajadores);

        assertEquals(2500, resultado);
    }

    @Test
    public void testEmpleadoConHorasExtra() {

        Trabajador t1 = new Trabajador(1000, 5, TipoTrabajador.EMPLEADO);

        Trabajador[] trabajadores = {t1};

        float resultado = CostePersonal.costeDelPersonal(trabajadores);

        assertEquals(1100, resultado);
    }

    @Test
    public void testVariosTrabajadores() {

        Trabajador t1 = new Trabajador(3000, 0, TipoTrabajador.DIRECTOR);
        Trabajador t2 = new Trabajador(2000, 0, TipoTrabajador.SUBDIRECTOR);
        Trabajador t3 = new Trabajador(1000, 5, TipoTrabajador.EMPLEADO);

        Trabajador[] trabajadores = {t1, t2, t3};

        float resultado = CostePersonal.costeDelPersonal(trabajadores);

        assertEquals(6100, resultado);
    }
}