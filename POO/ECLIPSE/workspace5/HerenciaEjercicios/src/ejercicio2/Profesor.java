package ejercicio2;

public class Profesor extends Persona{
	private String especialidad;

	/**
	 * @param nombre
	 * @param dni
	 * @param edad
	 * @param especialidad
	 */
	public Profesor(String nombre, String dni, int edad, String especialidad) {
		super(nombre, dni, edad);
		this.especialidad = especialidad;
	}
	
	

	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}



	@Override
	public String toString() {
		return "especialidad=" + especialidad + ", "
				+ super.toString();
	}
	
	
}
