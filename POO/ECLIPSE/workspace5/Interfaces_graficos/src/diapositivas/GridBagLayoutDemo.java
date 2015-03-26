package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class GridBagLayoutDemo {

	private JFrame frame;
	private JTextField nombre;
	private JTextField apellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridBagLayoutDemo window = new GridBagLayoutDemo();
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
	public GridBagLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229), 2, true), "PROGRAMA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(51, 51, 51)));
		frame.getContentPane().add(panelCentral, BorderLayout.CENTER);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		//frame.getContentPane().setLayout(gridBagLayout);
		panelCentral.setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		panelCentral.add(lblNombre, gbc_lblNombre);
		
		nombre = new JTextField();
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.anchor = GridBagConstraints.WEST;
		gbc_nombre.insets = new Insets(0, 0, 5, 0);
		gbc_nombre.gridx = 1;
		gbc_nombre.gridy = 0;
		panelCentral.add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.EAST;
		gbc_lblApellidos.insets = new Insets(0, 0, 0, 5);
		gbc_lblApellidos.gridx = 0;
		gbc_lblApellidos.gridy = 1;
		panelCentral.add(lblApellidos, gbc_lblApellidos);
		
		apellidos = new JTextField();
		GridBagConstraints gbc_apellidos = new GridBagConstraints();
		gbc_apellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_apellidos.gridx = 1;
		gbc_apellidos.gridy = 1;
		panelCentral.add(apellidos, gbc_apellidos);
		apellidos.setColumns(10);
	}

}
