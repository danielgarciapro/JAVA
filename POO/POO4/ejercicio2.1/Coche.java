public class Coche{
	private double cantidadCombustible;
	private double consumoAlos100Km;
	//getter y setter
	public double getCantidadCombustible(){
		return this.cantidadCombustible;
		}
	public void setCantidadCombustible(double cantidad){
		this.cantidadCombustible+=cantidad;
		}
	//conocer los km que puede recorrer con el combustible que tiene
	public double kmQuePuedeRecorrer(){
		return this.cantidadCombustible*100/this.consumoAlos100Km;
		}
	//setter para consumo a los 100
	public void setConsumoALos100(double consumo){
		this.consumoAlos100Km=consumo;
		}
	//Este metodo no lo pide el ejercicio
	//metodo que ajusta el combustible despues de recorrer cierta distancia
	public void combustibleRestante(double km){
		this.cantidadCombustible-=km*this.consumoAlos100Km/100;
		System.out.println("¿Puede realizar el trayecto de "+km+" km? "+(this.cantidadCombustible >=0));
		}
}


