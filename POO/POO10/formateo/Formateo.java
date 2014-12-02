public class Formateo{
	public static void main (String[] arg){
		System.out.printf("%.2f%n", 12.3698);//%n hace un salto de linea
		int valor1 = 10;
		double valor2 = 45.56;
		System.out.printf("La cantidad primera es %d y la cantidad 2 es %f%n", valor1, valor2);
		int x=10; double n= 1.25036;
		System.out.printf(" %+.3f %n", n); //+1,250 

		System.out.printf(" %d %n", x); //10 

		System.out.printf("n = %.2f x = %d %n", n, x); //n = 1,25 x = 10 
    
		System.out.printf(" %+10.2f %n", n); 	//		+1,25 
    
		System.out.printf(" %+010.2f %n", n);	// +000001,25
		
		System.out.printf("%8d %8s %8.1f\n", 1234, "Java", 5.6);
		
		System.out.printf("%-8d %-8s %-8.1f \n", 1234, "Java", 5.6);									 
	}
}
