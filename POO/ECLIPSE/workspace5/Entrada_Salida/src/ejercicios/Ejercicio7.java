package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/home/matinal/Escritorio/EjerciciosEntrada_Salida/";
		File inFile1 = new File(path+"Palabras1.java");
		File inFile2 = new File(path+"Palabras2.java");
		
		File outFile = new File(path+"Palabras_back.java");
		
		try (BufferedReader in1 = new BufferedReader(
				new FileReader(inFile1)); BufferedReader in2 = new BufferedReader(
						new FileReader(inFile2)); BufferedWriter out = new BufferedWriter(
								new FileWriter(outFile))){
			//vamos a leer string con readline
			String linea ="";
			String texto ="";
			String definitivo="";
			while((linea=in1.readLine())!=null) texto += (linea+"\n");
			//out.write(texto.substring(0, texto.length()-1));
			definitivo = texto.substring(0, texto.length()-1);
			
			while((linea=in2.readLine())!=null) definitivo += (linea+"\n");
			out.write(definitivo.substring(0, definitivo.length()-2));
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
