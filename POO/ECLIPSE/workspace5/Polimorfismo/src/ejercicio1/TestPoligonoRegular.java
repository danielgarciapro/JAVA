package ejercicio1;

public class TestPoligonoRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PoligonoRegular t1 = new TrianguloEquilatero("Triangulo1", 3, 3);
		PoligonoRegular t2 = new TrianguloEquilatero("Triangulo2", 3, 4);
		PoligonoRegular t3 = new TrianguloEquilatero("Triangulo3", 3, 5);
		PoligonoRegular c = new Cuadrado("Cuadrado", 4, 3);
		PoligonoRegular h = new Hexagono("Hexagono", 6, 3);
		
		ListaPoligonoRegular lista = new ListaPoligonoRegular();
		lista.addPoligonoRegular(t1);lista.addPoligonoRegular(c);lista.addPoligonoRegular(h);
		lista.addPoligonoRegular(t2);lista.addPoligonoRegular(t3);
		
		System.out.println(lista);
		
		for (PoligonoRegular poligonoRegular : lista.getListaPoligonoRegular()) {
			System.out.println(poligonoRegular+" AREA "+poligonoRegular.getArea()+" PERIMETRO "+
					poligonoRegular.getPerimetro());
		}
		System.out.println();
		for (PoligonoRegular poligonoRegular : lista.getListaPoligonoRegular()) {
			System.out.println(poligonoRegular+" AREA "+poligonoRegular.getArea()+" PERIMETRO "+
					poligonoRegular.getPerimetro());
		}
		/*for (PoligonoRegular poligonoRegular : lista.getListaPoligonoRegular()) {
			if (poligonoRegular.equals(lista.get(0)))
				System.out.println(poligonoRegular+"Es igual a "+lista.get(0));
		}
		System.out.println(" ");
		
		for (PoligonoRegular poligonoRegular : lista.getListaPoligonoRegular()) {
			System.out.println(poligonoRegular+" comparando con  "+lista.get(0)+" "+poligonoRegular.compareTo(lista.get(0)));
		}*/
	}

}
