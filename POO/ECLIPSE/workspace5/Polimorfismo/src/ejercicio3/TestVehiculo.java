package ejercicio3;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo coche = new Coche();
		Vehiculo moto = new Motocicleta();
		
		for (int i = 0; i < 20; i++) {
			int aceleracionCoche = (int) (Math.random()*100);
			int desaceleracionCoche = (int) (Math.random()*100);
			int aceleracionMoto = (int) (Math.random()*100);
			int desaceleracionMoto = (int) (Math.random()*100);
			
			System.out.println("Acelerando coche "+aceleracionCoche+" "+coche.acelerar(aceleracionCoche));
			System.out.println("Acelerando moto "+aceleracionMoto+" "+moto.acelerar(aceleracionMoto));
			System.out.println("Descelerando coche "+desaceleracionCoche+" "+coche.frenar(desaceleracionCoche));
			System.out.println("Descelerando moto "+desaceleracionMoto+" "+moto.frenar(desaceleracionMoto));
		}
	}
}
