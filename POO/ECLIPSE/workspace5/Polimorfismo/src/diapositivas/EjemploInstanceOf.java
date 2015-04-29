package diapositivas;

import java.util.List;
import java.util.ArrayList;

public class EjemploInstanceOf {
	private static List<Persona> lista = new ArrayList<Persona>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Profesor(30, "Juan", "Fisica", true);
		Persona p2 = new Profesor(45, "Antonio", "Matematicas", false);
		
		Persona p3 = new Alumno(17, "Julio", "Primero");
		Persona p4 = new Alumno(20, "Andres", "Segundo");
		
		Persona p5 = new Persona(57, "Pepe");
		
		lista.add(p1); lista.add(p2); lista.add(p3); lista.add(p4); lista.add(p5);
		
		System.out.println(p1+"\n"+p2+"\n"+p3+"\n"+p4+"\n"+p5);
		System.out.println(p1.getEdad()+"\n"+p2.getEdad()+"\n"+p3.getEdad()+"\n"+p4.getEdad()+"\n"+p5.getEdad());
		//System.out.println(p1.es+"\n"+p2.getEdad()+"\n"+p3.getEdad()+"\n"+p4.getEdad());
		for (Persona persona : lista) {
			if (persona instanceof Profesor) System.out.println(((Profesor) persona).esInterino());
			if (persona instanceof Alumno) System.out.println(((Alumno) persona).esMayorEdad());
		}
	}

}
class Persona{
	private int edad;
	private String nombre;
	/**
	 * @param edad
	 * @param nombre
	 */
	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	/**
	 * @return the edad
	 */
	protected int getEdad() {
		return edad;
	}
	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}
}

class Profesor extends Persona{
	private String asignatura;
	private boolean interino;

	/**
	 * @param edad
	 * @param nombre
	 * @param asignatura
	 */
	public Profesor(int edad, String nombre, String asignatura, boolean interino) {
		super(edad, nombre);
		this.asignatura = asignatura;
		this.interino = interino;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profesor [asignatura=" + asignatura + ", Edad ="
				+ getEdad() + ", Nombre =" + getNombre() + "]";
	}
	
	public boolean esMayorEdad(){
		return getEdad() > 17;
	}
	public boolean esInterino(){
		return this.interino;
	}
}

class Alumno extends Persona{
	private String curso;

	/**
	 * @param edad
	 * @param nombre
	 * @param curso
	 */
	public Alumno(int edad, String nombre, String curso) {
		super(edad, nombre);
		this.curso = curso;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", Edad =" + getEdad()
				+ ", Nombre =" + getNombre() + "]";
	}
	
	public boolean esMayorEdad(){
		return getEdad() > 17;
	}
	
}