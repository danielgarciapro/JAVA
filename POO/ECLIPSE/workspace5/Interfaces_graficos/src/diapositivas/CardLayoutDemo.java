package diapositivas;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutDemo {

	private JFrame frame;
	public CardLayout cardLayout;
	public JPanel cards;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutDemo window = new CardLayoutDemo();
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
	public CardLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("CardLayoutDemo");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout miLayout = new BorderLayout(); //NO ES NECESARIO, por defecto es borderLayout
		frame.setLayout(miLayout);
		
		JButton boton1 = new JButton("Anterior");
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.previous(cards);
			}
		});
		JButton boton2 = new JButton("Siguiente");
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.next(cards);
			}
		});
		JButton boton3 = new JButton("Primero");
		boton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.first(cards);
			}
		});
		JButton boton4 = new JButton("Ultimo");
		boton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cardLayout.last(cards);
			}
		});
		
		//creamos el contenedor JPanel
		JPanel panelNorte = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panelNorte, BoxLayout.X_AXIS);
		panelNorte.setLayout(boxLayout);
		panelNorte.add(Box.createHorizontalGlue());
		panelNorte.add(boton3);
		panelNorte.add(Box.createHorizontalGlue());
		panelNorte.add(boton1);
		panelNorte.add(Box.createHorizontalGlue());
		panelNorte.add(boton2);
		panelNorte.add(Box.createHorizontalGlue());
		panelNorte.add(boton4);
		panelNorte.add(Box.createHorizontalGlue());
		
		frame.add(panelNorte, BorderLayout.NORTH);
		
		cards = new JPanel();
		cardLayout = new CardLayout();
		cards.setLayout(cardLayout);
		
		JPanel panel1 = new JPanel();
		JLabel etiqueta1 = new JLabel("Panel numero 1");
		panel1.add(etiqueta1);
		
		JPanel panel2 = new JPanel();
		JLabel etiqueta2 = new JLabel("Panel numero 2");
		panel2.add(etiqueta2);
		
		JPanel panel3 = new JPanel();
		JLabel etiqueta3 = new JLabel("Panel numero 3");
		JButton botonAux = new JButton("BOTON");
		botonAux.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				etiqueta3.setText("Cambiando contenido etiqueta");
			}
		});
		panel3.add(etiqueta3);
		panel3.add(botonAux);
		
		cards.add(panel1);
		cards.add(panel2);
		cards.add(panel3);
		
		frame.add(cards, BorderLayout.CENTER);
		
		
		/*frame.add(boton1, BorderLayout.NORTH);    No se puede hacer, se machaca
		frame.add(boton2, BorderLayout.NORTH);*/
	}

}
