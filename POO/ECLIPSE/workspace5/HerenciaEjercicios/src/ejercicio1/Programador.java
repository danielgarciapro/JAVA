package ejercicio1;

public class Programador extends InformaticoAbs {
	public String lenguaje;

	/**
	 * @param empresa
	 * @param lenguaje
	 */
	public Programador(String empresa, String lenguaje) {
		super(empresa);
		this.lenguaje = lenguaje;
	}
	
	public double pagarSueldo(double horas){
		return super.pagarSueldo(horas)+100;
	}

	@Override
	public String toString() {
		return "Programador [lenguaje=" + lenguaje + ", "
				+ super.toString() + "]";
	}
	
}
