package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MiVentanaMixto {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentanaMixto window = new MiVentanaMixto();
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
	public MiVentanaMixto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mipanel = new JPanel();
		frame.add(mipanel, BorderLayout.SOUTH);
		
		JLabel etiqueta1 = new JLabel("Etiqueta izq");
		JLabel etiqueta2 = new JLabel("Etiqueta der");
		JLabel etiqueta3 = new JLabel("Etiqueta cent");
		
		mipanel.add(etiqueta1);
		mipanel.add(Box.createHorizontalGlue());
		mipanel.add(etiqueta3);
		mipanel.add(Box.createHorizontalGlue());
		mipanel.add(etiqueta2);
		
		mipanel.setLayout(new BoxLayout(mipanel, BoxLayout.X_AXIS));
		
		
	}

}
