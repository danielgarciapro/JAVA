package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio6 {
	public static void main(String[] args) {
		String path = "/home/matinal/Escritorio/EjerciciosEntrada_Salida/";
		File inFile = new File(path+"Palabras.java");
		
		File outFile1 = new File(path+"Palabras1.java");
		File outFile2 = new File(path+"Palabras2.java");
		
		//creamos un array de tipo char
		char[] parte1 = new char [300]; //añadimos la primera parte del archivo
		char[] parte2 = new char [(int) (inFile.length()-parte1.length)]; //tamaño del segundo array es el tamaño del archivo menos el tamaño del primer array
		//stream de lectura y escritura
		try (BufferedReader in = new BufferedReader(
				new FileReader(inFile));
				BufferedWriter out1 = new BufferedWriter(
						new FileWriter(outFile1)); BufferedWriter out2 =
						new BufferedWriter(
								new FileWriter(outFile2))){
			//añadir los primeros 300 bytes a la parte1
			in.read(parte1);
			//el resto a parte2
			in.read(parte2);
			
			//escribimos en salida1
			out1.write(parte1); out1.flush(); //hacemos el volcado con el flush
			out2.write(parte2); out2.flush();
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
