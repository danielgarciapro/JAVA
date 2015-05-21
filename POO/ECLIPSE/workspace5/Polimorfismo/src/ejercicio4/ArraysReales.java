package ejercicio4;

import java.util.Arrays;

public class ArraysReales implements Estadisticas {
	private double[] valores;
	
	/**
	 * @param valores
	 */
	//al constructor se le pasa el tañamo del array
	//y lo rellenamos de forma aleatoria
	public ArraysReales(int tamano) {
		//primero se inicializa el array
		this.valores = new double[tamano];
		for (int i = 0; i < tamano; i++) {
			valores[i] = Math.random()*100;
		}
		//lo ordenamos de forma ascendentepara facilitaR la implementacion
		//de los metodos max y min
		Arrays.sort(valores);
	}

	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		if (this.valores.length>0) return this.valores[0];
		else {
			System.out.println("Array vacio");
			return 0;
		}
	}

	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		if (this.valores.length>0) return this.valores[this.valores.length-1];
		else {
			System.out.println("Array vacio");
			return 0;
		}
	}

	@Override
	public double sumatorio() {
		// TODO Auto-generated method stub
		if (this.valores.length>0) {
			double suma=0;
			for (int i = 0; i < valores.length; i++) {
				suma+=this.valores[i];
			}
			return suma;
		}
		else {
			System.out.println("Array vacio");
			return 0;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ArraysReales [valores=" + Arrays.toString(valores) + "]";
	}
	

}
