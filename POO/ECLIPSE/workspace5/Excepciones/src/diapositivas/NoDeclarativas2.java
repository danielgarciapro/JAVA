package diapositivas;

import java.util.Scanner;

public class NoDeclarativas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hacemos programacion segura
		//intentamos acceder a una posicion que no existe
		int[] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero...");
		int posicion = in.nextInt();//habria que controlar posicion para que solo fuera un numero (expresion regular)
		if (posicion >= numeros.length || posicion < 0){
			System.out.println("Posicion inexistente");
			in.close();
			//salimos con el codigo de error 1
			System.exit(1);
		}
		//desarrollo normal del programa
		System.out.println("El valor de la posicion es: "+numeros[posicion]);
		in.close();
	}

}
