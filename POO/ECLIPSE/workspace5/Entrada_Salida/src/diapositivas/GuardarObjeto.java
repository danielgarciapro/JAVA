package diapositivas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GuardarObjeto {

	public static void main(String[] args) {
		//creamos una lista de personas
		List<Persona> lista = new ArrayList<Persona>();
		Persona p1 = new Persona("Juan", 21);
		lista.add(p1);
		Persona p2 = new Persona("Pedro", 54);
		lista.add(p2);
		Persona p3 = new Persona("Daniel", 11);
		lista.add(p3);
		Persona p4 = new Persona("Martin", 32);
		lista.add(p4);
		Persona p5 = new Persona("Diego", 30);
		lista.add(p5);
		System.out.println(lista);
		//guardar la lista en un fichero
		//primero creamos un ObjectOutputStream
		try (ObjectOutputStream out1 = new ObjectOutputStream(
				new FileOutputStream(
						new File("/home/matinal/Escritorio/objeto.dat")));){
			out1.writeObject(lista);
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try (ObjectInputStream in1 = new ObjectInputStream(
				new FileInputStream(
						new File("/home/matinal/Escritorio/objeto.dat")));){
			List<Persona> listaNueva = (List<Persona>) in1.readObject();
			System.out.println("Lista Nueva: "+listaNueva);
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Persona implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}