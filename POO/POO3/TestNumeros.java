public class TestNumeros{	
	public static void main (String[] args){
	Numeros n = new Numeros();
	System.out.println("Numero: "+n.getValor());
	n.setValor(12);
	System.out.println("Numero: "+n.getValor());
	n.setValor(13.0);
	System.out.println("Numero: "+n.getValor());
	}
}
