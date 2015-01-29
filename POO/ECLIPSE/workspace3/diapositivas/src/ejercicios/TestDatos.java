package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class TestDatos {

	public static void main(String[] args) {
		//creo el arrayList
		List<Double> lista = new ArrayList<Double>();
		//le meto valores de 3 formas distintas
		lista.add(1.0);
		lista.add(new Double(3));
		lista.add((double) 15);
		lista.add(7.0);
		lista.add(2.0);
		//creo el array del tamaño del arrayList
		//le doy los valores del arrayList(lista) al array(datos)
		double [] datos = new double[lista.size()];
		for (int i = 0; i < lista.size(); i++) {
			datos [i] = lista.get(i);
		}
		//creo el objeto tipo datos pasandole el array(datos)
		Datos d = new Datos(datos);
		System.out.println(d);
		System.out.printf("El valor medio es %.2f",d.valorMedio());
		System.out.println();
		System.out.printf("La desviacion tipica es %.2f",d.desviacionTipica());
		System.out.println();
		System.out.println("Datos por debajo de la media "+d.datosDebajoMedia());
		System.out.println("Valor minimo "+d.minimoValor());
		System.out.println("Valor maximo "+d.maximoValor());
	}

}
