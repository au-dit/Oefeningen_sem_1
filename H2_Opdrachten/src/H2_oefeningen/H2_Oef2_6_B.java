package H2_oefeningen;
import java.util.Scanner;


public class H2_Oef2_6_B {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i = 1, totaal = 0;
		
		while (i<=5) {
			
			System.out.printf("Geef getal %d: ", i);
			totaal += input.nextInt();
			
			i++;
			
		}
		
		System.out.printf("De som van de getallen = %d", totaal);
		
	}

}
