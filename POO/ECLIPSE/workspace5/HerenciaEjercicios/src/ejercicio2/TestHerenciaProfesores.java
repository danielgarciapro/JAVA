package ejercicio2;

public class TestHerenciaProfesores {

	public static void main(String[] args) {
		
		ProfesorTitular pt1 = new ProfesorTitular("Juan", "12345678T", 37, "Dibujo", 12);
		ProfesorTitular pt2 = new ProfesorTitular("Pepa", "77665544R", 40, "Matematicas", 7);
		ProfesorTitular pt3 = new ProfesorTitular("Daniel", "82635401L", 54, "Biologia", 2);
		
		ProfesorInterino pi1 = new ProfesorInterino("Luis", "26543688D", 33, "Filosofia", 12);
		ProfesorInterino pi2 = new ProfesorInterino("Diego", "98643256E", 27, "Fisica", 24);
		ProfesorInterino pi3 = new ProfesorInterino("Jesus", "98722299P", 57, "Lengua", 6);
		
		ListinProfesores lista = new ListinProfesores();
		lista.addProfesor(pt1);
		lista.addProfesor(pt2);
		lista.addProfesor(pt3);
		lista.addProfesor(pi1);
		lista.addProfesor(pi2);
		lista.addProfesor(pi3);
		
		for (Profesor p : lista.getListaProfesores()) {
			System.out.println(p);
		}

	}

}
