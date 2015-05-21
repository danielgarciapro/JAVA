package ejercicio1;

public class Hexagono extends PoligonoRegular {

	public Hexagono(String nombre, int numeroLados, double longitudLado) {
		super(nombre, numeroLados, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.getPerimetro()*Math.sqrt(Math.pow(this.getLongitudLado(), 2)-
				Math.pow(this.getLongitudLado()/2, 2)))/2;
	}

}
