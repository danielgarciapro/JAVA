package diapositivas;

import java.time.LocalDate;

public class TestVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1 = new Coche(7, true, false);
		Coche c2 = new Coche(4, false, false);
		Motocicleta m1 = new Motocicleta(600);
		Motocicleta m2 = new Motocicleta(250);
		c1.setPropietario("Pepito Perez");
		c2.setPropietario("Juan Garcia");
		m1.setPropietario("Luisa Jimenez");
		m2.setPropietario("Luis Mesa");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m1);
		System.out.println(m2);
	}

}
class Vehiculo{
	//atributos de la clase padre
	private int numeroRuedas;
	private LocalDate fechaCompra;
	private String propietario;
	private int numeroPasajeros;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 */
	//constructor de la clase padre, fecha de compra coincide con la fecha de creacion del objeto
	public Vehiculo(int numeroRuedas, int numeroPasajeros) {
		this.numeroRuedas = numeroRuedas;
		this.fechaCompra = LocalDate.now();
		this.numeroPasajeros = numeroPasajeros;
	}
	/**
	 * @return the numeroRuedas
	 */
	public int getNumeroRuedas() {
		return numeroRuedas;
	}
	/**
	 * @return the fechaCompra
	 */
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	/**
	 * @return the numeroPasajeros
	 */
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", fechaCompra="
				+ fechaCompra + ", propietario=" + propietario
				+ ", numeroPasajeros=" + numeroPasajeros + "]";
	}
}

class Coche extends Vehiculo{
	//atributos propios de la clase coche
	private boolean diesel;
	private boolean descapotable;
	/**
	 * @param numeroRuedas
	 * @param fechaCompra
	 * @param numeroPasajeros
	 * @param diesel
	 * @param descapotable
	 */
	public Coche(int numeroPasajeros,
			boolean diesel, boolean descapotable) {
		super(4, numeroPasajeros);// inicializa atributos de la clase padre
		//inicializamos clase hija
		this.diesel = diesel;
		this.descapotable = descapotable;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	//importante sobreescribir el toString, incluyendo el de la clase padre
	@Override
	public String toString() {
		return "Coche [diesel=" + diesel + ", descapotable=" + descapotable
				+ ", " + super.toString() + "]";
	}
	
}

class Motocicleta extends Vehiculo{
	private int cilindrada;

	/**
	 * @param numeroRuedas
	 * @param numeroPasajeros
	 * @param cilindrada
	 */
	public Motocicleta(int cilindrada) {
		super(2, 2);
		this.cilindrada = cilindrada;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada + ", "
				+ super.toString() + "]";
	}
	
}
