package H2_oefeningen;

import java.util.Scanner;


public class H2_Oef9_A {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int gegeven = 0, totaal = 0, hoeveel = 0;
		double gemiddelde = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.printf("Geef een getal (0 om te stoppen):\t");
			gegeven = input.nextInt();
			
			if (gegeven < 0) {
				hoeveel ++;
				totaal += gegeven;
			}
			
		}
		
		if (hoeveel == 0) 
			System.out.printf("Er werden geen negatieve getallen ingevoerd");
		else
			gemiddelde = (double)totaal/hoeveel;
			System.out.printf("Het gemiddelde van alle negatieve getallen is: %.1f", gemiddelde);
		

	}

}
