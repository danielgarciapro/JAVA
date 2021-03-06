package diapositivas;

public class Persona {
	private String nombre;
	private String apellidos;
	private ProvinciaNacimiento provincia;
	public Persona(String nombre, String apellidos, ProvinciaNacimiento provincia) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.provincia = provincia;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the provincia
	 */
	public ProvinciaNacimiento getProvincia() {
		return provincia;
	}
	/**
	 * @param provincia the provincia to set
	 */
	public void setProvincia(ProvinciaNacimiento provincia) {
		this.provincia = provincia;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", provincia=" + provincia + "]";
	}
	
	
}
