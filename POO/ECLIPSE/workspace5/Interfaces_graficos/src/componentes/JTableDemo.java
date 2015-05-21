package componentes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableDemo window = new JTableDemo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JTableDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//para tablas sencillas
		String[] nombreColumnas = {"Real Madrid", "Farsa", "Atletico de Madrid"};
		Object[][] datos = {
				{"Casillas","Ronaldo","Enano"},
				{"Enano","Picado","Nando"}
		};
		
	
		
		JTable tabla = new JTable(datos,nombreColumnas);
		
		//metodo menos eficiente
		//frame.add(tabla.getTableHeader(), BorderLayout.NORTH);
	    //frame.add(tabla, BorderLayout.CENTER);
		
		//lo añadimos a un scroll pane pa ser mas eficiente
		JScrollPane scroll = new JScrollPane(tabla);
		
		frame.add(scroll, BorderLayout.CENTER);
		
	}

}
