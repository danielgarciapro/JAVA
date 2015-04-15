package ejercicios;
//clase triangulo
public class Ejercicio1 {
	public int lado_a;
	public int lado_b;
	public int lado_c;
	public Ejercicio1(int lado_a, int lado_b, int lado_c) throws TrianguloNoValido{
		if (lado_a+lado_b<lado_c || lado_a+lado_c<lado_b || lado_b+lado_c<lado_a) throw new TrianguloNoValido();
		this.lado_a = lado_a;
		this.lado_b = lado_b;
		this.lado_c = lado_c;
	}
	public static void main(String[] args) {
		try {
			Ejercicio1 triangulo = new Ejercicio1(10, 10, 10);
			System.out.println("Triangulo Valido");
		} catch (TrianguloNoValido e) {
			// TODO Auto-generated catch block
			System.out.println("Triangulo NO valido!!");
			e.printStackTrace();
		}
	}

}
//vamos a crear nuestra propia excepcion
class TrianguloNoValido extends Exception{
}