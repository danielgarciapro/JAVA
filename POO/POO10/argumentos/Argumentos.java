//programa que recibe valores desde la linea de comandos
//a estos valores se le llama argumentos
//se recogen en el main en String[] arg (se recogen como String)
public class Argumentos{
	public static void main (String[] arg){
		String argumento1 = arg[0];
		String argumento2 = arg[1];
		System.out.println("Argumentos recibidos: "+argumento1+" ,"+argumento2);
		}
}
