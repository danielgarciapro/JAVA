//para usar int o double hay que hacer el parse
public class ArgumentosNumeros{
	public static void main (String[] arg){
		/*int valor1 = arg[0];
		int valor2 = arg[1];*/
		int valor1 = Integer.parseInt(arg[0]);
		int valor2 = Integer.parseInt(arg[2]);
		//System.out.println("Argumentos recibidos multiplicados: "+valor1*valor2);
		switch (arg[1]){
			case "sumar":
				System.out.println(valor1+valor2);
				break;
			case "restar":
				System.out.println(valor1-valor2);
				break;
			case "multiplicar":
				System.out.println(valor1*valor2);
				break;
			case "dividir":
				System.out.println(valor1/valor2);
				break;
			default:
				System.out.println("Operacion "+arg[1]+" no permitida");
			}
	}
}
