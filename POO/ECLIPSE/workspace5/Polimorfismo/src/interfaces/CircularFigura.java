package interfaces;


public abstract class CircularFigura implements Figura {

	private int semiEjeMayor;
	private int semiEjeMenor;

	
	/**
	 * @param semiEjeMayor
	 * @param semiEjeMenor
	 */
	public CircularFigura(int semiEjeMayor, int semiEjeMenor) {
		this.semiEjeMayor = semiEjeMayor;
		this.semiEjeMenor = semiEjeMenor;
	}


	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*NUMERO_PI*Math.sqrt((this.semiEjeMayor*this.semiEjeMayor+
				this.semiEjeMenor*this.semiEjeMenor)/2);
	}


}
