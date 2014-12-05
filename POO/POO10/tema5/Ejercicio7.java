import java.util.Scanner;
public class Ejercicio7{
		public static void main (String[] arg){
		//preparamos el scanner
		Scanner in = new Scanner(System.in);
		//leemos el numero como string
		System.out.print("Introduce un numero de tres cifras: ");
		//leemos el nombre desde el scanner
		String numero = in.next();
		//comprobamos que tiene 3 cifras con la longitud de la cadena
		if (numero.length() != 3)
			System.out.println("El numero no tiene 3 cifras");
		else{
			char primeraCifra = numero.charAt(0);
			char segundaCifra = numero.charAt(1);
			char terceraCifra = numero.charAt(2);
			if (Character.isDigit(primeraCifra) && Character.isDigit(segundaCifra) && Character.isDigit(terceraCifra))
				System.out.println("Las cifras son: "+primeraCifra+"-"+segundaCifra+"-"+terceraCifra);
			else System.out.println("No son digitos");
			}	
		in.close();
		}
}
