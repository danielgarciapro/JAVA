//ejercicio6
// recibimos un valor desde la entrada scanner
import java.util.Scanner;
public class Escaner{
	public static void main (String[] arg){
		/*Scanner in = new Scanner(System.in);
		System.out.println("Introduce un valor: ...");
		String linea = in.nextLine();
		String entrada = in.next();	
		int numero = in.nextInt();
		double decimal = in.nextDouble();
		//cerramos el scanner
		in.close();
		System.out.println("Introducido : "+entrada+" "+numero+" "+decimal);
		System.out.println("Linea: "+linea);*/
		//nuevo escaner
		Scanner in1 = new Scanner(System.in);
		System.out.println("Introduce un valor: ...");
		//vamos a contar cuantas veces introducimos el 1
		int contador=0;
		while(true){	//solo se puede salir con un break
			String palabra= in1.next();
				if (palabra.equals("1"))
					contador++;
				if (palabra.equals("salida"))
					break;
			}
		in1.close();
		System.out.println("Has introducido el numero 1 "+contador+" veces");
	}
}
