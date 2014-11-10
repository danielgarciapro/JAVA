public class TestCoche{
	public static void main (String[] args){
		Coche c1= new Coche();
		c1.setCantidadCombustible(5);
		c1.setConsumoALos100(4.5);
		Coche c2= new Coche();
		c2.setCantidadCombustible(5);
		c2.setConsumoALos100(6.5);
		System.out.println("El coche c1 puede recorrer: "+c1.kmQuePuedeRecorrer()+" KM");
		System.out.println("El coche c2 puede recorrer: "+c2.kmQuePuedeRecorrer()+" KM");
		double km=100;
		c1.combustibleRestante(km);
		c2.combustibleRestante(km);
		System.out.println("El coche c1 le queda de combustible: "+c1.getCantidadCombustible()+" litros");
		System.out.println("El coche c1 le queda de combustible: "+c2.getCantidadCombustible()+" litros");

		}
	}
