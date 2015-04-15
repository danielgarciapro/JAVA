package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Declarativas2 {

	public static void main(String[] args) {
		//llamo al metodo
		try {
			manejarFicheros();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//throws relanza la excepcion hacia arriba (lo manda al metodo que hace la llamada)
	public static void manejarFicheros() throws IOException{	
		// TODO Auto-generated method stub
		//vamos a leer un fichero de texto y la mostramos por pantalla
		//clase scanner es la mas adecuada para ficheros de texto
		File inFile = new File("/home/matinal/Escritorio/out.txt");
		Scanner in = new Scanner(inFile);
		//vamos a escribirlo a un fichero de texto de salida
		File outFile = new File("/home/matinal/Escritorio/out(salida).txt");
		//la clase printwriter es la mas adecuada
		BufferedWriter out = new BufferedWriter(
				new PrintWriter(outFile));
		//leemos palabra a palabra con next
		String palabra;//hay que utilizar el auxiliar
		while (in.hasNext()){
			palabra = in.next();
			System.out.println(palabra.toUpperCase());
			out.write(palabra.toUpperCase()+" ");
		}
		//programacion segura
		if (in != null) in.close();
		if (out != null) out.close();
	}

}