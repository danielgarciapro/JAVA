package diapositivas;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		//parametrizamos poniendo el <String>, de esta forma solo coje Strings
		ArrayList<String> list = new ArrayList<String>();
		//tamaño de la lista (size)
		System.out.println("Tamaño de la lista: "+list.size());
		//añado elementos a la lista (add)
		list.add("Madrid");
		list.add ("Londres");
		list.add ("Milan");
		list.add ("Paris");
		list.add ("New York");
		list.add ("Berlin");
		//compruebo si Paris esta en la lista (contains)
		System.out.println ("¿Esta Paris? " + list.contains ("Paris"));
		//Anadimos otra ciudad en la posicion 2
		list.add (2, "Roma");
		//Localizacion de Madrid en la lista
		System.out.println ("Posición de New York " + list.indexOf ("New York"));
		//Indicamos el numero de objetos de la lista
		System.out.println ("Tamaño de la lista: " + list.size ());
		//Vemos el contenido de la lista, se puede poner solo list
		System.out.println (list.toString ());
		/*Anadimos otra ciudad en la posicion 10, da una excepcion
		list.add (10, "Jaen");*/
		//obtengo el elemento de la lista 5 (New York)
		System.out.println(list.get(5));
		//comprobamos si la lista esta vacia
		System.out.println("Nuestra lista esta vacia? "+list.isEmpty());
		//machaco Jaen en la posicion 0 donde estaba Madrid, el cual desaparece
		list.set(0, "Jaen");
		System.out.println(list);
		//borro la posicion 2 que ocupa Roma, mueve los de delante hacia atras
		list.remove(2);
		System.out.println(list);
		//borra toda la lista
		list.clear();
		System.out.println(list);
	}

}
