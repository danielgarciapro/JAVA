package ejercicio2;

public class Oficial extends Trabajador {
	private final double PAGA_DIARIA=100;
	private String clase;
	
	/**
	 * @param nombre
	 * @param apellido
	 * @param clase
	 */
	public Oficial(String nombre, String apellido, String clase) {
		super(nombre, apellido);
		this.clase = clase;
	}

	@Override
	public double sueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return PAGA_DIARIA*diasTrabajados;
	}

	/**
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}

}
