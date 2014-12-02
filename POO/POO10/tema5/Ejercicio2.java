//ejercicio2 tema 5
import javax.swing.JOptionPane;
public class Ejercicio2{
	public static void main (String[] arg){
		{
		//Un programa que imprima los numeros del 1 al 10.
		for(int i=1;i<=10;i++){
			System.out.printf("%-5d",i);
			}
		}
		System.out.println("--------------------------------------------");
		{
		//Un programa que imprima la siguiente serie: 20 25 30 35 . . . 70 75 80
		int i=20;
		while (i <=80){
			System.out.println("Numero "+i);
			i += 5;
			}
		}
		System.out.println("--------------------------------------------");
		{
		//Un programa que imprima la siguiente serie: 100 98 96 94 . . . 56 54 52 50
		int i=100;
		do{
			System.out.println("Numero "+i);
			i -= 2;
			}
		while (i>=50);		
		}
		System.out.println("--------------------------------------------");
		{
		//Un programa que calcule la suma de los numeros enteros del 1 al 100.
		int i;
		int suma = 0;
		for (i=1;i<=100;i++){
			suma += i;
			System.out.println("La suma es: "+suma);
			}
		}
		System.out.println("--------------------------------------------");
		{
		//Un programa que calcule la la suma de los cuadrados de los 15 primeros numeros naturales.
		int i=1;
		int suma=0;
		while (i<=15){
			suma += i*i;
			System.out.println("La suma es: "+suma);
			i++;
			}
		}
		System.out.println("--------------------------------------------");
		{
		//Un programa que calcule la suma de los pares e impares comprendidos entre 1 y 50.
		int i=1;
		int suma=0;
		do{
			if (i%2 == 0 || i%3 ==0){
				suma += i;
				System.out.println("La suma es: "+suma);
				}
			i++;
			}
		while (i<=50);
		}
		System.out.println("--------------------------------------------");
		{
		//Un programa que dado un numero entero positivo, reporte su tabla de +multiplicar.
		int i;
		String num = JOptionPane.showInputDialog("Introduce el numero entre el 0 y el 10 para saber su tabla de multiplicar... ");
		int numero=Integer.parseInt(num);
		if (numero>=0 && numero<=10){
			for(i=0;i<=10;i++){
				System.out.println(i*numero);
				}
			}
		else System.out.println("Numero no valido");
		}
	}
}
