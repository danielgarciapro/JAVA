package contenedores;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Toolkit;

public class JframePruebas {
	private JFrame ventana;
	public JframePruebas(){
		ventana = new JFrame("Pruebas de ventanas");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/matinal/Escritorio/images.jpeg"));
		
		JButton boton =new JButton("Boton de prueba");
		JButton boton2 =new JButton("Boton de prueba2");
		
		FlowLayout miFlowLayout = new FlowLayout(FlowLayout.LEFT,10,10);
		
		ventana.getContentPane().setLayout(miFlowLayout);
		ventana.getContentPane().add(boton);
		ventana.getContentPane().add(boton2);
		//ventana.setSize(800, 600);
		ventana.pack(); //ajusta la ventana al contenido
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
	}
	public static void main(String[] args) {
		new JframePruebas();
	}
}
