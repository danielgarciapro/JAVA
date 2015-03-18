package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Futbol {
	private String NombreEquipo;
	private static final String[] NOMBRE_JUGADORES = {"portero","defensa1","defensa2","defensa3","defensa4",
		"centrocampista1","centrocampista2","centrocampista3","delantero1","delantero2","delantero3"}; 
	private enum Puesto{PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO}
	public Futbol(String nombreEquipo) {
		NombreEquipo = nombreEquipo;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Futbol [NombreEquipo=" + NombreEquipo + "]";
	};
	public class Entrenador{
		private String nombre;
		private int experiencia;
		public Entrenador(String nombre, int experiencia) {
			this.nombre = nombre;
			this.experiencia = experiencia;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Entrenador [nombre=" + nombre + ", experiencia="
					+ experiencia + "]";
		}
	}
	public class Jugador{
		private String nombre;
		private Puesto puesto;
		public Jugador(String nombre, Puesto puesto) {
			this.nombre = nombre;
			this.puesto = puesto;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Jugador [nombre=" + nombre + ", puesto=" + puesto + "]";
		}
	}
	public Entrenador contratarEntrenador(String nombre, int experiencia){
		return new Entrenador(nombre, experiencia);
	}
	public List<Jugador> confeccionarEquipo(){
		List<Jugador> plantilla = new ArrayList<Futbol.Jugador>();
		
		plantilla.add(new Jugador(NOMBRE_JUGADORES[0], Puesto.PORTERO));
		for (int i = 1; i < 5; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i], Puesto.DEFENSA));
		}
		for (int i = 5; i < 7; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i], Puesto.CENTROCAMPISTA));
		}
		for (int i = 7; i < 11; i++) {
			plantilla.add(new Jugador(NOMBRE_JUGADORES[i], Puesto.DELANTERO));
		}
		return plantilla;
	}
}
