package diapositivas;

public class String1 {

	public static void main(String[] args) {
		//4 String definidos de diferente manera
		String String1 = "Hola mundo";
		String String2 = "Hola mundo";
		String String3 = new String("Hola mundo");
		String String4 = new String(new char[]{'H','o','l','a',' ','m','u','n','d','o'}) ;
		//usamos comparador == (comparan posiciones de memoria)
		System.out.println(String1==String2);
		System.out.println(String1==String3);
		System.out.println(String1==String4);
		System.out.println(String3==String4);
		System.out.println(String2==String3);
		System.out.println(String2==String4);
		//usamos metodo equals (comparamos contenido)
		System.out.println("-----------------------");
		System.out.println(String1.equals(String2));
		System.out.println(String1.equals(String3));
		System.out.println(String1.equals(String4));
		System.out.println(String3.equals(String4));
		System.out.println(String2.equals(String3));
		System.out.println(String2.equals(String4));
		//metodo compareTo
		System.out.println("-----------------------");
		System.out.println(String1.compareTo(String2));
		System.out.println(String1.compareTo(String3));
		System.out.println(String1.compareTo(String4));
		System.out.println(String3.compareTo(String4));
		System.out.println(String2.compareTo(String3));
		System.out.println(String2.compareTo(String4));
		//Comprobamos el compareTo con toUpperCase
		System.out.println("-----------------------");
		System.out.println(String1.compareTo(String2.toUpperCase()));
		System.out.println(String2);//toUpperCase no es un metodo mutante
		String2.toUpperCase();
		System.out.println(String2);//toUpperCase no es un metodo mutante
		String aux = String2.toUpperCase();
		System.out.println(aux);
		//StartsWith y EndsWith
		System.out.println("-----------------------");
		System.out.println(String1.startsWith("Hola "));
		System.out.println(String1.endsWith("mundo ".trim()));//trim quita espacios al principio y al final
		//probamos length, concat y charAt
		System.out.println("-----------------------");
		System.out.println(String1.length());
		System.out.println(String1.concat(" ").concat(aux));
		System.out.println(String1+" "+aux);//es lo mismo que el concat
		for (int i = 0; i < String1.length(); i++) {
			System.out.print(String1.charAt(i)+" ");
		}
		System.out.println();
		//imprimimos la cadena al reves y recojemos un substring a partir de ' ' 
		String nuevoString = null;
		for (int i = String1.length()-1; i >= 0; i--) {
			System.out.print(String1.charAt(i));
			if (String1.charAt(i)==' '){
				nuevoString = String1.substring(i+1, String1.length());//String1.length() se puede omitir
			}
		}
		System.out.println();
		System.out.println(nuevoString);
		System.out.println(String1.replace('o', '$'));//cambia todas las o, no mutante
		System.out.println(String1.replace("Hola", "Hello"));//reemplaza Strings
		System.out.println(String1.replaceAll("[aeiou]", "*"));//reemplaza las vocales por *
		System.out.println(String1.replaceFirst("[aeiou]", "*"));//reemplaza solo la primera que encuentra
		String[] array = String1.split("[aeiou]");
		for (int i = 0; i < array.length; i++) {
			System.out.println(i+") "+array[i]);
		}
	}

}
