package componentes;

public class Jugador {
	private String nombre;
	private String equipo;
	/**
	 * @param nombre
	 * @param equipo
	 */
	public Jugador(String nombre, String equipo) {
		this.nombre = nombre;
		this.equipo = equipo;
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
	 * @return the equipo
	 */
	public String getEquipo() {
		return equipo;
	}
	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", equipo=" + equipo + "]";
	}
	
}
