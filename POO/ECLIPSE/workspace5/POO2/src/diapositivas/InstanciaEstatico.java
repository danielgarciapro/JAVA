package diapositivas;

public class InstanciaEstatico {
	public final int CONSTANTE = 5; //habria k crear la variable como estatic para acceder a ella
	public static void main(String[] args) {
		Cuadrado c1 = new Cuadrado(10);
		Cuadrado c2 = new Cuadrado(20);
		System.out.println("Valor de la arista "+c1.getArista());
		System.out.println("Numero de cuadrados "+c1.getNumeroCuadrados());
		System.out.println("Numero de cuadrados "+Cuadrado.getNumeroCuadrados());
		//System.out.println("valor de la constante "+CONSTANTE);	
		//accedemos a version1
		//debemos crear un objeto o aprobechar alguno que exista
		InstanciaEstatico nuevoObjeto = new InstanciaEstatico();
		System.out.println("Numero aleatorio; "+nuevoObjeto.version1());
		//accedemos al metodo de clase version2, mno hace falta crear objeto
		System.out.println("Numero aleatorio: "+InstanciaEstatico.version2());
		//aprobechando el objeto
		System.out.println("Numero aleatorio: "+nuevoObjeto.version2());
	}
	public int version1(){
		return (int) (Math.random()*100);
	}
	public static int version2(){
		return (int) (Math.random()*100);
	}
}

class Cuadrado{
	private int arista;
	private static int numeroCuadrados=0;
	
	public Cuadrado(int arista) {
		this.arista = arista;
		numeroCuadrados++;
	}

	public int getArista() {
		return arista;
	}

	public void setArista(int arista) {
		this.arista = arista;
	}

	public static int getNumeroCuadrados() {
		return numeroCuadrados;
	}

	public static void setNumeroCuadrados(int numeroCuadrados) {
		Cuadrado.numeroCuadrados = numeroCuadrados;
	}

	@Override
	public String toString() {
		return "Cuadrado [arista=" + arista + "]";
	}
	/*public static int aristaPorDos(){
		return this.ar
	}*/
	
}