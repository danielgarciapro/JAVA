package ejercicio5;

import java.util.Arrays;

public final class Math3 implements Extremos {

	@Override
	public int min(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[0];
	}

	@Override
	public int max(int[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-1];
	}

	@Override
	public double min(double[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[0];
	}

	@Override
	public double max(double[] a) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[a.length-1];
	}

}
