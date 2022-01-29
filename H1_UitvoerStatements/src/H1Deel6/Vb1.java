package H1Deel6;

import java.util.Scanner;

public class Vb1 {

	public static void main(String[] args) {
		
		Scanner inbreng = new Scanner(System.in);
		
		int number1; //first number
		int number2; //second number
		int sum; //place for end result
		
		System.out.print("Enter first integer: ");
		number1 = inbreng.nextInt();
		
		System.out.print("Enter a second integer: ");
		number2 = inbreng.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("The sum is: %d%n", sum);
		

	}

}


