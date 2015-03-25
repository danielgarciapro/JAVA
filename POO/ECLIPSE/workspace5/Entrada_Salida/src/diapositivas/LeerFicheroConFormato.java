package diapositivas;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeerFicheroConFormato {

	public static void main(String[] args) {
		//Fichero de entrada
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		//stream elegido, DataInputStream xk contiene datos con formato (String)
		DataInputStream in = null;
		//abrimos el stream
		try {
			in = new DataInputStream(new BufferedInputStream(new FileInputStream(inFile)));
			String leido;
			while((leido=in.readLine())!=null) System.out.println(leido);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in!= null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
