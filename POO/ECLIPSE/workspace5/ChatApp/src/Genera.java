


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Genera {
/*
 *  CREATE TABLE `Alumno` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(50) NOT NULL,
  `apellido2` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `genero` enum('m','f') NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=MEMORY DEFAULT CHARSET=utf8 |

*/	String[] NOMBREM = {"Antonio","Luis","Manuel","Andrés","Raúl","Álvaro","Alfredo","Santiago","Jesús","Jacinto",
			"Rubén","Pedro","José","Juan", "Sebastián", "Alfonso", "Miguel", "Gabriel", "Valentín","Abraham",
			"Juan Carlos", "Carlos", "Javier","Joaquín","Tomás","Enrique","Juan José","Iván"};
	String[] NOMBREF = {"Ana","Sara","Elena","Ángela","María","Josefa","Luisa","Antonia","Lidia",
			"Elisa","Carmen","Mercedes","Elvira","Nieves","Aida", "Rebeca","Maria Teresa","Inmaculada",
			"Dolores","Gema","Isabel","Estefanía","Ana Belén","Montserrat","Araceli","Cristina"};
	String[] APELLIDO = {"Sánchez", "Molina", "Muñoz", "Arias", "López", "Guerrero", "Rodríguez", "Alcalde", 
			"García","Cano", "Campos", "Raya", "Espinosa", "Moreno", "Zamora", "Cruz", "Ramírez", "Pulido",
			"Tello","Jaén", "Navarro","Merino","Torres","Armenteros", "Garrido", "Fuentes", "Vega", "Ocaña",
			"Barranco","Martínez","Méndez","Domingo","Plaza","Hidalgo","Alvarez","Liebana","Carrasco","Pérez"};
	String[] GENERO = {"m","f"};
	
	private static Connection conn = null;
	
	Genera() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/chatApp","root","DaniRoot");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
	
	public Date randomDate() {
		GregorianCalendar gc = new GregorianCalendar();
		int year = randBetween(1960, 2010);
		gc.set(Calendar.YEAR, year);
		int dayOfYear = randBetween(1, gc.getActualMaximum(Calendar.DAY_OF_YEAR));
		gc.set(Calendar.DAY_OF_YEAR, dayOfYear);
		return gc.getTime();
	}
	
	public String randomName(int size){
		Random random = new Random();
		char[] word = new char[random.nextInt(size)+3];
        for(int j = 0; j < word.length; j++)
        {
            word[j] = (char)('a' + random.nextInt(26));
        }
        return new String(word);
	}
	
	public void inserta(int size) throws SQLException {
		PreparedStatement ps;
		Random randomGenerator;
		String apellido,apellido2, nombre;
		int n;
		Date fecha;

		ps = conn.prepareStatement("INSERT INTO Alumno ( apellido,apellido2, nombre, fecha_nacimiento, genero) values (?,?,?,?,?)");
		
		while (size>0) {
			randomGenerator = new Random();
			apellido = APELLIDO[randomGenerator.nextInt(APELLIDO.length)];
			//apellido = randomName(10);
			apellido2 = APELLIDO[randomGenerator.nextInt(APELLIDO.length)];
			//apellido2 = randomName(10);
			n = randomGenerator.nextInt(GENERO.length);
			if (n==0)
				nombre  = NOMBREM[randomGenerator.nextInt(NOMBREM.length)];
			else
				nombre  = NOMBREF[randomGenerator.nextInt(NOMBREF.length)];
			//nombre = randomName(9);	
			fecha = randomDate(); 
		
			ps.setString(1, apellido);
			ps.setString(2, apellido2);
			ps.setString(3, nombre);
			ps.setDate(4, new java.sql.Date(fecha.getTime()));
			ps.setString(5, GENERO[n] );
			ps.addBatch();
			size--;
		}
		ps.executeBatch();
		ps.close();  
		conn.close();
	}
	 
	public static void main(String[] args) {
		Genera app = new Genera();
		try {
			app.inserta(100000);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
