package chatApp.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class Conexion {

	private static Connection conn = null;

	public Conexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/chatApp", "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public Usuario conecta(String login, char[] password) throws SQLException {

		Statement st = conn.createStatement();
		String sql = "SELECT * FROM Usuario where login=\"" + login
				+ "\" and password=\"" + String.valueOf(password) + "\"";
		System.out.println(sql);
		st.execute(sql);
		ResultSet rs = st.getResultSet();
		if (rs.next()) {
			int idUsuario = rs.getInt("idUsuario");
			String nombre = rs.getString("nombre");
			return new Usuario(idUsuario, nombre);
		} else {
			return null;
		}
	}

	public Usuario conectaSecured(String login, char[] password)
			throws SQLException {

		String sql = "SELECT * FROM Usuario where login=? and password=?";
		PreparedStatement p = conn.prepareStatement(sql);
		p.setString(1, login);
		p.setString(2, String.valueOf(password));
		System.out.println(p.toString());
		ResultSet rs = p.executeQuery();
		if (rs.next()) {
			int idUsuario = rs.getInt("idUsuario");
			String nombre = rs.getString("nombre");
			return new Usuario(idUsuario, nombre);
		} else {
			return null;
		}
	}

	public ArrayList<Mensaje> getMensajes(Usuario origen, Usuario destino) {
		ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
		String sql = "SELECT * FROM Mensaje where (idUsuarioOrigen=? and idUsuarioDestino=?) or (idUsuarioOrigen=? and idUsuarioDestino=?)";
		String texto;
		Date fecha;
		int idUsuarioOrigen;
		int idUsuarioDestino;
		int idMensaje;
		try {
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, origen.getIdUsuario());
			p.setInt(2, destino.getIdUsuario());
			p.setInt(3, destino.getIdUsuario());
			p.setInt(4, origen.getIdUsuario());
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				idMensaje = rs.getInt("idMensaje");
				texto = rs.getString("texto");
				fecha = rs.getDate("fecha");
				idUsuarioOrigen = rs.getInt("idUsuarioOrigen");
				idUsuarioDestino = rs.getInt("idUsuarioDestino");
				Mensaje msg;
				if (origen.getIdUsuario() == idUsuarioOrigen) {
					msg = new Mensaje(idMensaje, origen, destino, texto, fecha);
				} else {
					msg = new Mensaje(idMensaje, destino, origen, texto, fecha);
				}
				mensajes.add(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mensajes;
	}

	public ArrayList<Usuario> getTodosUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "SELECT * FROM Usuario";
		Statement st;
		String nombre;
		int idUsuario;
		try {
			st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				idUsuario = rs.getInt("idUsuario");
				nombre = rs.getString("nombre");
				Usuario user = new Usuario(idUsuario, nombre);
				usuarios.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuarios;
	}

	public ArrayList<Mensaje> getUltimosMensajes(Usuario origen,
			Usuario destino, int idUltimoMensaje) {
		ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();
		String sql = "SELECT * FROM Mensaje where idUsuarioOrigen=? and idUsuarioDestino=? and idMensaje>?";
		String texto;
		Date fecha;
		int idUsuarioOrigen;
		int idUsuarioDestino;
		int idMensaje;
		try {
			PreparedStatement p = conn.prepareStatement(sql);
			p.setInt(1, destino.getIdUsuario());
			p.setInt(2, origen.getIdUsuario());
			p.setInt(3, idUltimoMensaje);
			ResultSet rs = p.executeQuery();
			while (rs.next()) {
				idMensaje = rs.getInt("idMensaje");
				texto = rs.getString("texto");
				fecha = rs.getDate("fecha");
				idUsuarioOrigen = rs.getInt("idUsuarioOrigen");
				idUsuarioDestino = rs.getInt("idUsuarioDestino");
				Mensaje msg;
				if (origen.getIdUsuario() == idUsuarioOrigen) {
					msg = new Mensaje(idMensaje, origen, destino, texto, fecha);
				} else {
					msg = new Mensaje(idMensaje, destino, origen, texto, fecha);
				}
				mensajes.add(msg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return mensajes;
	}

	public int insertaMensaje(Mensaje msg) {
		String sql = "INSERT INTO Mensaje (texto, idUsuarioOrigen, idUsuarioDestino, fecha) values (?,?,?,NOW())";
		PreparedStatement p;

		try {
			p = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			p.setString(1, msg.getTexto());
			p.setInt(2, msg.getUsuarioOrigen().getIdUsuario());
			p.setInt(3, msg.getUsuarioDestino().getIdUsuario());
			p.executeUpdate();
			ResultSet tableKeys = p.getGeneratedKeys();
			tableKeys.next();
			return tableKeys.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}

	}
	
	public void cerrar() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
