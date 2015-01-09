package persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepe", 25);
		System.out.println(p1);
		p1.setEdad(30);
		System.out.println(p1);
		System.out.println("Es mayor de edad? "+p1.esMayorDeEdad());
		p1.setEdad(15);
		System.out.println(p1);
		System.out.println("Es mayor de edad? "+p1.esMayorDeEdad());
	}

}
