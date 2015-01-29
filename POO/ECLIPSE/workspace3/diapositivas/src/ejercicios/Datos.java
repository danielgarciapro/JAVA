/**
 * Ejercicio numero 3 del tema de colecciones
 * @author Daniel Garcia Merino
 * @version 1.0
 */
package ejercicios;

import java.util.Arrays;

public class Datos {
	private double[] array;
	/**
	 * Constructor
	 * @param double[] array
	 *
	 */
	public Datos(double[] array) {
		this.array = array;
	}
	/**
	 * Metodo que da el valor medio de dichos datos.
	 * @return double valorMedio
	 *
	 */
	public double valorMedio(){
		double suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma+=array[i];
		}
		double valorMedio = suma/array.length;
		return valorMedio;
	}
	//La desviacion tipica.
	public double desviacionTipica(){
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma+=Math.pow(array[i], 2);
		}
		return Math.sqrt((suma/array.length) - Math.abs(Math.pow(valorMedio(), 2)));
	}
	//Numero de datos que se encuentran por debajo de la media.
	public int datosDebajoMedia(){
		int valores=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]<valorMedio()) valores++; 
		}
		return valores;
	}
	//El valor minimo.
	public double minimoValor(){
		Arrays.sort(array);
		return array[0];
	}
	//El valor maximo.
		public double maximoValor(){
			Arrays.sort(array);
			return array[array.length-1];
		}
	@Override
	public String toString() {
		return "Datos [array=" + Arrays.toString(array) + "]";
	}
	
}
