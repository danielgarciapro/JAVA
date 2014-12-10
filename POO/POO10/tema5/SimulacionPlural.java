//ejercicio 4
//test de la clase Plural
//vamos a recibir las palabras
//con un Scanner de la entrada
//estándar System.in
import java.util.Scanner;
public class SimulacionPlural{
	public static void main(String[] arg){
		System.out.print("Introduce una palabra\t");
		Scanner in = new Scanner(System.in);
		String palabra; //palabra que lee el scanner
		palabra=in.next(); //recoge la palabra del scanner
		Plural p = new Plural(palabra);//creamos el objeto
		System.out.println("Su plural es: "+p.getPlural());
		in.close(); //buena costumbre
	}
}
