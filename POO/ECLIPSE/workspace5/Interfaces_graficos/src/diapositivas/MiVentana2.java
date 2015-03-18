package diapositivas;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MiVentana2 {

	private JFrame ventana;
	
	public MiVentana2(){
		ventana = new JFrame();
		ventana.setTitle("Mi segunda ventana en swing");//titulo de la ventana
		ventana.setSize(500, 300); //ventana.setSize(new Dimension(500,200)); establece el tamaño de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		BorderLayout miLayout = new BorderLayout(10,10);//(10,10) separacion entre layouts
		//modificar por setters --> miLayout.setHgap(hgap);miLayout.setVgap(vgap);
		ventana.getContentPane().setLayout(miLayout);
		
		JLabel etiqueta = new JLabel("Mi etiqueta");
		ventana.getContentPane().add(etiqueta,BorderLayout.NORTH);
		
		JButton boton = new JButton("Aceptar");
		boton.setPreferredSize(new Dimension(100, 50));//boton.setSize(width, height);
		ventana.getContentPane().add(boton, BorderLayout.EAST);
		
		JLabel etiqueta2 = new JLabel("Mi etiqueta2");
		ventana.getContentPane().add(etiqueta2, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		MiVentana2 app = new MiVentana2();
		
	}
	
	
	
}
