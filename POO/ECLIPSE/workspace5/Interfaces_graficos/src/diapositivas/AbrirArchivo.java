package diapositivas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AbrirArchivo {
	private File archivo;
	private String s1;
	
	public AbrirArchivo(File archivo) {
		this.archivo = archivo;
		this.s1 = "";
	}
	
	public String getContenido(){
		int contador = 1;
		try (Scanner in = new Scanner(archivo);){
			while(in.hasNext()){
				s1 += in.nextLine();
				s1 += " ";
				if (contador%10 == 0) s1 += "\n";
				contador++;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return s1;
	}
	
}
