import java.util.Scanner;
public class Ejercicio8{
		private int horas;
		private int minutos;
		private int segundos;
		
		public Ejercicio8 (int h, int m, int s){
			this.horas=h;
			this.minutos=m;
			this.segundos=s;
			}
		@Override
		public String toString(){
			return "Hora valida: "+this.horas+":"+this.minutos+":"+this.segundos;
			}			
}	
			
class TestHora{		
	public static void main (String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce valor:\t");
		int hora=in.nextInt();
		int minutos=in.nextInt();
		int segundos=in.nextInt();
		in.close();
		if ((hora>=0 && hora<=23)&&(minutos>=0 && minutos<=59)&&(segundos>=0 && segundos<=59)){
			Ejercicio8 e1 = new Ejercicio8(hora,minutos,segundos);
			System.out.println(e1);	
			}
		else System.out.println("Hora no valida");	
		
	}
}
	
