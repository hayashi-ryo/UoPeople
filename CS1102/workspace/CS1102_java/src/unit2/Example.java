package unit2;

import java.util.Random;

public class Example {
	public static void main(String[] args) {
		// Example1
		// Generate random numbers less than or equal to 10 and exit the loop if the number is even
		// while loop
		Random rand = new Random();
		System.out.println("while loop");
		int num_1 = rand.nextInt(11);
		System.out.println("first number:"+num_1);
		while (num_1%2!=0) {
			System.out.println(num_1);
			num_1 = rand.nextInt(11);
		}
		
		// do..while loop
		System.out.println("do..while loop");
		int num_2 = rand.nextInt(11);
		System.out.println("first number:"+num_2);
		do {
			System.out.println(num_2);
			num_2 = rand.nextInt(11);
		} while(num_2%2!=0);
		
		// for loop
		System.out.println("for loop");
		int num_3=rand.nextInt(11);
		System.out.println("first number:"+num_3);
		for (int num3=num_3;num3%2!=0;num3=rand.nextInt(11)) {
			System.out.println(num3);
		}
		
		// Example2
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
		
		// Example3
		// Output numbers up to 15 in sequence in a single column.
		// while loop
		System.out.println("while loop");
		int exnum1=1;
		while (exnum1<16) {
			System.out.print(exnum1);
			exnum1++;
		}
		System.out.println("");
		
		// do..while loop
		System.out.println("do..while loop");
		int exnum2=1;
		do {
			System.out.print(exnum2);
			exnum2++;
		} while (exnum2<16);
		System.out.println("");
		
		// for loop
		System.out.println("for loop");
		for (int exnum3=1;exnum3<16;exnum3++) {
			System.out.print(exnum3);
		}
		System.out.println("");
		
	}
}
