package ejercicios;

public class TestVentilador {

	public static void main(String[] args) {
		Ventilador v1 = new Ventilador();
		System.out.println(v1);
		v1.setColor("Verde");
		v1.setEncencido(true);
		v1.setRadio(150);
		v1.setRapidez(Velocidad.RAPIDO);
		System.out.println(v1);

	}

}
