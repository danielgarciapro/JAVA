package diapositivas;

import java.util.Arrays;

public class TestAgenda {

	public static void main(String[] args) {
		Contacto[] contactos = {new Contacto("Manuel", 11223), new Contacto("Pilar", 22334),
				new Contacto("Luis", 44556), new Contacto("Fede", 77889)};
		//convierte el arrays contactos en una lista
		Agenda agenda = new Agenda(Arrays.asList(contactos));
		System.out.println("Agenda: "+agenda);
		//añadimos nuevo contacto
		
		Agenda agenda1 = new Agenda();
		
		for (int i = 0; i < contactos.length; i++) {
			agenda1.addContacto(contactos[i]);
		}
		agenda1.addContacto(new Contacto("Jacinto", 87985));
		System.out.println("Agenda: "+agenda1);
		Contacto c1 = new Contacto("Manuel", 11223);
		System.out.println("Agenda: "+agenda1);
		agenda1.eliminarContacto(c1);
		System.out.println("Agenda: "+agenda1);
		//actualizar un nombre
		c1 = new Contacto("", 111111);
		agenda1.actualizarNombre(c1, "Gabriel");
	}

}
