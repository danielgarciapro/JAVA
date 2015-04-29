package ejercicio3;

public class Personajes {
	private String nombre;
	private double energia;
	//private int nivel;
	/**
	 * @param nombre
	 * @param energia
	 */
	public Personajes(String nombre, double energia) {
		this.nombre = nombre;
		this.energia = energia;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the energia
	 */
	public double getEnergia() {
		return energia;
	}
	/**
	 * @param energia the energia to set
	 */
	public void setEnergia(double energia) {
		this.energia = energia;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", energia=" + energia + "]";
	}
	
	public void alimentarse(double energia){
		this.energia += energia;
	}
}
