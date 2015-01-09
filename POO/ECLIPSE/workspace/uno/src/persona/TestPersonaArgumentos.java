package persona;

public class TestPersonaArgumentos {

	public static void main(String[] args) {
		String nombre = args[0];
		int edad = Integer.parseInt(args[1]);
		Persona p2 = new Persona(nombre, edad);
		System.out.println(p2);
		if (p2.esMayorDeEdad()) {
			System.out.println(p2.getNombre()+" Es mayor de edad");
		} else {
			System.out.println(p2.getNombre()+" Es menor de edad");
		}
	}

}
