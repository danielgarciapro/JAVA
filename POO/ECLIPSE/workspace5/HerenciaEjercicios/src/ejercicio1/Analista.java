package ejercicio1;

public class Analista extends InformaticoAbs {
	public String especialidad;

	/**
	 * @param empresa
	 * @param especialidad
	 */
	public Analista(String empresa, String especialidad) {
		super(empresa);
		this.especialidad = especialidad;
	}
	
	public double pagarSueldo(double horas){
		return super.pagarSueldo(horas)+100;
	}

	@Override
	public String toString() {
		return "Analista [especialidad=" + especialidad + ", "
				+ super.toString() + "]";
	}
	
	
	
}
