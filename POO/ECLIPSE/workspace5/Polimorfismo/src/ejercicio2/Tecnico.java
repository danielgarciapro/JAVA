package ejercicio2;

public class Tecnico extends Trabajador{
	private final double PAGA_DIARIA=200;
	private boolean titulacionSuperior;
	/**
	 * @param nombre
	 * @param apellido
	 * @param titulacionSuperior
	 */
	public Tecnico(String nombre, String apellido, boolean titulacionSuperior) {
		super(nombre, apellido);
		this.titulacionSuperior = titulacionSuperior;
	}
	@Override
	public double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}
	/**
	 * @return the titulacionSuperior
	 */
	public boolean isTitulacionSuperior() {
		return titulacionSuperior;
	}
	

}
