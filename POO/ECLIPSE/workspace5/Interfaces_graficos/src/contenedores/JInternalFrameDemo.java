package contenedores;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class JInternalFrameDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JInternalFrameDemo window = new JInternalFrameDemo();
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
	public JInternalFrameDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Ventana Principal");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JDesktopPane escritorio = new JDesktopPane();
		frame.add(escritorio, BorderLayout.CENTER);
		
		//creamos una ventana interna
		JInternalFrame v1 = crearVentanaInterna("Ventana Interna 1");
		escritorio.add(v1);
		JInternalFrame v2 = crearVentanaInterna("Ventana Interna 2");
		escritorio.add(v2);
		
		JButton boton1 = new JButton("Boton1");
		v1.add(boton1, BorderLayout.CENTER);
		
		v2.addInternalFrameListener(new InternalFrameListener() {
			
			@Override
			public void internalFrameOpened(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameIconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeiconified(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameDeactivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameClosing(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				v2.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
				int returnVal = JOptionPane.showConfirmDialog(frame,
						"¿Realmente desea cerrar la ventana?");
						if (returnVal == JOptionPane.OK_OPTION){
						v2.setVisible(false);
						v2.dispose();
						}
			}
			
			@Override
			public void internalFrameClosed(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void internalFrameActivated(InternalFrameEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				frame.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
				int returnVal = JOptionPane.showConfirmDialog(frame,
						"¿Realmente desea cerrar la ventana principal?");
						if (returnVal == JOptionPane.OK_OPTION){
						frame.setVisible(false);
						frame.dispose();
						}
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton botonCerrar = new JButton("Cerrar");
		frame.add(botonCerrar, BorderLayout.NORTH);
		
		botonCerrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JInternalFrame[] miArray = escritorio.getAllFrames();
				for (int i = 0; i < miArray.length; i++) {
					miArray[i].dispose();
				}
			}
		});
	}
	
	private JInternalFrame crearVentanaInterna(String titulo){
		JInternalFrame v1 = new JInternalFrame(titulo);
		v1.setResizable(true);
		v1.setClosable(true);
		v1.setIconifiable(true);
		v1.setBounds(0,0,200,100);
		v1.setVisible(true);
		return v1;
	}

}
