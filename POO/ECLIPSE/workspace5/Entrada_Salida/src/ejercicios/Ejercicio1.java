package ejercicios;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File outFile1 = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/ejercicioFileOutputStream.txt");
		File outFile2 = new File("/home/matinal/Escritorio/EjerciciosEntrada_Salida/ejercicioDataOutputStream.txt");
		//usamos jdk 1.7 y no hace falta cerrar el stream, si no habria que poner el finally
		try (BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(outFile1));
				DataOutputStream out2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(outFile2)))){
			for (int i = 20; i < 41; i++) {
				out1.write(i);
				out2.writeInt(i);
			}
		}
		
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
