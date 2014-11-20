import javax.swing.JOptionPane;
public class PrimerWhile{
	private int numero; //suma desde 0 hasta numero
	//constructor para inicializar el valor del atributo numero
	public PrimerWhile(int n){
		this.numero=n;
		}
	//metodo que suma desde cero hasta numero
	public int suma(){
		int suma=0;
		int contador=1;
		while(contador <= this.numero){
			suma+=contador;
			contador++;
			}
			return suma;
		}
}

class TestBucleWhile{
	public static void main(String[] args){
	String x=JOptionPane.showInputDialog("Introduce un numero... ");
	int numero=Integer.parseInt(x);
	PrimerWhile w= new PrimerWhile(numero);
	JOptionPane.showMessageDialog(null,"La suma es de los "+numero+" primeros numeros es = "+w.suma(),"Cuanto vale la SUMA?", JOptionPane.INFORMATION_MESSAGE);
	}
}
