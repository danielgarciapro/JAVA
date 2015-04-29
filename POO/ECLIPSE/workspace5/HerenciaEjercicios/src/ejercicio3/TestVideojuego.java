package ejercicio3;

import java.util.List;
import java.util.ArrayList;

public class TestVideojuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Armas arma1 = new ArmasContundentes("Espadon de acero Valirio", 5, 3, 1);
		Armas arma2 = new ArmasContundentes("Martillaco Dorado Valirio", 8, 5, 2);
		Armas arma3 = new ArmasMagicas("Arma de Fuego Valirio", 6, 5, 1);
		Armas arma4 = new ArmasMagicas("Arma de Rayo", 8, 7, 2);
		
		List<ArmasContundentes> listaArmasContundentes = new ArrayList<ArmasContundentes>();
		listaArmasContundentes.add((ArmasContundentes) arma1);
		listaArmasContundentes.add((ArmasContundentes) arma2);
		
		List<ArmasMagicas> listaArmasMagicas = new ArrayList<ArmasMagicas>();
		listaArmasMagicas.add((ArmasMagicas) arma3);
		listaArmasMagicas.add((ArmasMagicas) arma4);
		
		int armaAleatoriaGuerrero = (int) (Math.random()*2);
		int armaAleatoriaMago = (int) (Math.random()*2);
		int AleatoriaGuerrero = (int) (Math.random()*4);
		int AleatoriaMago = (int) (Math.random()*4);
		
		Personajes personaje1 = new Guerreros("Matareyes", 30, listaArmasContundentes.get(armaAleatoriaGuerrero), 10);
		Personajes personaje2 = new Guerreros("Khal Drogo", 40, listaArmasContundentes.get(armaAleatoriaGuerrero), 15);
		Personajes personaje3 = new Magos("Gandalf", listaArmasMagicas.get(armaAleatoriaMago), 20);
		Personajes personaje4 = new Magos("R'Hollor", listaArmasMagicas.get(armaAleatoriaMago), 30);
		
		List<Personajes> listaPersonajes = new ArrayList<Personajes>();
		listaPersonajes.add(personaje1);
		listaPersonajes.add(personaje2);
		listaPersonajes.add(personaje3);
		listaPersonajes.add(personaje4);
		
		while(AleatoriaGuerrero==AleatoriaMago){
			
			AleatoriaGuerrero = (int) (Math.random()*4);
			AleatoriaMago = (int) (Math.random()*4);	
				
		}
		
		Personajes p1 = listaPersonajes.get(AleatoriaGuerrero);
		Personajes p2 = listaPersonajes.get(AleatoriaMago);
		
		
		Batalla pelea = new Batalla(p1,p2);
		
		System.out.println(p1+" pelea contra "+p2);
		
		while (true){
			
			pelea.ataque();
			if (pelea.getPersonaje1().getEnergia()<=0){
				System.out.println(pelea.getPersonaje2().getNombre()+" GANA!!!");
				break;
			}
			if (pelea.getPersonaje2().getEnergia()<=0){
				System.out.println(pelea.getPersonaje1().getNombre()+" GANA!!!");
				break;
			}

			pelea.defensa();
			if (pelea.getPersonaje1().getEnergia()<=0){
				System.out.println(pelea.getPersonaje2().getNombre()+" GANA!!!");
				break;
			}
			if (pelea.getPersonaje2().getEnergia()<=0){
				System.out.println(pelea.getPersonaje1().getNombre()+" GANA!!!");
				break;
			}
			
			
		}
		System.out.println("Fin de la partida");
		
		
	}

}
