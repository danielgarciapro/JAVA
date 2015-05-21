package ejercicio2;

public abstract class Trabajador {
	private String nombre;
	private String apellido;
	/**
	 * @param nombre
	 * @param apellido
	 */
	public Trabajador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	protected String nombreApellidos(){
		return this.nombre+" "+this.apellido;
	}
	public abstract double sueldoMensual(int diasTrabajados);
}
