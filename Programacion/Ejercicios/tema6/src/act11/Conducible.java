package act11;

public interface Conducible {
	void acelerar(int cantidad);
	void frenar(int cantidad) throws VelocidadNoValidaException;
}
