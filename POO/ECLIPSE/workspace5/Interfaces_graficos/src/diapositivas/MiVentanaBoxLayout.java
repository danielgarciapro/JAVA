package diapositivas;

import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MiVentanaBoxLayout {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanaBoxLayout window = new MiVentanaBoxLayout();
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
	public MiVentanaBoxLayout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//boxLayout
		BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS);
		frame.setLayout(boxLayout);
		
		JButton boton1 = new JButton("Boton 1");
		frame.add(boton1);
		frame.add(Box.createVerticalGlue());//muelle
		JButton boton2 = new JButton("Boton 2");
		frame.add(boton2);
		frame.add(Box.createVerticalGlue());
		JButton boton3 = new JButton("Boton 3");
		frame.add(boton3);
		frame.add(Box.createVerticalGlue());
		JButton boton4 = new JButton("Boton 4");
		frame.add(boton4);
		frame.add(Box.createVerticalGlue());
		JButton boton5 = new JButton("Boton 5");
		frame.add(boton5);
		
	}

}
