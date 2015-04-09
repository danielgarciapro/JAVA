package ejercicios;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio4 {

	public static void main(String[] args) {
		//creamos el descrptor del fichero
		File inFile = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/libros_copia.csv");
		List<Libro> listaLibros = new ArrayList<Libro>(); //lista total de libros
		//Colecciones Set, no se pueden repetir los objetos que contiene
		Set<Libro> listaDiezLibros = new HashSet<Libro>();
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
		//System.out.println(listaLibros);
		//sacamos 10 libros al azar y añadirlos a la nueva lista
		do {
			//posicion aleatoria
			int posicionLibroLista = (int) (Math.random()*listaLibros.size());
			listaDiezLibros.add(listaLibros.get(posicionLibroLista));
		} while (listaDiezLibros.size() < 10);
		System.out.println(listaDiezLibros);
		
		//vamos a crear el fichero de salida
		File outFile = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/ejercicio4.dat");
		//creamos el stream de salida
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(outFile)));){
			
			out.writeObject(listaDiezLibros);
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//vamos a leer los datos del fichero libros.dat
				//
		try (ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(outFile)));){
					
			@SuppressWarnings("unchecked") //para eliminar el warning
			Set<Libro> objetoLeido = (Set<Libro>) in.readObject();
			System.out.println(objetoLeido);
					
		} catch (IOException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
class Libro implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
				+ isbn + "]\n";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
}