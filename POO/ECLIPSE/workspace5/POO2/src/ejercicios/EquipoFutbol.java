package ejercicios;

public class EquipoFutbol {
	static class Entrenador{ //ponemos staic delante de class
		void entrenar(){
			System.out.println("Clase interna");
		}
	}
	private String x = "EquipoFutbol";
	void hacerEquipo(){
		/*static*/ class Jugador{ //dentro de un metodo no permite poner static, private...
			public void MetodoInterno(){
				System.out.println("metodo local : Valor de x es " + x);
			}
		}
		Jugador jugador = new Jugador();
		jugador.MetodoInterno();
	}

	public static void main(String args[]){
		EquipoFutbol.Entrenador c = new EquipoFutbol.Entrenador();
		//EquipoFutbol.Entrenador c = new EquipoFutbol.new Entrenador();

		c.entrenar();
		EquipoFutbol ft = new EquipoFutbol();
		ft.hacerEquipo();
	}
}