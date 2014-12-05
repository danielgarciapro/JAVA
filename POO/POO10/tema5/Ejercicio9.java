import java.util.Scanner;
public class Ejercicio9{
	public static void main (String[] arg){
		final int NUMERO_VALORES = 6;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce valores ... ");
		//recogemos la suma en una variable
		double suma = 0;
		for (int i=0; i<NUMERO_VALORES; i++){
			double valor = in.nextDouble();
			if (i%2 == 0 && i!=0) // para tabular en 2 columnas
				System.out.println("");
			//formateo con 10 caracteres(10) alineados a la derecha (para izq -) con 2 decimales(.2) y para valores decimales (f)
			System.out.printf("%10.2f",valor);
			suma+=valor;
			}
		in.close();
		System.out.println("\nValor medio: "+suma/NUMERO_VALORES);
		}
}
