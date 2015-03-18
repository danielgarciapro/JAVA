package diapositivas;

import java.io.File;

public class ListadoRecursivoArchivos {

	public static void main(String[] args) {
		long inicio = System.nanoTime();
		if (args.length ==0){ 
			System.out.println("No hay argumentos");
			System.exit(1);
		}
		File fichero = new File(args[0]);
		if (fichero.isDirectory()) listarArchivoRecursivamente(fichero);
		else System.out.println(fichero.getAbsolutePath());
		long fin = System.nanoTime();
		System.out.println("Tiempo de ejecucion: "+(fin-inicio)/1_000_000_000+" segundos");
	}
	public static void listarArchivoRecursivamente(File dir){
		File[] listaArchivos = dir.listFiles();
		for (File file : listaArchivos) {
			if (file.isDirectory()) listarArchivoRecursivamente(file);
		System.out.println(file.getAbsolutePath());
		}
	}

}
