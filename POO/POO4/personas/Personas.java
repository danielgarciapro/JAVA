public class Personas{
	private String nombre;//atributos
	private int edad;
	//constructor
	public Personas(String n, int e){
		this.nombre=n;
		this.edad=e;
	}
	//getters
	public String getNombre(){
		return this.nombre;
	}
	public int getEdad(){
		return this.edad;
	}
	//setters
	public void setNombre(String n){
		this.nombre=n;
	}
	public void setEdad(int e){
		this.edad=e;
	}
}
class TestPersona{
	public static void main(String[] arg){
		//new Personas(); ahora no funciona xk ya hay un constructor ya creado
		new Personas("Juan",23);
		//new Personas(23,"Juan"); No funciona xk se le pasa desordenado
		Personas p1 = new Personas("Juan",23);
		Personas p2 = new Personas("Pepe",33);
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		p1=p2;
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
		p1.setNombre("Federico");
		p1.setEdad(18);
		System.out.println(p1+" "+p1.getNombre()+" "+p1.getEdad());//p1 y p2 apuntan al mismo objeto
		System.out.println(p2+" "+p2.getNombre()+" "+p2.getEdad());
	}
}
