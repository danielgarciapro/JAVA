package ejercicio5;

//con JDK 1.8 te permite definir metodos static 
//los no static son con el modificador default
//ademas de lo tipico de los interfaces
import java.util.Arrays;

public interface Extremos1 {
	static int min(int [] a) {
		Arrays.sort(a);
		return a[0];
	}
	static int max(int [] a) {
		Arrays.sort(a);
		return a[a.length-1];
	}
	static double min(double [] a) {
		Arrays.sort(a);
		return a[0];
	}
	static double max(double [] a) {
		Arrays.sort(a);
		return a[a.length-1];
	}
}
