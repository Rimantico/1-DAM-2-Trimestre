package conexion;


// Librerías oara conectar con la base de datos
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	// conexion es una instancia de la conexión
	Connection conexion = null;
	
	public Connection conectar() {
		try {
			// Ruta del controlador a utilizar
			Class.forName("org.sqlite.JDBC");
		
// Establecemos la conexión a nuestra base de datos "usuarios.db"
// Esta es la instrucción más importante!!!! si no funciona no podemos seguir
			conexion = DriverManager.getConnection("jdbc:sqlite:bd/usuarios.db");
			System.out.println("La conexión se ha creado correctamente");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conexion;
	}
	
	public void desconectar() {
		try {
			conexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main (String[] args) {
		Conexion connect = new Conexion();
		
		connect.conectar();
	}
}

