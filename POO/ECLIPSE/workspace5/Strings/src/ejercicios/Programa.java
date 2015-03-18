package ejercicios;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args)  throws FileNotFoundException{
		StringBuilder sBuilder = new StringBuilder();
		Scanner sc = new Scanner(new File("nombres_mujer.txt"));
		//Scanner sc = new Scanner(System.in);
		String nombre=null;
        
		while(sc.hasNextLine()) {
			nombre = sc.nextLine();
			sBuilder.append(nombre+" ");
        }
		sc.close();
	
		String nombresMujer = sBuilder.toString();
		System.out.println("Ahora imprimo el string: "+nombresMujer);
		String[] array = nombresMujer.split(" ");
		System.out.println("Palabras leidas = "+array.length);
	
		//creamos todas las listas
		List <String> miListaDeNombres = new ArrayList <String> ();
		List <String> palabrasPorA = new ArrayList <String> ();
		List <String> palabrasNoAcabenPorVocal = new ArrayList <String> ();
		List <String> palabrasMasGrandes = new ArrayList <String> ();
		List <String> palabrasMasPequena = new ArrayList <String> ();
		
		System.out.println("Contenido de arrayList "+miListaDeNombres);
        miListaDeNombres = Arrays.asList(array);
        //lista de palabras que empiezan por a
        for (int i = 0; i < array.length; i++) {
        	if (array[i].matches("[a].*")) palabrasPorA.add(array[i]); 
		}
        
        System.out.println("Lista de palabras por a:");
        palabrasPorA.forEach(System.out::println);
        System.out.println("Un total de "+palabrasPorA.size()+" nombres empiezan por a");
        //lista de palabras que no acaban en vocal
        for (int i = 0; i < array.length; i++) {
        	if (!array[i].matches(".*[aeiou]")) palabrasNoAcabenPorVocal.add(array[i]); 
		}
        System.out.println("\n\n\n\n\n");
        System.out.println("-----------------------------------------");
        System.out.println("Lista de palabras que no acaben por vocal:");
        palabrasNoAcabenPorVocal.forEach(System.out::println);
        System.out.println("Un total de "+palabrasNoAcabenPorVocal.size()+" no acaban por vocal");
        //lista de palabras con mas y menos letras
        int tamanoMaximo=0;
        int tamanoMinimo=0;
        for (int i = 0; i < array.length; i++) {
			if(array[i].length() > tamanoMaximo){
				tamanoMaximo = array[i].length();
			}
		}
        tamanoMinimo=tamanoMaximo;
        for (int i = 0; i < array.length; i++) {
			if(array[i].length() < tamanoMinimo){
				tamanoMinimo = array[i].length();
			}
		}
        for (int i = 0; i < array.length; i++) {
			if(array[i].length() == tamanoMaximo){
				palabrasMasGrandes.add(array[i]);
			}
		}
        for (int i = 0; i < array.length; i++) {
			if(array[i].length() == tamanoMinimo){
				palabrasMasPequena.add(array[i]);
			}
		}
        System.out.println("\n\n\n\n\n");
        System.out.println("-----------------------------------------");
        System.out.println("Maximo tamaño nombre = "+tamanoMaximo);
        System.out.println("Minimo tamaño nombre = "+tamanoMinimo);
        System.out.println("Lista de palabras mas grandes:");
        palabrasMasGrandes.forEach(System.out::println);
        System.out.println("Lista de palabras mas pequeñas:");
        palabrasMasPequena.forEach(System.out::println);
        List <String> listaDePalabrasSugeridas = new ArrayList<String>();
        boolean esta =false;
        if (args.length > 0){
        	for (int i = 0; i < array.length; i++) {
				if(array[i].equalsIgnoreCase(args[0])){
					//System.out.println("La palabra "+args[0]+" existe en la lista");
					esta=true;
					break;
				}
				//else System.out.println("La palabra no se encuentra en la lista");
			}
        	System.out.println("-------------------------------------------------");
        	System.out.println("La palabra "+args[0]+" esta en la lista? "+esta);
        	String comienzaPor = args[0].substring(0,2);
        	for (String string : miListaDeNombres) {
				if (string.startsWith(comienzaPor)) listaDePalabrasSugeridas.add(string);
			}
        }  	
        System.out.println("Palabras sugeridas: "+listaDePalabrasSugeridas);
	}
}