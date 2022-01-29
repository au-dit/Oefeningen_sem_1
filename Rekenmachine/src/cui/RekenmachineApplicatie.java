package cui;
import domein.Rekenmachine;
import java.util.Scanner;

public class RekenmachineApplicatie {

	public static void main(String[] args) {
		
		//variables
		String mainTekst = "Welke actie wil je uitvoeren?%n1. Som%n2. Verschil%n3. Vermenigvuldiging%n4. Deling%n5. Stoppen%n";
		String tekst1steGetal = "Geef een getal: ";
		String tekst2deGetal = "Geef een 2de getal: ";
		double getal1;
		double getal2;
		int keuze;
		boolean waarde = true;
		
		//scanner & rekenmachine maken
		Scanner input = new Scanner(System.in);
		Rekenmachine rek = new Rekenmachine();
		
		
		
		// loopke 
		while (waarde == true) {
			System.out.printf(mainTekst);
			keuze = input.nextInt();
			
			switch(keuze) {
			case 1 -> {
				rek.clear();
				System.out.printf(tekst1steGetal);
				getal1 = input.nextDouble();
				System.out.printf(tekst2deGetal);
				getal2 = input.nextDouble();
				rek.telOp(getal1);
				rek.telOp(getal2);
				System.out.printf("%.2f + %.2f = %.2f%n%n", getal1, getal2, rek.getResultaat());
			}
			case 2 -> {
				rek.clear();
				System.out.printf(tekst1steGetal);
				getal1 = input.nextDouble();
				System.out.printf(tekst2deGetal);
				getal2 = input.nextDouble();
				rek.telOp(getal1);
				rek.trekAf(getal2);
				System.out.printf("%.2f - %.2f = %.2f%n%n", getal1, getal2, rek.getResultaat());
			}
			case 3 -> {
				rek.clear();
				System.out.printf(tekst1steGetal);
				getal1 = input.nextDouble();
				System.out.printf(tekst2deGetal);
				getal2 = input.nextDouble();
				rek.telOp(getal1);
				rek.vermenigvuldig(getal2);
				System.out.printf("%.2f * %.2f = %.2f%n%n", getal1, getal2, rek.getResultaat());
			}
			case 4 -> {
				rek.clear();
				System.out.printf(tekst1steGetal);
				getal1 = input.nextDouble();
				System.out.printf(tekst2deGetal);
				getal2 = input.nextDouble();
				rek.telOp(getal1);
				rek.deelDoor(getal2);
				System.out.printf("%.2f / %.2f = %.2f%n%n", getal1, getal2, rek.getResultaat());
			}
			case 5 -> {
				waarde = false;
			}
		
		}

	}

}
}
