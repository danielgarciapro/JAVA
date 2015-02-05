package diapositivas;

public class TestPersonas {

	public static void main(String[] args) {
		ListaPersonas lista = new ListaPersonas();
		System.out.println("Nada mas iniciar :");
		System.out.println(lista);
		Persona p1 = new Persona(15,"Juan");
		Persona p2 = new Persona(25,"Pedro");
		Persona p3 = new Persona(56,"Luis");
		Persona p4 = new Persona(12,"Antonio");
		Persona p5= new Persona(30,"Daniel");
		lista.addPersona(p1);
		lista.addPersona(p2);
		lista.addPersona(p3);
		lista.addPersona(p4);
		lista.addPersona(p5);
		System.out.println("Despues de añadir las personas: ");
		System.out.println(lista);
		System.out.println("Existe Pedro? "+lista.exixtePersona(p2));
		lista.addPersona(new Persona(52, "Rodrigo"));
		System.out.println(lista);
		lista.eliminarPersona(p5);
		System.out.println(lista);
		Persona p6 = new Persona(12, "Pepe");
		System.out.println("Existe p6? "+lista.exixtePersona(p6));
		System.out.println("Existe Rodrigo? "+lista.exixtePersona(new Persona(52, "Rodrigo")));
		Persona p7 = new Persona(52,"Rodrigo");
		System.out.println("Exixte p7? "+lista.exixtePersona(p7));
		lista.modificarNombrePersona(p1, "Gregorio");
		System.out.println(lista);
	}

}
