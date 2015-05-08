package interfaces;

public abstract class TrianguloFigura implements Figura{

	protected int lado1,lado2,lado3;
	
	/**
	 * @param lado1
	 * @param lado2
	 * @param lado3
	 */
	public TrianguloFigura(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return this.lado1+this.lado2+this.lado3;
	}


}
