package diapositivas;

public class TestHerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hija h = new Hija();//siempre se crea un objeto de la clase padre
	}

}
class Padre{
	public Padre(){
		System.out.println("Creado objeto de la clase Padre");
	}
}
class Hija extends Padre{
	public Hija(){
		System.out.println("Creado objeto de la clase Hija");
	}
}