package ejercicios;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		in.close();
		PalabraLeida p1 = new PalabraLeida();
		System.out.println("El numero de letras de la palabra "+s1+" es : "+p1.numeroDeLetras(s1));
		System.out.println("La palabra empieza por vocal? "+p1.empiezaPorVocal(s1));
		System.out.println("La palabra acaba por vocal? "+p1.acabaPorVocal(s1));
		System.out.println("Cuantas vocales tiene "+s1+" :"+p1.numeroDeVocales(s1));
		System.out.println("Tiene "+s1+" H?:"+p1.contieneH(s1));
		System.out.println("Es un palindromo?"+p1.esUnPalindromo(s1));
		if (args.length > 0)
			System.out.println("Son iguales "+s1+" y "+args[0]+" ?"+p1.sonIguales(s1,args));
	}

}