package chatApp.vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

import chatApp.modelo.Conexion;
import chatApp.modelo.Mensaje;
import chatApp.modelo.Usuario;

public class ChatFrame extends JFrame {

	private Conexion conexion;
	private Usuario usuarioOrigen;
	private Usuario usuarioDestino;
	private ArrayList<Mensaje> mensajes;

	private JPanel contentPane;
	private ChatEntrada textPaneEntrada;
	private ChatHistorico historico;

	public final static int ONE_SECOND = 1000;
	private Timer timer;

	public ChatFrame(Conexion miConexion, Usuario userOrigen,
			Usuario userDestino) {
		this.conexion = miConexion;
		this.usuarioOrigen = userOrigen;
		this.usuarioDestino = userDestino;
		mensajes = conexion.getMensajes(usuarioOrigen, usuarioDestino);

		setTitle(userDestino.getNombre());

		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				timer.stop();
				setVisible(false);
				dispose();
			}
		});
		setBounds(100, 100, 436, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		textPaneEntrada = new ChatEntrada();
		JScrollPane scrollPane_1 = new JScrollPane(textPaneEntrada);
		panel.add(scrollPane_1);
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mensaje msg = new Mensaje(-1, usuarioOrigen, usuarioDestino,
						textPaneEntrada.getText());
				int idMensaje = conexion.insertaMensaje(msg);
				msg.setIdMensaje(idMensaje);
				mensajes.add(msg);
				historico.insertaMensaje(msg);
				textPaneEntrada.setText("");
			}
		});
		panel.add(btnEnviar);

		historico = new ChatHistorico();
		historico.insertaMensajes(mensajes);
		JScrollPane scrollPane = new JScrollPane(historico);
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.9);
		splitPane.setTopComponent(scrollPane);
		splitPane.setBottomComponent(panel);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane, BorderLayout.CENTER);

		textPaneEntrada.requestFocusInWindow();
		setVisible(true);
		creaTemporizador();
	}

	public void creaTemporizador() {
		/*
		 * Crea temporizador que se ejecuta cada segundo para obtener nuevos
		 * mensajes.
		 */
		timer = new Timer(ONE_SECOND, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {

				int ultimoIdMensaje = -1;
				if (mensajes.size() > 0) {
					ultimoIdMensaje = mensajes.get(mensajes.size() - 1)
							.getIdMensaje();
				}
				ArrayList<Mensaje> nuevos = conexion.getUltimosMensajes(
						usuarioOrigen, usuarioDestino, ultimoIdMensaje);
				for (Mensaje msg : nuevos) {
					historico.insertaMensaje(msg);
					mensajes.add(msg);
				}

			}
		});
		timer.start();
	}

}
