package diapositivas;

import java.util.Scanner;

//Leer con scanner una linea completa (hay 1 coche en la cochera1)
//1- Indicar si la linea tiene algun numero
//2- Indicar cuantas palabras tiene un numero
//3- Indicar cuantos numeros hay en esa frase
//4- Indicar cuantas palabras empiezan por vocal
public class String2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		System.out.println(s1);
		//1- Indicar si la linea tiene algun numero
		//. es cualquier caracter excepto salto de linea
		//* es cero o mas
		//+ es uno o mas
		//[0-9] quiere decir 0 o 1 o 2 .... o 9
		System.out.println(s1.matches(".*[0-9]+.*"));
		//2- Indicar cuantas palabras tiene un numero
		String[] array = s1.split(" ");
		int contador=0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
			if (array[i].matches(".*[0-9]+.*")) contador++;
		}
		System.out.println("Hay "+contador+" palabras con numero");
		//3- Indicar cuantos numeros hay en esa frase
		char[] arrayChar = s1.toCharArray();
		int contador2 = 0;
		for (int i = 0; i < arrayChar.length; i++) {
			System.out.println(i+") "+arrayChar[i]);
			if (Character.isDigit(arrayChar[i])) contador2++;//Character es un metodo estatico
		}													//se pone delante
		System.out.println("Hay "+contador2+" numeros");
		//4- Indicar cuantas palabras empiezan por vocal
		int contador3 = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
			if (array[i].toLowerCase().matches("[aeiou].*")) contador3++;
		}
		System.out.println("Hay "+contador3+" palabras que empiezan por vocal");
	}

}
