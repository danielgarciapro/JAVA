package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {

	public static void main(String[] args) {
		String texto = "Esto es un texto que voy a enviar al fichero \n";
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		File outFile = new File("/home/matinal/Escritorio/nombres_mujer(printWriter).txt");
		//vamos a añadir al flujo de salida el string texto y las 10 primeras lineas del inFile
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
				PrintWriter out = new PrintWriter(new FileOutputStream(outFile))){
			//uso readLine que suministra BufferedReader en la lectura del fichero
			//uso el write pa escribir
			out.write(texto);
			//vamos a añadir 10 lineas de nombre_mujeres
			String lineaLeida;
			for (int i = 0; i < 10; i++) {
				lineaLeida = in.readLine();
				if (lineaLeida == null) break;
				out.write(lineaLeida+"\n");
			}
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Terminada lectura/escritura");
	}

}
