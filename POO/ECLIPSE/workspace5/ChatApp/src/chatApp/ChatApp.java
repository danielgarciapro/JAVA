package chatApp;

import java.awt.EventQueue;

import chatApp.modelo.Conexion;
import chatApp.vista.ChatListado;

public class ChatApp {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Conexion miConexion = new Conexion();
					ChatListado frame = new ChatListado(miConexion);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
