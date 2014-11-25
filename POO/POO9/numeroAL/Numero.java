import java.util.Random;
public class Numero{
	private int numero;
	public Numero(int n){
		this.numero=n;
		}
	//metodo que averigua el valor de dicho atributo
	public int averigua(){
		int numeroADescubrir=0;
		for (int i=0; i<1000; i++){
			System.out.println("Dentro del bucle: "+i);
			if (this.numero==i){
				numeroADescubrir=i;
				break; //si no pongo el break se ejecuta 1000 veces
				}
			}
			return numeroADescubrir;
		}
	
}
class TestNumeroAleatorio{
	public static void main(String[] args){
		Random r = new Random();
		int numero = r.nextInt(1000); //numero aleatorio entre 0 y 999
		System.out.println(numero);
		Numero n = new Numero(numero);
		System.out.println("Numero a descubrir: "+n.averigua());
	}
}
