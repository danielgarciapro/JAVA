/** Examen tipo B Programacion
 * Programa que representa personas
 * @author Daniel Garcia Merino
 * @author danielgm2626@gmail.com
 * @version 1.0
*/

public class Persona{
	//atributos
	private String nombre = "Juan Garcia Roman";
	private int edad = 18;
	private int dni = 11111111;
	private char sexo = 'H';
	private double peso = 70;
	private double altura = 1.70;
	//constructor por defecto
	public Persona(){
		}
	//constructor con nombre edad y sexo, el resto por defecto
	public Persona(String n, int e, char s){
		this.nombre=n;
		this.edad=e;
		this.sexo=s;
		}
	//constructor con todos los atributos como parametros	
	public Persona(String n, int e, int d, char s, double p, double a){
		this.nombre=n;
		this.edad=e;
		this.dni=d;
		this.sexo=s;
		this.peso=p;
		this.altura=a;
		}
	/*metodo que devuelve el peso ideal(peso en kg dividido por altura 
	en metros al cuadradro). Este sera de visibilidad privada.*/
	private double calcularIMC(){
		return this.peso/(this.altura*this.altura);
		}
	/*metodo que nos devolvera si el individuo esta en peso ideal. 
	 Usara el m ́etodo anterior.*/
	 public boolean estaEnPesoIdeal(){
		 return calcularIMC()<50;		 
		 }
	//metodo que nos devuelve si tienes 18 años o mas.
	public boolean esMayorEdad(){
		return this.edad>=18;
		}
	/*metodo que que genera un DNI aleatorio que sera un numero 
	comprendido entre 0 y 99999999*/
	public double setDNI(){
		double nuevoDni = Math.round(Math.random()*1000000); //le he puesto 6 ceros por que sino me lo pone en notacion cientifica
		this.dni=(int)nuevoDni;
		return nuevoDni;
		}
	//metodo toString
	@Override
	public String toString(){
		return "La persona se llama "+this.nombre+" con DNI "+this.dni+" su edad es "+this.edad+", su sexo es "+this.sexo+
		" , tiene un peso de "+this.peso+" kg y una altura de "+this.altura+" m";
		}
}

class TestPersona{
	public static void main (String[] arg){
		Persona p1= new Persona();
		Persona p2= new Persona("Daniel Garcia Merino",29,'H');
		Persona p3= new Persona("Juan Perez Perez",17,77356589,'H',120,1.60);
		System.out.println("Los datos de la primera persona son: "+p1);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Los datos de la segunda persona son: "+p2);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Los datos de la tercera persona son: "+p3);
		System.out.println("---------------------------------------------------------------");
		System.out.println("¿La ultima persona esta en peso ideal?: "+p3.estaEnPesoIdeal());
		System.out.println("¿Es mayor de edad?: "+p3.esMayorEdad());
		System.out.println("Su nuevo DNI es: "+(int)p3.setDNI());
		System.out.println("---------------------------------------------------------------");
		System.out.println("Los nuevos datos de la tercera persona son: "+p3);
		}
	}
