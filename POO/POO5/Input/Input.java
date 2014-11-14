import javax.swing.JOptionPane;
public class Input{
	public static void main (String[] args){
	String x = JOptionPane.showInputDialog("Escribe algo tio:");
	System.out.println("Has puesto esto: "+x);
	JOptionPane.showMessageDialog(null,x,"Valor introducido", JOptionPane.INFORMATION_MESSAGE);
	}

}
