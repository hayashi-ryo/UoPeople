import jeliot.io.*;

class Example {
	static void main() {
		
		int input = Input.readInt();
		double real = 20;
		int i = 0;
		while ( real > input) {
			real = real * 0.4;
			i = i + 1;
			Output.println(i);
		}
		
	}
} 
