package chatApp.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import chatApp.modelo.Conexion;
import chatApp.modelo.Usuario;

public class LoginDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textFieldNombre;
	private JPasswordField passwordField;
	private final Conexion conexion;
	private JLabel resumen;
	private ChatListado frame;

	public LoginDialog(Conexion miConexion, ChatListado miFrame) {
		super(miFrame);
		this.frame = miFrame;
		this.conexion = miConexion;
		setModal(true);
		setTitle("Acceso a la aplicación");
		setBounds(100, 100, 368, 169);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[] { 0, 0, 0 };
		gbl_contentPanel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_contentPanel.columnWeights = new double[] { 0.0, 1.0,
				Double.MIN_VALUE };
		gbl_contentPanel.rowWeights = new double[] { 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPanel.setLayout(gbl_contentPanel);

		JLabel lblNombre = new JLabel("Nombre de usuario:");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		contentPanel.add(lblNombre, gbc_lblNombre);

		textFieldNombre = new JTextField();
		GridBagConstraints gbc_textFieldNombre = new GridBagConstraints();
		gbc_textFieldNombre.insets = new Insets(0, 0, 5, 0);
		gbc_textFieldNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldNombre.gridx = 1;
		gbc_textFieldNombre.gridy = 0;
		contentPanel.add(textFieldNombre, gbc_textFieldNombre);
		textFieldNombre.setColumns(10);

		JLabel lblClave = new JLabel("Contraseña:");
		GridBagConstraints gbc_lblClave = new GridBagConstraints();
		gbc_lblClave.anchor = GridBagConstraints.EAST;
		gbc_lblClave.insets = new Insets(0, 0, 5, 5);
		gbc_lblClave.gridx = 0;
		gbc_lblClave.gridy = 1;
		contentPanel.add(lblClave, gbc_lblClave);

		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		contentPanel.add(passwordField, gbc_passwordField);

		resumen = new JLabel("");
		GridBagConstraints gbc_resumen = new GridBagConstraints();
		gbc_resumen.gridwidth = 2;
		gbc_resumen.insets = new Insets(0, 0, 0, 5);
		gbc_resumen.gridx = 0;
		gbc_resumen.gridy = 2;
		contentPanel.add(resumen, gbc_resumen);

		JButton okButton = new JButton("Acceder");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Usuario user;
				try {
					user = conexion.conecta(textFieldNombre.getText(),
							passwordField.getPassword());

					if (user != null) {
						resumen.setText("USUARIO Y CONTRASEÑA CORRECTO");
						frame.setUsuario(user);
						dispose();
					} else {
						resumen.setText("Usuario o contraseña incorrecta");
					}
				} catch (SQLException e) {
					resumen.setText("Imposible conectar con el servidor");
					e.printStackTrace();
				}

			}
		});
		okButton.setActionCommand("OK");

		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		{

			buttonPane.add(okButton);
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancelar");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
					dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
		}
	}
}
