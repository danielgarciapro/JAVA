package diapositivas;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class GridLayoutDemo {

	private JFrame frame;
	private JTextField nombre;
	private JTextField apellido;
	private JLabel lblProvincia;
	private JButton btnNewButton;
	private JComboBox<ProvinciaNacimiento> comboBox;
	private JLabel lblNewLabel;
	private JTextField persona;
	Persona p1 = null;
	Agenda agenda1 =null;
	private JLabel lblListaDePersonas;
	private JTextField verLista;
	private JTextField NumeroPersona;
	private int index = 0;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private int contador=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutDemo window = new GridLayoutDemo();
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
	public GridLayoutDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{215, 215, 0};
		gridBagLayout.rowHeights = new int[]{32, 35, 32, 35, 32, 35, 32, 35, 32, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		
		
		JLabel lblNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.BOTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 1;
		frame.getContentPane().add(lblNombre, gbc_lblNombre);
		
		nombre = new JTextField();
		//nombre.setText(p1.getNombre());
		GridBagConstraints gbc_nombre = new GridBagConstraints();
		gbc_nombre.fill = GridBagConstraints.BOTH;
		gbc_nombre.insets = new Insets(0, 0, 5, 0);
		gbc_nombre.gridx = 1;
		gbc_nombre.gridy = 1;
		frame.getContentPane().add(nombre, gbc_nombre);
		nombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.fill = GridBagConstraints.BOTH;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 0;
		gbc_lblApellido.gridy = 2;
		frame.getContentPane().add(lblApellido, gbc_lblApellido);
		
		apellido = new JTextField();
		//apellido.setText(p1.getApellidos());
		GridBagConstraints gbc_apellido = new GridBagConstraints();
		gbc_apellido.fill = GridBagConstraints.BOTH;
		gbc_apellido.insets = new Insets(0, 0, 5, 0);
		gbc_apellido.gridx = 1;
		gbc_apellido.gridy = 2;
		frame.getContentPane().add(apellido, gbc_apellido);
		apellido.setColumns(10);
		
		lblProvincia = new JLabel("Provincia");
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.fill = GridBagConstraints.BOTH;
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 0;
		gbc_lblProvincia.gridy = 4;
		frame.getContentPane().add(lblProvincia, gbc_lblProvincia);
		
		comboBox = new JComboBox<ProvinciaNacimiento>();
		comboBox.setModel(new DefaultComboBoxModel<ProvinciaNacimiento>(ProvinciaNacimiento.values()));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.BOTH;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 4;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (index>0 && contador>=index){
				persona.setText(agenda1.getPersona(contador)+"");
				contador++;
				}
			}
		});
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.insets = new Insets(0, 0, 5, 5);
		gbc_btnSiguiente.gridx = 0;
		gbc_btnSiguiente.gridy = 5;
		frame.getContentPane().add(btnSiguiente, gbc_btnSiguiente);
		
		btnAnterior = new JButton("Anterior");
		GridBagConstraints gbc_btnAnterior = new GridBagConstraints();
		gbc_btnAnterior.insets = new Insets(0, 0, 5, 0);
		gbc_btnAnterior.gridx = 1;
		gbc_btnAnterior.gridy = 5;
		frame.getContentPane().add(btnAnterior, gbc_btnAnterior);
		
		lblNewLabel = new JLabel("");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 6;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		btnNewButton = new JButton("Mostrar y Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (nombre != null && apellido != null){
					p1 = new Persona(nombre.getText(),apellido.getText(), (ProvinciaNacimiento) comboBox.getSelectedItem());
					persona.setText(p1.toString());
					agenda1 = new Agenda();
					agenda1.addPersona(p1);
					verLista.setText(agenda1.toString());
					NumeroPersona.setText(index+"");
					index++;
					}
			}
		});
		
		lblListaDePersonas = new JLabel("Lista de personas");
		GridBagConstraints gbc_lblListaDePersonas = new GridBagConstraints();
		gbc_lblListaDePersonas.insets = new Insets(0, 0, 5, 0);
		gbc_lblListaDePersonas.gridx = 1;
		gbc_lblListaDePersonas.gridy = 6;
		frame.getContentPane().add(lblListaDePersonas, gbc_lblListaDePersonas);
		
		
		
		
		persona = new JTextField();
		
		GridBagConstraints gbc_persona = new GridBagConstraints();
		gbc_persona.fill = GridBagConstraints.BOTH;
		gbc_persona.insets = new Insets(0, 0, 5, 5);
		gbc_persona.gridx = 0;
		gbc_persona.gridy = 7;
		frame.getContentPane().add(persona, gbc_persona);
		persona.setColumns(10);
		
		verLista = new JTextField();
		verLista.setText("verLista");
		GridBagConstraints gbc_verLista = new GridBagConstraints();
		gbc_verLista.insets = new Insets(0, 0, 5, 0);
		gbc_verLista.fill = GridBagConstraints.HORIZONTAL;
		gbc_verLista.gridx = 1;
		gbc_verLista.gridy = 7;
		frame.getContentPane().add(verLista, gbc_verLista);
		verLista.setColumns(10);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 8;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		NumeroPersona = new JTextField();
		NumeroPersona.setText("numero de persona");
		GridBagConstraints gbc_NumeroPersona = new GridBagConstraints();
		gbc_NumeroPersona.fill = GridBagConstraints.HORIZONTAL;
		gbc_NumeroPersona.gridx = 1;
		gbc_NumeroPersona.gridy = 8;
		frame.getContentPane().add(NumeroPersona, gbc_NumeroPersona);
		NumeroPersona.setColumns(10);
		
		//Persona p1 = new Persona(nombre.getText(),apellido.getText(), (ProvinciaNacimiento) comboBox.getSelectedItem());
		
		//System.out.println(p1);
	}

}
