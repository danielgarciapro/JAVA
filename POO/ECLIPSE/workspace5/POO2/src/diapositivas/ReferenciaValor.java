package diapositivas;

public class ReferenciaValor {

	public static void main(String[] args) {
		int inicial=6;
		System.out.println("Antes de llamar al metodo "+inicial);
		modificarPrimitivo(inicial);
		System.out.println("Valor despues de llamar al metodo "+inicial);
		/*Circulo c1 = new Circulo(5.0);
		System.out.println("Posicion memoria c1: "+c1);
		System.out.println("valor actual de c1 "+c1.getRadio());
		Circulo c3 = c1;
		c3.setRadio(15);
		System.out.println(c3.getRadio());
		modificar(c3);
		System.out.println("Valor del radio de c3 "+c3.getRadio());
		System.out.println("valor actual de c1 "+c1.getRadio());*/

	}
	public static void modificar (Circulo c2){
		System.out.println("Posicion memoria c2; "+c2);
		c2.setRadio(40);
		System.out.println("Valor del radio de c2 "+c2.getRadio());
	}
	public static void modificarPrimitivo(int valorEnElMetodo){
		valorEnElMetodo *= 2;
	}
}
class Circulo{
	private double radio;

	public Circulo(double r) {
		this.radio=r;
		// TODO Auto-generated constructor stub
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
}
