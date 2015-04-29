package ejercicio1;

public class PruebaInformaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Analista a1 = new Analista("XXX", "Analisis");
		a1.setSueldo(1000.0);
		Programador p1 = new Programador("YYY", "C");
		p1.setSueldo(1200.0);
		System.out.println(a1);
		System.out.println(p1);
	}

}
