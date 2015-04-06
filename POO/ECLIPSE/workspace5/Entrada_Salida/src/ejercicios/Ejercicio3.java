package ejercicios;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File outFile = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/ejercicio3");
		//creamos el stream reader para volcar los datos
		try (PrintWriter out = new PrintWriter(
				new BufferedOutputStream(
						new FileOutputStream(outFile)), true);){
			
			for (int i = 250; i < 271; i++) {
				out.println(i);
			}
			
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//leemos el fichero
		//no hace falta crear un nuevo file
		//si hay que crear el flujo de entrada
		try (BufferedReader in = new BufferedReader(
				new FileReader(outFile));){
			String c="";
			while ((c=in.readLine())!=null) System.out.print(c+" - ");
		}
		catch (IOException e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}

}
