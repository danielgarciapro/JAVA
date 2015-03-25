package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEjemplo2 {
	public static void main(String[] args) {
		//solo para archivos de texto
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		File outFile = new File("/home/matinal/Escritorio/nombres_mujer(copia2).txt");
		
		//trabajando con JDK7 nos permite iniciar los stream en el bloque try/catch
		//no hace falta cerrarlos en un bloque finally
		try (BufferedReader in = new BufferedReader(new FileReader(inFile));
				BufferedWriter out = new BufferedWriter(new FileWriter(outFile))){
			String lineaLeida;
			while ((lineaLeida = in.readLine())!= null) out.write(lineaLeida+"\n");
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("Termina el programa");
	}
}
