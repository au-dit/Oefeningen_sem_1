package H2_oefeningen;
import java.util.Scanner;

public class H2_Oef9_B {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		int input = 0, kleinste = 0, grootste = 0, i = 0;
		String foutMelding = "Er werden geen geldige getallen ingevoerd";
		
		
		
		while(true) 
		{
			System.out.printf("Geef een getal (0 om te stoppen): ");
			input =  userInput.nextInt();
			
			// testen voor eerste keer & foutmelding bij eerste keer
			if(i==0)
			{
				if (input == 0)
				{
					System.out.printf(foutMelding);
					break;
				}	
				grootste = kleinste = input;
				i ++;
			}	
			//als het 0 is afsluiten
			if (input == 0) 
			{
				System.out.printf("Het grootste ingegeven getal is: %d\nHet kleinste is: %d", grootste, kleinste);
				break;
			}
			// groter dan grootste? -> nieuwe grootste
			if (input > grootste) 
			{
				grootste = input;
			}
			// Kleiner dan kleinste -> nieuwe kleinste
			if (input < kleinste) 
			{
				kleinste = input;
			}
		}
			
		
	}

}
