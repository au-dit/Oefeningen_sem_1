package H2_oefeningen;
import java.util.Scanner;

public class H2_Oef10_1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input;
		
		do 
		{
			
			//krijgen van input
			System.out.println("Geef een strikt negatief oneven getal.");
			input = scanner.nextInt();
			
		}while(input > 0 || input % 2 != -1);
			

	}

}
