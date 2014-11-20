import javax.swing.JOptionPane;
public class PrimerFor{
	private int numero; //suma desde 0 hasta numero
	//constructor para inicializar el valor del atributo numero
	public PrimerFor(int n){
		this.numero=n;
		}
	//metodo que suma desde cero hasta numero
	public int suma(){
		int suma=0;
		for (int i=1;i<=this.numero;i++){
			suma+=i;
			}
			return suma;
		}
}

class TestBucleFor{
	public static void main(String[] args){
	String x=JOptionPane.showInputDialog("Introduce un numero... ");
	int numero=Integer.parseInt(x);
	PrimerFor w= new PrimerFor(numero);
	JOptionPane.showMessageDialog(null,"La suma de los "+numero+" primeros numeros es = "+w.suma(),"Cuanto vale la SUMA?", JOptionPane.INFORMATION_MESSAGE);
	}
}
