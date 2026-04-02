package metodos;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;
import usuario.Usuario;


public class Metodos {
	Conexion conexion;
	
	public boolean insertar (Usuario usuario) {
		PreparedStatement preparedStatement = null;
		try {
			conexion = new Conexion();
			preparedStatement = conexion.conectar().prepareStatement("INSERT INTO Usuario VALUES(null,?,?)");
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
	
	public ArrayList <Usuario> listaDeUsuarios(){
		ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			conexion = new Conexion();
			preparedStatement = conexion.conectar().prepareStatement("SELECT * FROM Usuario");
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(resultSet.getInt("id"));
				usuario.setNombre(resultSet.getString("Nombre"));
				usuario.setEdad(resultSet.getInt("Edad"));
				listaUsuarios.add(usuario);
			}
			conexion.desconectar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaUsuarios;
	}
	
	
	public boolean eliminar (int id) {
		PreparedStatement preparedStatement = null;
		try {
			conexion = new Conexion();
			preparedStatement = conexion.conectar().prepareStatement("DELETE FROM Usuario WHERE ID=?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			conexion.desconectar();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean modificar (Usuario usuario) {
		PreparedStatement preparedStatement = null;
		try {
			conexion = new Conexion();
			preparedStatement = conexion.conectar().prepareStatement("UPDATE Usuario SET nombre=?,edad=? WHERE ID=?");
			preparedStatement.setString(1, usuario.getNombre());
			preparedStatement.setInt(2, usuario.getEdad());
			preparedStatement.setInt(3, usuario.getId());
			preparedStatement.executeUpdate();
			conexion.desconectar();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}

