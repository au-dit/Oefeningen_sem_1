package H2_Theorie;
import java.util.Scanner;


public class Switch_Statements {
	
	public static void main(String[] args) {
		//Scanner input maken
		Scanner input = new Scanner(System.in);
		
		//testen voor syntax van switch statement
		while (true) {
			System.out.println("Give a number between 0 & 5");
			int inNumber = input.nextInt();
			
			switch (inNumber) {
				case 5 -> System.out.println("5");
				case 4 -> System.out.println("4");
				case 3 -> System.out.println("3");
				case 2 -> System.out.println("2");
				case 1 -> System.out.println("1");
				case 0 -> System.out.printf("0/nHappy new year!!!");
				default -> System.out.println("Idiot!");
			}
		input.close();	
		}
		
			
			
		}
			
			
		
	}


