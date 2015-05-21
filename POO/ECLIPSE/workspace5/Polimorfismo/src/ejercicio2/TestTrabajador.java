package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class TestTrabajador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trabajador t1 = new Oficial("Juan", "Perez", "Oficial 1ª");
		Trabajador t2 = new Oficial("Luis", "Garcia", "Oficial 2ª");
		Trabajador t3 = new Tecnico("Luisa", "Colmenero", true);
		Trabajador t4 = new Tecnico("Daniel", "Rodriguez", false);
		
		//añadimos a una lista de trabajadores
		List<Trabajador> lista = new ArrayList<Trabajador>();
		lista.add(t1);lista.add(t2);lista.add(t3);lista.add(t4);
		
		//recorremos la lista
		//calculamos la paga a todos en 10 dias
		double sueldoTotal=0;
		
		for (Trabajador trabajador : lista) {
			System.out.println(trabajador.nombreApellidos());
			if (trabajador instanceof Oficial) System.out.println(((Oficial) trabajador).getClase());
			sueldoTotal+=trabajador.sueldoMensual(10);
		}
		System.out.println("Sueldo total a pagar en 10 dias: "+sueldoTotal);
		
		
	}

}
