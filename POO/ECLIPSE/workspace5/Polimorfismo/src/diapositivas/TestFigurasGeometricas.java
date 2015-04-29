package diapositivas;

public class TestFigurasGeometricas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiguraGeometrica f1 = new Cuadrados(5);
		FiguraGeometrica f2 = new Rectangulos(5, 8);
		FiguraGeometrica f3 = new Circulos(10);
		
		System.out.println(f1+"\n"+f2+"\n"+f3);
		System.out.println(f1.getArea());
		System.out.println(f2.getArea());
		System.out.println(f3.getArea());
	}

}
