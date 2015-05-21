package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Formulario2 {

	private JFrame frame;
	private JTextField textFieldNombre;
	private JLabel lblApellidos;
	private JTextField textFieldApellidos;
	private JLabel lblEmail;
	private JTextField textFieldEmail;
	private JLabel lblLogin;
	private JTextField textFieldLogin;
	private JLabel lblContrasea;
	private JTextField textFieldContraseña;
	String valorNombre;
	String valorApellido; 
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmAbrir;
	private JFileChooser fileChooser;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	List <Usuario2> arrayUsuarios;
	private int posicion=0;
	private JLabel numeroRegistros;
	private JMenuItem mntmGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario2 window = new Formulario2();
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
	public Formulario2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblFormularioDeUsuario = new JLabel("Formulario de usuario");
		
		JLabel lblNombre = new JLabel("Nombre");
		
		
		
		textFieldNombre = new JTextField();
		textFieldNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldApellidos.getText().length()>0){
					
					valorNombre = textFieldNombre.getText().substring(0, 1);
					valorApellido = textFieldApellidos.getText().replace(" ", "");
					textFieldLogin.setText((valorNombre+valorApellido).toLowerCase());
				}
			}
		});
		textFieldNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos");
		
		textFieldApellidos = new JTextField();
		textFieldApellidos.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if (textFieldNombre.getText().length()>0){
					
					valorNombre = textFieldNombre.getText().substring(0, 1);
					valorApellido = textFieldApellidos.getText().replace(" ", "");
					textFieldLogin.setText((valorNombre+valorApellido).toLowerCase());
				}
			}
		});
		textFieldApellidos.setColumns(10);
		
		lblEmail = new JLabel("Email");
		
		textFieldEmail = new JTextField();
		textFieldEmail.setColumns(10);
		
		lblLogin = new JLabel("Login");
		
		textFieldLogin = new JTextField();
		textFieldLogin.setColumns(10);
		
		
		lblContrasea = new JLabel("Contraseña");
		
		textFieldContraseña = new JTextField();
		textFieldContraseña.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuario2 u = new Usuario2(textFieldNombre.getText(), textFieldApellidos.getText(),
						textFieldEmail.getText(), textFieldLogin.getText(), textFieldContraseña.getText());
				if(u.validarUsuario()){
					JOptionPane.showMessageDialog(frame, "Todo correcto, archivo creado");
					textFieldNombre.setText(null);
					textFieldApellidos.setText(null);
					textFieldEmail.setText(null);
					textFieldLogin.setText(null);
					textFieldContraseña.setText(null);
					
				}
				else JOptionPane.showMessageDialog(frame, "Usuario no valido", "Error",
						JOptionPane.ERROR_MESSAGE);
				
			}
		});
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if (posicion==0) JOptionPane.showMessageDialog(frame, "Estas en el primer registro", "Error",
							JOptionPane.ERROR_MESSAGE);
					else {
						textFieldNombre.setText(arrayUsuarios.get(posicion-1).getNombre());
						textFieldApellidos.setText(arrayUsuarios.get(posicion-1).getApellidos());
						textFieldEmail.setText(arrayUsuarios.get(posicion-1).getEmail());
						textFieldLogin.setText(arrayUsuarios.get(posicion-1).getLogin());
						textFieldContraseña.setText(arrayUsuarios.get(posicion-1).getContraseña());
						posicion--;
						numeroRegistros.setText("Registro "+(posicion+1)+" de un total de "+arrayUsuarios.size());
					}
					
				
			}
		});
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (posicion==arrayUsuarios.size()-1) JOptionPane.showMessageDialog(frame, "Estas en el ultimo registro", "Error",
						JOptionPane.ERROR_MESSAGE);
				else {
					textFieldNombre.setText(arrayUsuarios.get(posicion+1).getNombre());
					textFieldApellidos.setText(arrayUsuarios.get(posicion+1).getApellidos());
					textFieldEmail.setText(arrayUsuarios.get(posicion+1).getEmail());
					textFieldLogin.setText(arrayUsuarios.get(posicion+1).getLogin());
					textFieldContraseña.setText(arrayUsuarios.get(posicion+1).getContraseña());
					posicion++;
					numeroRegistros.setText("Registro "+(posicion+1)+" de un total de "+arrayUsuarios.size());
				}
			}
		});
		
		numeroRegistros = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblApellidos)
								.addComponent(lblEmail)
								.addComponent(lblLogin)
								.addComponent(lblContrasea))
							.addGap(56)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFormularioDeUsuario)
									.addGap(143))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(textFieldContraseña, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
										.addComponent(textFieldLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
										.addComponent(textFieldEmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
										.addComponent(textFieldNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
										.addComponent(textFieldApellidos, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
									.addContainerGap())))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAnterior)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSiguiente)
							.addPreferredGap(ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
							.addComponent(btnGuardar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalir)
							.addContainerGap())))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(186)
					.addComponent(numeroRegistros)
					.addContainerGap(194, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblFormularioDeUsuario)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre)
						.addComponent(textFieldNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblApellidos)
						.addComponent(textFieldApellidos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmail)
						.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogin)
						.addComponent(textFieldLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblContrasea)
						.addComponent(textFieldContraseña, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalir)
						.addComponent(btnGuardar)
						.addComponent(btnAnterior)
						.addComponent(btnSiguiente))
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addComponent(numeroRegistros))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		btnAnterior.setVisible(false);
		btnSiguiente.setVisible(false);
		
		mntmAbrir = new JMenuItem("Abrir");
		mntmAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fileChooser = new JFileChooser();
				//establezco el filtro de csv y carpetas
				fileChooser.setFileFilter(new FiltroCsv());
				int returnVal = fileChooser.showOpenDialog(frame);
				System.out.println(returnVal);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File fileSelected = fileChooser.getSelectedFile();
					try (Scanner in = new Scanner(fileSelected);){
						arrayUsuarios = new ArrayList<Usuario2>();
						
						while(in.hasNextLine()){
							
							String linea = in.nextLine()+"\n";
						
							String[] campos = linea.split(":");
							
							Usuario2 usu = new Usuario2(campos[0], campos[1], campos[2],
									campos[3], campos[4]);
							
							arrayUsuarios.add(usu);
							
							btnAnterior.setVisible(true);
							btnSiguiente.setVisible(true);
							
							
						}
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				textFieldNombre.setText(arrayUsuarios.get(posicion).getNombre());
				textFieldApellidos.setText(arrayUsuarios.get(posicion).getApellidos());
				textFieldEmail.setText(arrayUsuarios.get(posicion).getEmail());
				textFieldLogin.setText(arrayUsuarios.get(posicion).getLogin());
				textFieldContraseña.setText(arrayUsuarios.get(posicion).getContraseña());
				
				numeroRegistros.setText("Registro "+(posicion+1)+" de un total de "+arrayUsuarios.size());
			}
		});
		mnNewMenu.add(mntmAbrir);
		
		mntmGuardar = new JMenuItem("Guardar");
		mntmGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//********************Terminar por aqui**************************
				
			}
		});
		mnNewMenu.add(mntmGuardar);
		
		
		
	}
}
