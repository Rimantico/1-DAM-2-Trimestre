package act9;

public interface Repositorio <T>{
	void guardar(T obj);
	void eliminar(T obj);
	void buscar(T obj);
	void listar();
}
