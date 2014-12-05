import java.util.Scanner;
public class Ejercicio6{
		public static void main (String[] arg){
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre:\t");
		//leemos el nombre desde el scanner
		String nombre = in.next();
		System.out.println("Hola "+nombre);
		in.close();
		}
}
