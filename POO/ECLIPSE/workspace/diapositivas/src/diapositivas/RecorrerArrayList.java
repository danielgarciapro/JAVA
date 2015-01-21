package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class RecorrerArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int[] arrayEnteros = {1,2,3,4,5,6,7,8,9};
		//recorre el array y lo añade a la lista
		for (int i = 0; i < arrayEnteros.length; i++) {
			lista.add(arrayEnteros[i]);
		}
		System.out.println(lista.size());
		System.out.println(lista);
		Integer numero = new Integer(10);
		lista.add(0, numero);
		System.out.println(lista);
		Integer numero2 = new Integer(100);
		lista.set(0, numero2);
		System.out.println(lista);
		//vamos a ver cuales son pares
		int contadorPares = 0;
		for (int i = 0; i < lista.size(); i++) {
			if ((lista.get(i) % 2) == 0) contadorPares++;
		}
		System.out.println("Valores pares en la lista: "+contadorPares);
		//vamos a encontrar numeros impares y añadirlo a una nueva lista
		//usamos el pòlimorfismo para crear listaImpares
		List<Integer> listaImpares = new ArrayList<Integer>();
		//iteracion con bucle extendido:
		for (Integer integer : lista){
			if ((integer % 2) != 0) listaImpares.add(integer);
		}
		System.out.println("Lista de impares: "+listaImpares);
		//usando el metodo forEach
		//introducido en Java 8
		lista.forEach(System.out::println);
	}

}
