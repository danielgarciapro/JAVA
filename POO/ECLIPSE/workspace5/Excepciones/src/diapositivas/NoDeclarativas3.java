package diapositivas;

import java.util.Scanner;

public class NoDeclarativas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queremos volver a dar la oprtunidad de introducir la posicion
		int[] numeros = {0,1,2,3,4,5,6,7,8,9};
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero...");
		int posicion = in.nextInt();
		if (posicion >= numeros.length || posicion < 0){
			//volvemos a solicitar la posicion
			System.out.println("Introduce un numero...");
			posicion = in.nextInt();
			System.out.println("El valor de la posicion es: "+numeros[posicion]);
			in.close();
		}
		else System.out.println("El valor de la posicion es: "+numeros[posicion]);
		in.close();
	}

}
