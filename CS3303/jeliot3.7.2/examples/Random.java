import jeliot.io.*;

public class Random {
    public static void main() {
		int n = 6;
		int[] array = new int[n];
		int i, j, tmp; 

		// initialize array
		for (i = 0; i < n; ++i) {
			array[i] = i;
		}

		// randomize array
		for (i = n-1; i > 0; --i) {
			j = (int)(Math.random() * i);
			tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		} 
    }
}
