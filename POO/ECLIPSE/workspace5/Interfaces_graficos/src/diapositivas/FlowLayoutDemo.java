package diapositivas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlowLayoutDemo {
	JFrame ventana;
	public FlowLayoutDemo(String titulo) {
		// TODO Auto-generated constructor stub
		ventana = new JFrame(titulo);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(800, 600);
		ventana.setVisible(true);
		
		FlowLayout miLayout = new FlowLayout();
		ventana.setLayout(miLayout);
		
		JButton boton1 = new JButton("Primero");
		JButton boton2 = new JButton("Segundo");
		JButton boton3 = new JButton("Tercero");
		JTextField campoTexto = new JTextField(40);
		JLabel etiqueta = new JLabel("Etiqueta");
		
		ventana.add(boton1);
		ventana.add(boton2);
		ventana.add(boton3);
		ventana.add(campoTexto);
		ventana.add(etiqueta);
		
		
	
	}
	public static void main(String[] args) {
		new FlowLayoutDemo("Prueba FlowLayout");
	}
}
