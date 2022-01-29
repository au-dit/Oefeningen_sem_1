package H1Deel6;

import java.util.Scanner;


public class ZelfAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// making the scanner class
		Scanner inbreng = new Scanner(System.in);
		
		//Getting numbers
		System.out.print("First number: ");
		int num1 = inbreng.nextInt();
		
		System.out.print("Second number: ");
		int num2 = inbreng.nextInt();
		
		//Giving & calculating the sum
		int sum = num1 + num2;
		System.out.printf("The sum of these two numbers is: %d%n", sum);
		
	}

}
