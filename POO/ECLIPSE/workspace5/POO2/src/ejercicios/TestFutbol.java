package ejercicios;

import java.util.List;

public class TestFutbol {

	public static void main(String[] args) {
		Futbol f = new Futbol("RealMadrid");
		Futbol.Entrenador e = f.contratarEntrenador("Ancceloti", 10);
		List<Futbol.Jugador> plantilla = f.confeccionarEquipo();
		
		System.out.println(e);
		System.out.println(plantilla);
	}

}
