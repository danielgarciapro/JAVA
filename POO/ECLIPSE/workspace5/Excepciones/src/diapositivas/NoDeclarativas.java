package diapositivas;

import java.util.Scanner;

public class NoDeclarativas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definimops un array de tamaño fijo
		//usamos la clase scanner para solicitar una posicion
		int[] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero...");
		//vamos a introducir una posicion inexistente en el array
		int posicion = in.nextInt();
		System.out.println("El valor de la posicion es: "+numeros[posicion]);
		
		//lo que no se debe hacer
		try{
			posicion = in.nextInt();
			System.out.println("El valor de la posicion es: "+numeros[posicion]);
		}catch (java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("Esa posicion no existe");
			//e.printStackTrace();
		}
		
		in.close();
		
	}

}
