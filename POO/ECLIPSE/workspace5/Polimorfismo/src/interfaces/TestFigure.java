package interfaces;

import java.util.ArrayList;
import java.util.List;

public class TestFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos objetos
		Figura f1 = new TrianguloEquilateroFigura(5);
		Figura f2 = new TrianguloIsocelesFigura(3, 4);
		Figura f3 = new ElipseFigura(3, 4);
		Figura f4 = new CircunferenciaFigura(3);
		List<Figura> lista = new ArrayList<Figura>();
		lista.add(f1); lista.add(f2); lista.add(f3); lista.add(f4);
		//recorremos la coleccion lista y mostramos nombre y perimetro
		for (Figura figura : lista) {
			System.out.println(figura.getNombre()+" "+figura.getPerimetro());
			System.out.println("--------------------------");
			System.out.println(figura.getTodo());
		}
		//¿se pueden crear objetos de tipo figura?(usando new figura
		//Figura f5 = new Figura se crea como objeto de clase anonima, mal asunto
		//CircularFigura c1 = new CircularFigura es abstracta, ocurre igual
	}

}
