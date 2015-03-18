package ejercicios;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo(10, 10);
		Rectangulo rec3 = new Rectangulo(15, 5);
		System.out.println(rec1+""+rec2+rec3);
		System.out.println("Numero de Rectangulos = "+Rectangulo.getNumeroRectangulos());
		
	}

}
