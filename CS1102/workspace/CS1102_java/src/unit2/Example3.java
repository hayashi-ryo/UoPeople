package unit2;

public class Example3 {

	public static void main(String[] args) {
		// Output numbers up to 15 in sequence in a single column.
		// while loop
		System.out.println("while loop");
		int num1=1;
		while (num1<16) {
			System.out.print(num1);
			num1++;
		}
		System.out.println("");
		
		// do..while loop
		System.out.println("do..while loop");
		int num2=1;
		do {
			System.out.print(num2);
			num2++;
		} while (num2<16);
		System.out.println("");
		
		// for loop
		System.out.println("for loop");
		for (int num3=1;num3<16;num3++) {
			System.out.print(num3);
		}
		System.out.println("");

	}

}
