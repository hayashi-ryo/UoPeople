import jeliot.io.*;

class RecuFibonacci {

    static void main() {
		int n = Input.readInt();
		Output.println(fibo(n));
    }

	static int fibo(int n) {
		if (n < 2) {
			return 1;
		}
		else {
			return fibo(n - 1) 
				 + fibo(n - 2);
		}
	}
		
}