package ejercicio3;

public class Magos extends Personajes {
	private ArmasMagicas arma;
	private int poder;
	/**
	 * @param nombre
	 * @param energia
	 * @param arma
	 * @param poder
	 */
	public Magos(String nombre, ArmasMagicas arma, int poder) {
		super(nombre, 20);
		this.arma = arma;
		this.poder = poder;
	}
	/**
	 * @return the arma
	 */
	public ArmasMagicas getArma() {
		return arma;
	}
	/**
	 * @param arma the arma to set
	 */
	public void setArma(ArmasMagicas arma) {
		this.arma = arma;
	}
	/**
	 * @return the poder
	 */
	public int getPoder() {
		return poder;
	}
	/**
	 * @param poder the poder to set
	 */
	
	
	public void setPoder(int poder) {
		this.poder = poder;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Magos [arma=" + arma + ", poder=" + poder + ", "
				+ super.toString() + "]";
	}
	public void encantar(){
		if (this.getEnergia()<10) System.out.println("No tienes energia!!");
		else {
			setEnergia(getEnergia()-10);
			this.poder+=1;
		}
	}
	
	
	public void curar(){
		if (this.poder<2) System.out.println("No tienes poder!!");
		else {
			this.poder -= 2;
			setEnergia(getEnergia()+10);
		}
	}
}
