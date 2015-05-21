package componentes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableModelDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableModelDemo window = new JTableModelDemo();
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
	public JTableModelDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//para crear un modelo de tablas
		ArrayList<Jugador> lista = new ArrayList<Jugador>();
		Jugador j1 = new Jugador("Juan", "Real Madrid");
		Jugador j2 = new Jugador("Arda", "Atletico de Madrid");
		Jugador j3 = new Jugador("Messi", "Barsa");
		lista.add(j1); lista.add(j2); lista.add(j3);
		
		String[] cabezera = {"Jugador","Equipo"};
		
		JTableModelJugadores tableModel = new JTableModelJugadores(lista, cabezera);
		
		JTable tablaJugadores = new JTable(tableModel);
		
		JScrollPane scroll = new JScrollPane(tablaJugadores);
		
		frame.add(scroll, BorderLayout.CENTER);
			
	}

}
