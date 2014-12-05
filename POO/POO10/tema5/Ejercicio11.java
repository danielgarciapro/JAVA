public class Ejercicio11{
	public enum Days{
		DOMINGO, LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO
	}
	//atributo
	private Days dia;
	public Ejercicio11(Days d){
		this.dia=d
		}
	@Override
	public String toString(){
		return this.dia;
		}
}
