package H2_oefeningen;
import java.util.Scanner;


public class H2_Oef2_6_A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, totaal, even, deel3, gegevenNummer;
		i= 1;
		totaal = even = deel3 = 0;
		
		while (i<=5) {
			
			System.out.printf("Geef getal %d: ", i);
			gegevenNummer = input.nextInt();
			
			if (gegevenNummer % 2 == 0)
				even ++;
			if (gegevenNummer %3 == 0)
				deel3++;
			
			i++;
			
		}
		
		System.out.printf("Je gaf %d even getallen en %d getallen deelbaar door 3.", even, deel3);
		
	}

}
