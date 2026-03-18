package metodos;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexion.Conexion;
import usuario.Usuario;


public class Metodos {
	Conexion conexion;
	
	public boolean insertar (Usuario usuario) {
		PreparedStatement preparedStatement = null;
		try {
			conexion = new Conexion();
			preparedStatement = conexion.conectar().prepareStatement("INSERT INTO usuarios VALUES(null,?,?)");
			preparedStatement.setString(1, usuario.getNombre());
			preparedStatement.setInt(2, usuario.getEdad());
			preparedStatement.executeUpdate();
			conexion.desconectar();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}

