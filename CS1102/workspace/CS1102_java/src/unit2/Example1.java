package unit2;
import java.util.Random;

public class Example1 {
	public static void main(String[] args) {
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
	}
}