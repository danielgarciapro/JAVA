package ejercicios;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Ejercicio que no funciona, bajar el de github de manolo
		//fichero de entrada
		File inFile = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/geografia2.csv");
		//al ser fichero de texto uso scanner
		String leido="";
		try (Scanner in = new Scanner(inFile)){
			
			in.useDelimiter(";");
			String id = in.next();
			String latitud = in.next();
			String longitud = in.next();
			String altitud = in.next();
			String nombre = in.next();
			String url = in.next();
			String anno = in.next();
			
			while(in.hasNext()) {
				leido = in.next();
			}
			
			System.out.println(leido);
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}

class Localidad{
	private String id;
	private double latitud;
	private double longitud;
	private int elevacion;
	private String nombre;
	private String url;
	private String anno;
	public Localidad(String id, double latitud, double longitud, int elevacion,
			String nombre, String url, String anno) {
		this.id = id;
		this.latitud = latitud;
		this.longitud = longitud;
		this.elevacion = elevacion;
		this.nombre = nombre;
		this.url = url;
		this.anno = anno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Localidad [id=" + id + ", latitud=" + latitud + ", longitud="
				+ longitud + ", elevacion=" + elevacion + ", nombre=" + nombre
				+ ", url=" + url + ", anno=" + anno + "]";
	}
	
	
	
}
