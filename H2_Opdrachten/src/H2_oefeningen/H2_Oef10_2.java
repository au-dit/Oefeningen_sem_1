package H2_oefeningen;
import java.util.Scanner;


public class H2_Oef10_2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input1, input2;
		
		do {
			System.out.println("Geef een getal niet gelijk aan 1000 en niet deelbaar door 12");
			input1 = scanner.nextInt();
		}while(input1 == 1000 || input1 % 12 == 0);
		
		do {
			System.out.println("Geef een getal groter dan het vorige");
			input2 = scanner.nextInt();
		}while(input1 >= input2);
			
		
	}

}
