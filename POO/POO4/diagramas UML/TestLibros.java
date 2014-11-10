public class TestLibros{
	public static void main (String[] args){
		//creamos objetos o instancias de la clase libro
		Libros l1=new Libros("Cervantes","1234567890","El Quijote");
		Libros l2=new Libros("Anonimo","1234567899","El Lazarillo");
		Libros l3=new Libros("Fernando de Rojas","1234567898","La Celestina");
		//vamos a invocar el metodo toString
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		//consulta de disponibilidad
		System.out.println(l1+" DISPONIBLE: "+l1.getDisponible());
		System.out.println(l2+" DISPONIBLE: "+l2.getDisponible());
		System.out.println(l3+" DISPONIBLE: "+l3.getDisponible());
		//prestamos los 2 primeros libros
		l1.prestar(); l2.prestar();
		System.out.println("--------------------------------------");
		System.out.println(l1+" DISPONIBLE: "+l1.getDisponible());
		System.out.println(l2+" DISPONIBLE: "+l2.getDisponible());
		System.out.println(l3+" DISPONIBLE: "+l3.getDisponible());
		l1.devolver();
		System.out.println("--------------------------------------");
		System.out.println(l1+" DISPONIBLE: "+l1.getDisponible());
		System.out.println(l2+" DISPONIBLE: "+l2.getDisponible());
		System.out.println(l3+" DISPONIBLE: "+l3.getDisponible());
		}
}
