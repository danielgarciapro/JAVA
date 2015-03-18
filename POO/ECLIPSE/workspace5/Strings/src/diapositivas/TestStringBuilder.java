package diapositivas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestStringBuilder {

	public static void main(String[] args) {
		//crear un StringBuilder a partir de String que leemos por Scanner
		Scanner in = new Scanner(System.in);
		StringBuilder sBuilder = new StringBuilder();
		String aux = null;
		System.out.println("Introduce las palabras, exit para salir :");
		while (true){
			aux = in.next();
			if (aux.equalsIgnoreCase("exit")) break; //condicion de salida (exit)
			//falta crear un filtro
			if (Auxiliar.requisitos(aux))
			sBuilder.append(aux+"-");
		}
		in.close();
		System.out.println("Contenido del StringBuilder = "+sBuilder);
		//le damos la vuelta al StringBuilder
		sBuilder.reverse(); //es mutante el metodo
		System.out.println("Contenido del StringBuilder = "+sBuilder);
		//metodo para eliminar el espacio en blanco al principio
		sBuilder.deleteCharAt(0);
		System.out.println("Contenido del StringBuilder = "+sBuilder);
		//convertimos el StringBuilder a String
		String s1 = sBuilder.toString();
		//guardamos en un array de Strings usando el delimitador
		String[] arrayString = s1.split(" ");
		for (int i = 0; i < arrayString.length; i++) {
			System.out.println(i+") "+arrayString[i]);
		}
		//convertir a arrayList
		List<String> Lista = new ArrayList<String>();
		for (int i = 0; i < arrayString.length; i++) {
			Lista.add(arrayString[i]);;
		}
		System.out.println(Lista);
		//existe un metodo que convierte los array en List
		List<String> Lista2 = Arrays.asList(arrayString);
		System.out.println(Lista2);
	}

}
