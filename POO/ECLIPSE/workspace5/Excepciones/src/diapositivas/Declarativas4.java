package diapositivas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Declarativas4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File inFile = new File("/home/matinal/Escritorio/out.txt");
		File outFile = new File("/home/matinal/Escritorio/out(salida3).txt");
		//trabajamos con jdk7 o superior
		//declaramos los stream fuera del try, no necesita finally
		try (Scanner in = new Scanner(inFile);
				BufferedWriter out = new BufferedWriter(
						new FileWriter(outFile))){
			
			String palabra;
			while (in.hasNext()){
				palabra = in.next();
				System.out.println(palabra.toUpperCase());
				out.write(palabra.toUpperCase()+" ");
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
