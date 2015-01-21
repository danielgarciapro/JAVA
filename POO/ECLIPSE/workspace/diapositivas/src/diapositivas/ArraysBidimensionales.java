package diapositivas;

public class ArraysBidimensionales {
	public static void main(String[] args) {
		//declaramos e inicializamos el array bidimensional de 4 filas x 3 columnas
		int[][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		//declaramos un array2 asignandole valores de manera inversa al array1
		int[][] array2 = new int[4][3];
		int x=0;
		int y=0;
		for (int fila = array.length-1; fila >= 0 ; fila--) {
			for (int columna=array[fila].length-1; columna>=0; columna--){
				array2[x][y] = array[fila][columna];
				System.out.println("Valor en array1["+fila+"]["+columna+"] es "+array[fila][columna]);
				System.out.println("Valor en array2["+x+"]["+y+"] es "+array2[x][y]);
				y++;
			}
			System.out.println();//da un salto de linea cuando cambia de fila
			x++;
			y=0;
		}
		
		
		System.out.println("Numero de filas = "+array.length);
		//puedo ir de 0 a 3, a partir de 4 da error
		System.out.println("Numero de columnas = "+array[3].length);
		
		//recorremos el array bidimensional
		for (int fila = 0; fila < array.length ; fila++) {
			for (int columna=0;columna<array[fila].length;columna++){
			System.out.println("Valor en ["+fila+"]["+columna+"] es "+array[fila][columna]);
			}
			System.out.println();//da un salto de linea cuando cambia de fila
		}
		//calculamos el tamaño del array y su valor
		double tamano = 0;
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			++tamano;
			total += array[i][j];
			}
		}
		//imprimimos los resultados
		System.out.println("El total de elementos es : "+tamano);
		System.out.println("El valor total de los elementos es: "+total);
		System.out.println("Su valor medio es: "+total/tamano);
		/*calcular el valor medio
			int suma=0;
			for (int d : array) {
			suma+=d;
			}
			int media = suma/tamano;
			System.out.printf("\nEl valor medio es %.3f\n",media);*/
	}
}
