package ejercicio3;

public interface Vehiculo {
	//todo atributo en una interfaz es static y final
	int VELOCIDAD_MAX=120;
	//cualquier metodo es publico
	String acelerar(int velocidad);
	String frenar(int velocidad);
}
