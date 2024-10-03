import jeliot.io.*;

/* IterFibonacci calculates the first */
/* n fibonacci numbers. N is supplied */
/* by the user.					      */

class IterFibonacci {
    static void main() {

		int a = 1;
		int b = 0; 
		int tmp;
		int i = 0;
		int n = Input.readInt();
		
		while (i < n) {
			tmp = a;
			a = a + b;
			b = tmp;
			i = i + 1;
			Output.println(a);
		}
    }
}
