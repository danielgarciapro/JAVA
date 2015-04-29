package ejercicio3;

public class Armas {
	private String tipo;
	private double daño;
	/**
	 * @param tipo
	 * @param daño
	 */
	public Armas(String tipo, double daño) {
		this.tipo = tipo;
		this.daño = daño;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the daño
	 */
	public double getDaño() {
		return daño;
	}
	/**
	 * @param daño the daño to set
	 */
	public void setDaño(double daño) {
		this.daño = daño;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Arma [tipo=" + tipo + ", daño=" + daño + "]";
	}
	
}
