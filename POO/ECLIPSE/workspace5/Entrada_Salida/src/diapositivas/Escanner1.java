package diapositivas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Escanner1 {

	public static void main(String[] args) {
		//vamos a leer un archivo
		File inFile = new File("/home/matinal/Escritorio/prueba.txt");
		try (Scanner in = new Scanner(inFile,"ISO-8859-1");){
			String valorLeido;
			while(in.hasNext()){
				valorLeido = in.next();
				System.out.println(valorLeido);
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
