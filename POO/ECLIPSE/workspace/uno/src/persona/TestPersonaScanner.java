package persona;

import java.util.Scanner;

public class TestPersonaScanner {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Dime el nombre");
		String nombre = in.next();
		System.out.println("Dime edad");
		int edad = in.nextInt();
		Persona p = new Persona(nombre, edad);
		System.out.println(p);
		in.close();
	}

}
