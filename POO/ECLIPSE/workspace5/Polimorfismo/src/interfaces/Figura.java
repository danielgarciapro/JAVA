package interfaces;

public interface Figura {
	//definir una constante
	double NUMERO_PI = 3.1415;
	//comportamiento de los objetos
	double getPerimetro();
	String getNombre();
	
	//vamos a crear un metodo default, JDK 1.8
	default String getTodo(){
		return getPerimetro()+" -- "+getNombre();
	}
}
