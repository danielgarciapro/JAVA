package ejercicio2;

public class ProfesorInterino extends Profesor {
	private int duracionContrato;

	public ProfesorInterino(String nombre, String dni, int edad,
			String especialidad, int duracionContrato) {
		super(nombre, dni, edad, especialidad);
		this.duracionContrato = duracionContrato;
	}

	public int getDuracionContrato() {
		return duracionContrato;
	}

	public void setDuracionContrato(int duracionContrato) {
		this.duracionContrato = duracionContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [duracionContrato=" + duracionContrato
				+ ", " + super.toString() + "]";
	}
	
	
}
