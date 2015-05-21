package ejercicio3;

public class Motocicleta implements Vehiculo {

	private int velocidad=0;
	//no creo constructor, cuando cree un coche el unico atributo se inicializa a 0
	//trabajamos con el constructor por defecto
	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		this.velocidad+=velocidad;
		String mensaje = "Moto con velocidad actual de " + this.velocidad;
		if (this.velocidad > VELOCIDAD_MAX) mensaje += ", Cuidado velocidad maxima superada!";
		
		return mensaje;
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		if (this.velocidad-velocidad<0) this.velocidad=0;
		else this.velocidad-=velocidad;
		String mensaje = "Moto con velocidad actual de " + this.velocidad;
		if (this.velocidad > VELOCIDAD_MAX) mensaje += ", Cuidado velocidad maxima superada!";
		
		return mensaje;
	}
	public int numeroPlazas(){
		return 2;
	}

}
