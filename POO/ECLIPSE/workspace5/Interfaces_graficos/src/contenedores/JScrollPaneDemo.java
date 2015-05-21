package contenedores;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import diapositivas.AbrirArchivo;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class JScrollPaneDemo {

	private JFrame frame;
	private JFileChooser fileChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JScrollPaneDemo window = new JScrollPaneDemo();
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
	public JScrollPaneDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextArea textAreaIzquierda = new JTextArea();
		JScrollPane scrollPaneIzquierda = new JScrollPane(textAreaIzquierda);
		scrollPaneIzquierda.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneIzquierda.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textAreaDerecha = new JTextArea();
		JScrollPane scrollPaneDerecha = new JScrollPane(textAreaDerecha);
		scrollPaneDerecha.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneDerecha.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		JTextArea textAreaAbajo = new JTextArea();
		JScrollPane scrollPaneAbajo = new JScrollPane(textAreaAbajo);
		scrollPaneAbajo.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneAbajo.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		//creamos el JSplitPane
		JSplitPane splitpane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPaneIzquierda, scrollPaneDerecha);
		splitpane.setResizeWeight(0.5);//divide a la mitad los paneles
		splitpane.setOneTouchExpandable(true);
		
		JSplitPane splitpane2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitpane, scrollPaneAbajo);
		splitpane2.setResizeWeight(0.5);//divide a la mitad los paneles
		splitpane.setOneTouchExpandable(true);
		
		//creamos el JToolBar
		
		
		frame.getContentPane().add(splitpane2, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		JMenuItem mntmAbrirArchivoIzquierda = new JMenuItem("Abrir Archivo Izquierda");
		mntmAbrirArchivoIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostramos al usuario el filechooser, le pasamos el frame para que lo bloquee
				fileChooser = new JFileChooser();
				int returnVal = fileChooser.showOpenDialog(frame);
				//System.out.println(returnVal);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File fileSelected = fileChooser.getSelectedFile();
					AbrirArchivo file = new AbrirArchivo(fileSelected);
					textAreaIzquierda.setText(file.getContenido());
				}
			}
		});
		mnArchivo.add(mntmAbrirArchivoIzquierda);
		
		JMenuItem mntmAbrirArchivoDerecha = new JMenuItem("Abrir Archivo Derecha");
		mntmAbrirArchivoDerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fileChooser = new JFileChooser();
				int returnVal = fileChooser.showOpenDialog(frame);
				//System.out.println(returnVal);
				if (returnVal == JFileChooser.APPROVE_OPTION){
					File fileSelected = fileChooser.getSelectedFile();
					AbrirArchivo file = new AbrirArchivo(fileSelected);
					textAreaDerecha.setText(file.getContenido());
				}
			}
		});
		mnArchivo.add(mntmAbrirArchivoDerecha);
		
		JMenuItem mntmSalirsa = new JMenuItem("Salir");
		mnArchivo.add(mntmSalirsa);
		
		JMenu mnComparar = new JMenu("Comparar");
		menuBar.add(mnComparar);
		
		JMenuItem mntmEjecutarComparar = new JMenuItem("Ejecutar Comparar");
		mntmEjecutarComparar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textoIzq = textAreaIzquierda.getText();
				String textoDer = textAreaDerecha.getText();
				
				if (textoIzq.equals(textoDer)) textAreaAbajo.setText("Los archivos son iguales");
				else {
					String[] arrayIzq = textoIzq.split("\n");
					String[] arrayDer = textoDer.split("\n");
					
					int contador = 0;
					while (contador <= arrayIzq.length && contador <= arrayDer.length){
						//if //comparar los arrays y ver donde estan las diferencias
						
						contador++;
					}
				}
				
			}
		});
		mnComparar.add(mntmEjecutarComparar);
		
		
	
	}

}
