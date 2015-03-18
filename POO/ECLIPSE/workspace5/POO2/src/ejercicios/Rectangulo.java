package ejercicios;

public class Rectangulo {
	private double ancho=1;
	private double alto=1;
	private static int numeroRectangulos;
	public Rectangulo(){
		numeroRectangulos++;
	}
	public Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		numeroRectangulos++;
	}
	public double getArea(){
		return this.alto*this.ancho;
	}
	public double getPerimetro(){
		return 2*this.alto+2*this.ancho;
	}
	public static int getNumeroRectangulos() {
		return numeroRectangulos;
	}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + "]";
	}
}
