package ejercicio5;

public class TestMath3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numerosEnteros = {2,1,3,1,4,5};
		double[] numerosReales = {2.1,1.3,25,4.6,7.6,18.9};
		Math3 m = new Math3();//sin metodos estaticos tengo que crear una referencia
		System.out.println(m.max(numerosEnteros));
		System.out.println(m.min(numerosEnteros));
		System.out.println(m.max(numerosReales));
		System.out.println(m.min(numerosReales));
		System.out.println("---------------------");//con metodos estaticos no necesito crear la referencia
		System.out.println(Extremos1.max(numerosEnteros));
		System.out.println(Extremos1.min(numerosEnteros));
		System.out.println(Extremos1.max(numerosReales));
		System.out.println(Extremos1.min(numerosReales));
	}

}
