package contenedores;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JOptionDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionDemo window = new JOptionDemo();
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
	public JOptionDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel miPanel = new JPanel();
		frame.add(miPanel, BorderLayout.CENTER);
		
		JButton boton1 = new JButton("Mensaje 1");
		miPanel.add(boton1);
		boton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(frame, "Hola, hay un error", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		});
		
		
		JButton boton2 = new JButton("Mensaje 2");
		miPanel.add(boton2);
		boton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object[] opcion = {"Aceptar","Cancelar","No se"};
				int respuesta = JOptionPane.showOptionDialog(frame, "Selecciona una accion", "SELECCION", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,opcion,opcion[0]);
				if (respuesta==JOptionPane.OK_OPTION) JOptionPane.showMessageDialog(frame, "Has aceptado");
				if (respuesta==JOptionPane.NO_OPTION) JOptionPane.showMessageDialog(frame, "Has cancelado");
				if (respuesta==JOptionPane.CANCEL_OPTION) JOptionPane.showMessageDialog(frame, "No sabes");
			}
		});
		
		
		JButton boton3 = new JButton("Mensaje 3");
		miPanel.add(boton3);
		boton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Object[] array = {"Real Madrid","Barcelona","Real Jaen"};
				String dialogo = (String)JOptionPane.showInputDialog(frame, "Mejor equipo de mundo?", "Equipo", JOptionPane.QUESTION_MESSAGE,null, array,array[0]);
				if (dialogo.equals(array[0])) JOptionPane.showMessageDialog(frame, "Acertaste");
				if (dialogo.equals(array[1])) JOptionPane.showMessageDialog(frame, "Fallaste");
				if (dialogo.equals(array[2])) JOptionPane.showMessageDialog(frame, "Casi!");
				//if (dialogo==JOptionPane.NO_OPTION) JOptionPane.showMessageDialog(frame, "Dale al Madrid hombre!!");

			}
		});
		
		JButton boton4 = new JButton("Dialogo Personalizado");
		boton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JDialogDemo miDialogo = new JDialogDemo(frame);
			
				
			}
		});
		miPanel.add(boton4);
	}

}
