package pendulo;

import java.util.Scanner;

public class TestPenduloScanner {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Dime la longitud:");
		double longitud = in.nextDouble();
		Pendulo p3 = new Pendulo(longitud);
		System.out.println(p3);
		in.close();
	}

}
