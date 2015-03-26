package diapositivas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class EditorFicheros {

	private JFrame frame;
	private JFileChooser fileChooser;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditorFicheros window = new EditorFicheros();
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
	public EditorFicheros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Editor de Ficheros de Texto");
		
		
		// instanciamos el objeto JFilechooser, inicialmente no es visible
		fileChooser = new JFileChooser();
		
		//creamos la interfaz
		JPanel botonera = new JPanel();
		//instanciamos el layout
		FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER,10,10);
		botonera.setLayout(flowLayout);
		
		JButton botonAbrir = new JButton("Abrir");
		botonAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostramos al usuario el filechooser, le pasamos el frame para que lo bloquee
				int returnVal = fileChooser.showOpenDialog(frame);
				System.out.println(returnVal);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File fileSelected = fileChooser.getSelectedFile();
					AbrirArchivo file = new AbrirArchivo(fileSelected);
					textArea.setText(file.getContenido());
				}
			}
		});
		
		JButton botonGuardar = new JButton("Guardar");
		botonGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String contenido;
				int returnVal = fileChooser.showSaveDialog(frame);
				System.out.println(returnVal);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File fileSelected = fileChooser.getSelectedFile();
					contenido = textArea.getText();
					GuardarArchivo file = new GuardarArchivo(fileSelected,contenido);
					
				}
			}
		});
		
		JButton botonSalir = new JButton("Salir");
		
		//añadimos los botones
		botonera.add(botonAbrir);
		botonera.add(botonGuardar);
		botonera.add(botonSalir);
		
		//añadimos la botonera al frame
		frame.getContentPane().add(botonera, BorderLayout.NORTH);
		
		//contenedor con las barras de scroll
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		
		
		
		
	}

}
