package diapositivas;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AccesoAleatorioFichero {

	public static void main(String[] args) {
		//definimos el fichero de acceso aleatorio
		try (RandomAccessFile fichero = new RandomAccessFile("/home/matinal/Escritorio/random.dat", "rw");){
			//siempre se encuentra el puntero inicialmente en 0, todo lo que haya lo machaca
			System.out.println("El puntero inicialmente esta en la posicion "+fichero.getFilePointer());
			long tamanoFicheroIncial = fichero.length();
			//muevo el puntero
			fichero.seek(tamanoFicheroIncial);
			//de esta forma el puntero empieza al final, y no se machaca lo que habia
			for (int i = 0; i < 100; i++) {
				fichero.write(i);
			}
			System.out.println("El tamaño del archivo es "+fichero.length());
			System.out.println("El puntero esta en la posicion "+fichero.getFilePointer());
			//cambiamos la posicion del puntero
			fichero.seek(0);
			System.out.println("Valor del puntero en la posicion 0 "+fichero.read());
			fichero.seek(1);
			System.out.println("Valor del puntero en la posicion 1 "+fichero.read());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
