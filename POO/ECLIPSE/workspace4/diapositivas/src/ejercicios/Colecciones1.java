package ejercicios;

import java.util.Arrays;

/* Crea una clase denominada Colecciones1, que tenga como atributo un array
y que el constructor inicialize dicho array para almacenar doce valores de tipo
entero. Posteriormente en una clase denominada testColecciones1 :
	Asigna el valor 5 al ultimo elemento.
	Asigna el resto de valores con un bucle que el primer elemento sea 3 y los 
	restantes el doble del anterior.
	Mediante un bucle calcula la suma de todos los elementos del array.
	Cambia el valor del array y divide por 3 todos los ultimo cinco valores.
	Calcula ahora el valor mas pequeño almacenado en el array.
	Muestra todos los valores en tres filas de cuatro columnas, con una separacion de cinco espacios.*/
public class Colecciones1 {
	private int[] array;
	private static final int TAMANO = 12;
	public Colecciones1() {
		 this.array=new int[TAMANO];
	}
	public int[] getArray() {
		return array;
	}
	public void setPosicion(int posicion, int valor) {
		this.array[posicion] = valor;
	}
	@Override
	public String toString() {
		return "Colecciones1 [i=" + Arrays.toString(array) + "]";
	}
}
