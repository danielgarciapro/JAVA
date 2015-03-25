package diapositivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEjemplo {

	public static void main(String[] args) {
		//solo para archivos de texto
		File inFile = new File("/home/matinal/Escritorio/nombres_mujer.txt");
		File outFile = new File("/home/matinal/Escritorio/nombres_mujer(copia).txt");
		//stream elegido: FileReader
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = new BufferedReader(new FileReader(inFile));
			out = new BufferedWriter(new FileWriter(outFile));
			//lectura del mismo
			int c;
			while((c=in.read())!=-1) out.write(c);//System.out.print((char)c);
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
		}
		
	}

}
