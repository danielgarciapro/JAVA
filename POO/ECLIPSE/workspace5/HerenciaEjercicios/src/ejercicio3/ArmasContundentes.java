package ejercicio3;

public class ArmasContundentes extends Armas{
	private double poderFuerza;
	private int nivelFuerza;
	/**
	 * @param tipo
	 * @param daño
	 * @param poderFuerza
	 * @param nivelFuerza
	 */
	public ArmasContundentes(String tipo, double daño, double poderFuerza,
			int nivelFuerza) {
		super(tipo, daño);
		this.poderFuerza = poderFuerza;
		this.nivelFuerza = nivelFuerza;
	}
	/**
	 * @return the poderFuerza
	 */
	public double getPoderFuerza() {
		return poderFuerza;
	}
	/**
	 * @param poderFuerza the poderFuerza to set
	 */
	public void setPoderFuerza(double poderFuerza) {
		this.poderFuerza = poderFuerza;
	}
	/**
	 * @return the nivelFuerza
	 */
	public int getNivelFuerza() {
		return nivelFuerza;
	}
	/**
	 * @param nivelFuerza the nivelFuerza to set
	 */
	public void setNivelFuerza(int nivelFuerza) {
		this.nivelFuerza = nivelFuerza;
	}
	public double dañoTotal(){
		return super.getDaño()+this.poderFuerza;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArmasContundente [poderFuerza=" + poderFuerza
				+ ", nivelFuerza=" + nivelFuerza + ", "
				+ super.toString() + "]";
	}
	
}
