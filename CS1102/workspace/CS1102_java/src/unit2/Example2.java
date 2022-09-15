package unit2;

public class Example2 {
	public static void main(String[] args) {
		/* For numbers up to 30, output is based on conditions:
		Divisible by 3:Fizz
		Divisible by 5:Buzz
		Divisible by 3 and 5:FizzBuzz
		*/
		
		// while loop
		System.out.println("while loop");
		int num1=1;
		while (num1<31) {
			int F = num1%3;
			int B = num1%5;
			if ((F==0)&&(B==0)) {
				System.out.println("FizzBuzz");
			} else if (F==0){
				System.out.println("Fizz");
			} else if (B==0) {
				System.out.println("Buzz");
			}
			num1++;
		}
		
		// do..while loop
		System.out.println("do..while loop");
		int num2=1;
		do {
			int F = num2%3;
			int B = num2%5;
			if ((F==0)&&(B==0)) {
				System.out.println("FizzBuzz");
			} else if (F==0){
				System.out.println("Fizz");
			} else if (B==0) {
				System.out.println("Buzz");
			}
			num2++;
		} while (num2<31);
		
		// for loop
		System.out.println("for loop");
		for (int num3=1;num3<30;num3++) {
			int F = num3%3;
			int B = num3%5;
			if ((F==0)&&(B==0)) {
				System.out.println("FizzBuzz");
			} else if (F==0){
				System.out.println("Fizz");
			} else if (B==0) {
				System.out.println("Buzz");
			}
		}
	}
}
