package diapositivas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiarFicheroConBuffer {
	public static void main(String[] args) {
		//File de entrada y salida
		File inFile = new File("/home/matinal/Escritorio/out.txt");
		File outFile = new File("/home/matinal/Escritorio/out(copia)2.txt");
		//usamos FileInputStream y FileOutStream
		BufferedInputStream in = null;
		BufferedOutputStream out = null;
		int c;
		//tamaño del archivo
		System.out.println("Tamaño del archivo de entrada " + inFile.length() + " bytes");
		//inicializamos los dos streams
		try {
			in = new BufferedInputStream(new FileInputStream(inFile)) ;
			out = new BufferedOutputStream(new FileOutputStream(outFile)) ;
			//control del tiempo
			long inicio = System.nanoTime();
			//lectura del InputStream
			while((c=in.read())!=-1) out.write(c);
			long fin = System.nanoTime();
			System.out.println("Fichero copiado en : "+(fin-inicio)/1_000+" nanoSegundos");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in!=null)
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (out!=null)
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

	
}
