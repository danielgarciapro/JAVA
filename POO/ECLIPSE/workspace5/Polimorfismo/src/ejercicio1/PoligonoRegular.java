package ejercicio1;

public abstract class PoligonoRegular {
	private String nombre;
	private int numeroLados;
	private double longitudLado;
	/**
	 * @param nombre
	 * @param numeroLados
	 * @param longitudLado
	 */
	public PoligonoRegular(String nombre, int numeroLados, double longitudLado) {
		this.nombre = nombre;
		this.numeroLados = numeroLados;
		this.longitudLado = longitudLado;
	}
	
	public double getPerimetro(){
		return this.numeroLados*this.longitudLado;
	}
	
	public abstract double getArea();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PoligonoRegular [nombre=" + nombre +  ", longitudLado=" + longitudLado + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(longitudLado);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numeroLados;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Double.doubleToLongBits(longitudLado) != Double
				.doubleToLongBits(other.longitudLado))
			return false;
		if (numeroLados != other.numeroLados)
			return false;
		return true;
	}

	/**
	 * @return the numeroLados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * @param numeroLados the numeroLados to set
	 */
	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}
	
	/**
	 * @return the longitudLado
	 */
	public double getLongitudLado() {
		return longitudLado;
	}

	/**
	 * @param longitudLado the longitudLado to set
	 */
	public void setLongitudLado(double longitudLado) {
		this.longitudLado = longitudLado;
	}

	/**
	 * @param anotherString
	 * @return
	 * @see java.lang.String#compareTo(java.lang.String)
	 */
	public int compareTo (Object o) {
		
		PoligonoRegular other = (PoligonoRegular) o;
		return this.numeroLados-other.numeroLados;
	}
	
	
}
