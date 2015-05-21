package ejercicio1;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(String nombre, int numeroLados, double longitudLado) {
		super(nombre, numeroLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.pow(this.getLongitudLado(), 2);
	}

}
