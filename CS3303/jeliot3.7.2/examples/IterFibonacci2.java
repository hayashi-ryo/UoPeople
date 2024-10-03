import jeliot.io.*;

/* IterFibonacci2 calculates the first */
/* n fibonacci numbers without using   */
/* tmp-variable.					   */

class IterFibonacci2 {
    static void main() {

		int a = 1;
		int b = 0;
		int i = 0;
		int n = Input.readInt();
		
		while (i < n) {
			a = a + b;
			b = a - b;
			i = i + 1;
			Output.println(a);
		}
    }
}