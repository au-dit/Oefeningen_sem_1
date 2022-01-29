package cui;
import java.util.Scanner;


public class ArrayFilterenOpGroteGetallen {

	public static void main(String[] args) {
		//vraag gebruiker voor 10 gehelen getallen (opslaan in een array) en een extra getal
		//print de getallen met index die groter zijn dan extra getal
		
		//variabele
		final int aantalGetallen = 10;
		int refGetal;
		Scanner input = new Scanner(System.in);
		int waardes[] = new int[aantalGetallen];
		String sumOpMessage = "\t%5s\t\t%6s\n";
		
		
		//krijg de waardes en sla op in array
		for(int i = 0; i<aantalGetallen; i++) {
			System.out.printf("Geef getal %d: ", i+1);
			waardes[i] = input.nextInt();
		}
		
		//vraag referentie getal
		System.out.printf("Geef nog een extra getal: ");
		refGetal = input.nextInt();
		
		//uitput printen
		System.out.printf("Deze getallen zijn strikt groter dan %d:\n"+ sumOpMessage,refGetal, "Index", "Waarde");
		for(int i=0; i<aantalGetallen;i++) {
			System.out.printf(sumOpMessage,""+(i+1), ""+waardes[i]);
		}
		
		input.close();
		

	}

}
