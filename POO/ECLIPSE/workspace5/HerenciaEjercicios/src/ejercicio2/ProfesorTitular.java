package ejercicio2;

public class ProfesorTitular extends Profesor {
	private int antiguedad;

	public ProfesorTitular(String nombre, String dni, int edad,
			String especialidad, int antiguedad) {
		super(nombre, dni, edad, especialidad);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [antiguedad=" + antiguedad + ", "
				+ super.toString() + "]";
	}
	
}
