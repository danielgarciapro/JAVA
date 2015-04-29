package ejercicio3;

public class Guerreros extends Personajes {
	private ArmasContundentes arma;
	private int brutalidad;

	/**
	 * @param nombre
	 * @param energia
	 * @param arma
	 * @param brutalidad
	 */
	public Guerreros(String nombre, double energia, ArmasContundentes arma,
			int brutalidad) {
		super(nombre, energia);
		this.arma = arma;
		this.brutalidad = brutalidad;
	}

	/**
	 * @return the arma
	 */
	public ArmasContundentes getArma() {
		return arma;
	}

	/**
	 * @param arma the arma to set
	 */
	public void setArma(ArmasContundentes arma) {
		this.arma = arma;
	}
	
	/**
	 * @return the brutalidad
	 */
	public int getBrutalidad() {
		return brutalidad;
	}

	/**
	 * @param brutalidad the brutalidad to set
	 */
	public void setBrutalidad(int brutalidad) {
		this.brutalidad = brutalidad;
	}
	public void berserker(){
		if (this.brutalidad<2) System.out.println("No tienes brutalidad!!");
		else {
			this.brutalidad -= 2;
			setEnergia(getEnergia()+10);
		}
	}

	public void combatir(double energiaUsada){
		if (getEnergia()<energiaUsada) System.out.println("No tienes sufiente energia para ese ataque!!");
		else {
			setEnergia(getEnergia()-energiaUsada);
			this.brutalidad += 1;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Guerrero [arma=" + arma + ", brutalidad=" + brutalidad
				+ ", " + super.toString() + "]";
	}

	
	
}
