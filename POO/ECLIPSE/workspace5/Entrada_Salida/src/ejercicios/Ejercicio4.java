package ejercicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

	public static void main(String[] args) {
		//creamos el descrptor del fichero
		File inFile = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/libros_copia.csv");
		List<Libro> listaLibros = new ArrayList<Libro>();
		//creamos el flujo de entrada
		try (BufferedReader in = new BufferedReader(
					new FileReader(inFile));){
			String linea=in.readLine(); //leo la primera linea y la deshecho
			Libro libro;
			while ((linea=in.readLine())!=null) {
				String[] campos = linea.split(";");
				libro = new Libro(campos[0], campos[3], campos[6]);
				listaLibros.add(libro);
				//System.out.print(campos[0]+"-"+campos[3]+"-"+campos[6]+"\n\n");
			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(listaLibros);
	}

}
class Libro{
	private String titulo;
	private String autor;
	private String isbn;
	public Libro(String titulo, String autor, String isbn) {
		this.titulo = titulo;
		if (autor.equals("")) this.autor = "desconocido";
		else this.autor = autor;
		this.isbn = isbn;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn="
				+ isbn + "]";
	}
}