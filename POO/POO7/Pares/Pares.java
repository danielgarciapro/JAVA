public class Pares{
	private int numero;
	public Pares(int n){  //se puede omitir el public
		this.numero=n;
	}
	public boolean esPar(){
		return this.numero % 2 ==0;
		//return 0==this.numero %2 otra forma de hacerlo
	}
	@Override
	public String toString(){
		return "El numero "+this.numero+" , ¿Es par? "+esPar();		
		}
		
public static void main(String[] args){
	Pares n1 = new Pares(2);
	Pares n2 = new Pares(3);
	boolean b1 = n1.esPar();
	boolean b2 = n2.esPar();
	System.out.println("b1: "+b1);
	System.out.println("b2: "+b2);
	System.out.println(n1);
	System.out.println(n2);	
	
	}
}
