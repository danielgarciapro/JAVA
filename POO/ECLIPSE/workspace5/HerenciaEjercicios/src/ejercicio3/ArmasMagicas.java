package ejercicio3;

public class ArmasMagicas extends Armas {
	private double poderMagico;
	private int nivelMagico;
	/**
	 * @param tipo
	 * @param daño
	 * @param poderMagico
	 * @param nivel
	 */
	public ArmasMagicas(String tipo, double daño, double poderMagico, int nivel) {
		super(tipo, daño);
		this.poderMagico = poderMagico;
		this.nivelMagico = nivel;
	}
	/**
	 * @return the poderMagico
	 */
	public double getPoderMagico() {
		return poderMagico;
	}
	/**
	 * @param poderMagico the poderMagico to set
	 */
	public void setPoderMagico(double poderMagico) {
		this.poderMagico = poderMagico;
	}
	/**
	 * @return the nivel
	 */
	public int getNivelMagico() {
		return nivelMagico;
	}
	/**
	 * @param nivel the nivel to set
	 */
	public void setNivelMagico(int nivel) {
		this.nivelMagico = nivel;
	}
	public double dañoTotal(){
		return super.getDaño()+this.poderMagico;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArmasMagica [poderMagico=" + poderMagico + ", nivelMagico="
				+ nivelMagico + ", " + super.toString() + "]";
	}
	
}
