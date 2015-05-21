package ejercicio2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario {

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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario window = new Formulario();
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
	public Formulario() {
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
				
				Usuario u = new Usuario(textFieldNombre.getText(), textFieldApellidos.getText(),
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnGuardar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalir)
							.addContainerGap())))
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
						.addComponent(btnGuardar))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		
	}
}
