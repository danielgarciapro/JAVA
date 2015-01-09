package pendulo;

public class TestPenduloArgumentos {

	public static void main(String[] args) {
		double longitud = Double.parseDouble(args[0]);
		Pendulo p2 = new Pendulo(longitud);
		System.out.println(p2);
	}

}
