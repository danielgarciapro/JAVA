import javax.swing.JOptionPane;
public class PrimerIf{
	public static void main(String[] args){
		String x=JOptionPane.showInputDialog("Introduce un numero... ");
		int numero=Integer.parseInt(x);
		if (numero%2==0 && numero%3==0){
			JOptionPane.showMessageDialog(null,"El numero "+numero+" es divisible entre 2 y 3","Que tipo de numero es?", JOptionPane.INFORMATION_MESSAGE);
			}
		else if (numero%2==0){
			JOptionPane.showMessageDialog(null,"El numero "+numero+" es divisible entre 2","Que tipo de numero es?", JOptionPane.INFORMATION_MESSAGE);
		}
		else if (numero%3==0){
			JOptionPane.showMessageDialog(null,"El numero "+numero+" es divisible entre 3","Que tipo de numero es?", JOptionPane.INFORMATION_MESSAGE);
		}
		else JOptionPane.showMessageDialog(null,"El numero "+numero+" No es divisible entre 2 y 3","Que tipo de numero es?", JOptionPane.INFORMATION_MESSAGE);
	}
}

