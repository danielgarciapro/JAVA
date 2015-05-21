package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class PruebaConexion {
	public static final String DB_URL = "jdbc:sqlite:/home/matinal/sqlite/ejercicio";
	public static final String DRIVER = "org.sqlite.JDBC";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName(DRIVER);
			//vamos a permitir la integridad referencial en sqlite
			//debemos establecer el PRAGMA goreign key=ON
			SQLiteConfig config = new SQLiteConfig();
			config.enforceForeignKeys(true);
			//hacemos la conexion
			Connection conexion = DriverManager.getConnection(DB_URL, config.toProperties());
			System.out.println("Conectado a la base de datos...");
			//Thread.sleep(3000); //simulo operaciones con la base de datos (3s de espera)
			//vamos a consultar la tabla libros
			String sql = "select * from libros";
			//creamos el objeto Statement
			Statement statement = conexion.createStatement();
			//recibimos los datos de la consulta en un objeto ResultSet
			ResultSet result = statement.executeQuery(sql);
			//recorremos el result
			int id_libro,id_categoria;
	        String nombre, autor, editorial; 

			while(result.next()){
				id_libro = result.getInt("id_libro");
				id_categoria = result.getInt("id_categoria");
				nombre = result.getString("Nombre");
				autor = result.getString("Autor");
				editorial = result.getString("Editorial");
				System.out.printf("%5d, %5d, %30s, %25s, %25s%n",id_libro,id_categoria,nombre,autor,editorial);
			}
			
			//vamos a cambiar el nombre del usuario id=2
			sql = "update usuarios set nombre='Antonio' where id_usuario=2";
			int filasAfectadas = statement.executeUpdate(sql);
			System.out.println("Numero de filas afectadas: "+filasAfectadas);
			
			//vamos a borrar el usuario id=1
			sql ="delete from usuarios where id_usuario=1";
			filasAfectadas = statement.executeUpdate(sql);
			System.out.println("Numero de filas afectadas: "+filasAfectadas);
			
			System.out.println();
			//vamos a usar PreapreStatement, vamos a consultar los 2 primeros libros
			sql = "select * from libros where id_libro=?";
			PreparedStatement preparedStatement = conexion.prepareStatement(sql);
			for (int i = 1; i < 3; i++) {
				preparedStatement.setInt(1, i); //el uno hace referencia al ? de sql
				result = preparedStatement.executeQuery();
				while(result.next()){
					nombre = result.getString("nombre");
					editorial = result.getString("editorial");
					System.out.printf("%15s %15s%n", editorial, nombre);
				}
			}
			
			System.out.println();
			//vamos a agrupar sentencias sql usando el batch
			
			sql="insert into usuarios (nombre,apellidos) values (?,?)";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1,"Luis Felipe");
			preparedStatement.setString(2,"Rodriguez Perez");
			preparedStatement.addBatch();
			sql = "update usuarios set nombre=? where apellidos=?";
			preparedStatement = conexion.prepareStatement(sql);
			preparedStatement.setString(1,"Luis Francisco");
			preparedStatement.setString(2,"Rodriguez Perez");
			preparedStatement.addBatch();
			int[] affectedRecords = preparedStatement.executeBatch();
			System.out.println("Registros afectados: "+affectedRecords.length);
			
			//cerramos la conexion
			conexion.close();
			System.out.println("Desconectando de la base datos");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
