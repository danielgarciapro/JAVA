package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {
	public static void main(String[] args) throws FileNotFoundException{
		//StringBuilder sBuilder = new StringBuilder();
		Scanner sc = new Scanner(new File("constitucion.txt"));
		//Scanner sc = new Scanner(System.in);
		String nombre=null;
        List <String> listaPalabras = new ArrayList<String>();
        
		while(sc.hasNext()) {
			nombre = sc.next();
			if (nombre.matches(".*[\\p{Punct}]")){
				//System.out.println(nombre.substring(0, nombre.length()-1));
				listaPalabras.add(nombre.substring(0, nombre.length()-1));
			}
			else{
				listaPalabras.add(nombre);
			}
        }
		sc.close();
		for (int i = 0; i < listaPalabras.size(); i++) {
			System.out.println(i+") "+listaPalabras.get(i));	
		}
		//creamos el StringBuilder
		StringBuilder stringAleatorios = new StringBuilder();
		//creamos la posicion aleatoria
		//añadimos 500 string aleatorios al StringBuilder
		for (int i = 0; i < 500; i++) {
			int posicion = (int) (Math.random()*listaPalabras.size());
			//System.out.println(posicion);
			stringAleatorios.append(listaPalabras.get(posicion)+" ");
		}
		System.out.println(stringAleatorios);
		String pAleatorias = stringAleatorios.toString();
		String[] palabrasAleatorias = pAleatorias.split(" ");
		System.out.println(palabrasAleatorias.length);
		
		//probamos la clase utilidades
		//convertimos la lista de palabras a string
		
		String aux = "";
		for (String string : listaPalabras) {
			aux += string + " ";
		}
		
		UtilidadesString frase = new UtilidadesString();
		
		//Resultados de la constitucion
		System.out.println("Tamaño de la constitucion: "+frase.numeroPalabras(aux));
		System.out.println("Numero de articulos determinados: "+frase.numeroArticulosDeterminados(aux));
		System.out.println("Numero de articulos indeterminados: "+frase.numeroArticulosIndeterminados(aux));
		System.out.println("Numero de preposiciones: "+frase.numeroPreposiciones(aux));
		System.out.println("Frase en mayusculas: "+frase.devolverMayuscula(500, 550, aux));
	}
}
