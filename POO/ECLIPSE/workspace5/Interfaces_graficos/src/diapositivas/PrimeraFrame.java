package diapositivas;

import java.awt.Dimension;

import javax.swing.*;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrimeraFrame {
	int contador=50;
	public void creaGUI() {
		JFrame ventana = new JFrame();
		ventana.setTitle("Mi primera ventana en swing");//titulo de la ventana
		ventana.setSize(500, 300); //ventana.setSize(new Dimension(300,200)); establece el tamaño de la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//pinchas x y sales
		ventana.setLocationRelativeTo(null);//la pone en el centro
		ventana.setMinimumSize(new Dimension(200,200)); //minimo tamaño ajustable
		ventana.setResizable(false);//quitamos que se pueda redimensionar
		ventana.setVisible(true);//ponemos la ventana visible
		
		JButton miBoton = new JButton();
		miBoton.setFont(new Font("DejaVu Sans Light", Font.BOLD, 12));
		miBoton.setText("Aceptar");
		ventana.getContentPane().add(miBoton, BorderLayout.NORTH);
		
		JProgressBar progressBar_1 = new JProgressBar();
		ventana.getContentPane().add(progressBar_1, BorderLayout.SOUTH);
		progressBar_1.setValue(contador);
		
		JPanel panel = new JPanel();
		ventana.getContentPane().add(panel, BorderLayout.CENTER);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		panel.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			contador++;
			}
		});
		panel.add(btnNewButton);
	}
	
	public static void main(String[] args) {
		
		PrimeraFrame app = new PrimeraFrame();
		app.creaGUI();

	}

}
