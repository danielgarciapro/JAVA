package ejercicios;

public class Ventilador {
	private Velocidad rapidez = Velocidad.LENTO;
	private boolean encencido = false;
	private double radio = 50.0;
	private String color = "blanco";
	/**
	 * @return the rapidez
	 */
	public Velocidad getRapidez() {
		return rapidez;
	}
	/**
	 * @param rapidez the rapidez to set
	 */
	public void setRapidez(Velocidad rapidez) {
		this.rapidez = rapidez;
	}
	/**
	 * @return the encencido
	 */
	public boolean isEncencido() {
		return encencido;
	}
	/**
	 * @param encencido the encencido to set
	 */
	public void setEncencido(boolean encencido) {
		this.encencido = encencido;
	}
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ventilador [rapidez=" + rapidez + ", encencido=" + encencido
				+ ", radio=" + radio + ", color=" + color + "]";
	}
	
	
}
