package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos a leer un fichero de texto y la mostramos por pantalla
		//clase scanner es la mas adecuada para ficheros de texto
		File inFile = new File("/home/matinal/Escritorio/out.txt");
		File outFile = new File("/home/matinal/Escritorio/out(salida2).txt");
		Scanner in=null;
		BufferedWriter out=null;
		
		
		try {
			in = new Scanner(inFile);
			//la clase printwriter es la mas adecuada
			out = new BufferedWriter(
					new PrintWriter(outFile));
			String palabra;//hay que utilizar el auxiliar
			while (in.hasNext()){
				palabra = in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase()+" ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("El bloque finally se ejecuta siempre");
			if (in != null) in.close();
			if (out != null){
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
