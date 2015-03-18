package diapositivas;

import java.util.ArrayList;
import java.util.List;

public class TestClaseParametrizada {

	public static void main(String[] args) {
		//clase parametrizada a Double
		Parametrizada<Double> listaDouble = new Parametrizada<Double>();
		for (int i = 0; i < 10; i++) {
			listaDouble.addLista(new Double(i));
		}
		Double valor = listaDouble.devuelveObjetoPosicion((int) (Math.random()*10));
		System.out.println(valor);
		System.out.println(listaDouble.devuelveObjetoPosicion(11));

		//clase parametrizada a String
		Parametrizada<String> listaString = new Parametrizada<String>();
		for (int i = 0; i < 10; i++) {
			listaString.addLista("palabra "+i);
		}
		String valor2 = listaString.devuelveObjetoPosicion((int) (Math.random()*10));
		System.out.println(valor);
		System.out.println(listaString.devuelveObjetoPosicion(11));
		
		Parametrizada<Persona> listaPersonas = new Parametrizada<Persona>();
		//sirve para listas de personas tambien		
	}

}
class Parametrizada<T>{
	List<T> lista;
	public Parametrizada(){
		lista = new ArrayList<T>();
	}
	//añade objeto T a la lista
	public void addLista(T t){
		this.lista.add(t);
	}
	public T devuelveObjetoPosicion(int i){
		if (i<this.lista.size()) return this.lista.get(i);
		else return null;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Parametrizada [lista=" + lista + "]";
	}
}
class Persona<T>{
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}