package refactorizacion;
/**
 * Clase que calcula el coste total del personal.
 */
public class CostePersonal {

    /**
     * Calcula el coste total de todos los trabajadores.
     * 
     * @param trabajadores array de trabajadores
     * @return coste total del personal
     */
    static float costeDelPersonal(Trabajador trabajadores[]) {

        float costeFinal = 0;

        for (Trabajador trabajador : trabajadores) {

            if (trabajador.trab() == TipoTrabajador.DIRECTOR ||
                trabajador.trab() == TipoTrabajador.SUBDIRECTOR) {

                costeFinal += trabajador.getNom();

            } else {

                costeFinal += trabajador.getNom() + (trabajador.masTrab() * 20);

            }
        }

        return costeFinal;
    }
}