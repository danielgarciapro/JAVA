package chatApp.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import chatApp.modelo.Conexion;
import chatApp.modelo.Usuario;

public class ChatListado extends JFrame {

	private JPanel contentPane;
	private Conexion conexion;
	private DefaultListModel listModel;
	private Usuario usuarioConectado = null;
	ArrayList<ChatFrame> ventanas;

	public ChatListado(Conexion miConexion) {
		this.conexion = miConexion;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("ChatApp");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		ventanas = new ArrayList<ChatFrame>();
		listModel = new DefaultListModel();
		JList list = new JList(listModel);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				JList list = (JList) evt.getSource();
				if (evt.getClickCount() == 2) {
					int index = list.locationToIndex(evt.getPoint());
					Usuario usuarioDestino = (Usuario) listModel.get(index);
					ChatFrame ventana = new ChatFrame(conexion, usuarioConectado, usuarioDestino);
				}
			}
		});
		JScrollPane scrollList = new JScrollPane(list);
		contentPane.add(scrollList, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);

		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					if (usuarioConectado==null) {
					LoginDialog dialog = new LoginDialog(conexion,
							ChatListado.this);
					dialog.addWindowListener(new WindowAdapter() {
						public void windowClosed(WindowEvent arg0) {
							if (usuarioConectado!=null) {
								ArrayList<Usuario> usuarios = conexion.getTodosUsuarios();
								for (Usuario user : usuarios) {
									if (!usuarioConectado.equals(user)) {
										listModel.addElement(user);
									}
								}
							}
						}
					});
					dialog.setVisible(true);
				}
			}
		});
		panel.add(btnConectar);

		JButton btnDesconectar = new JButton("Desconectar");
		btnDesconectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				usuarioConectado = null;
				listModel.clear();
			}
		});
		panel.add(btnDesconectar);
		setVisible(true);
	}

	public void setUsuario(Usuario user) {
		this.usuarioConectado = user;
	}

}
