package cui;
import java.util.Scanner;

public class GemiddeldElementen2DArray {

	public static void main(String[] args) {
		
		double gem = 0;
		double table[][]=new double[3][2];
		Scanner userInput = new Scanner(System.in);
		double input;
		int teller = 0;
		
		//opstellen tabel & meteen berekenen totale som & totaal aantal waardes
		for(int rij = 0; rij < 3; rij++) {
			for(int kolom = 0; kolom < 2; kolom++) {
				System.out.printf("Geef de waarde op rij %d en kolom %d: ",rij+1,kolom+1);
				input = userInput.nextDouble();	
				gem +=input;
				table[rij][kolom] = input;
				teller++;
			}
		}
		//berekenen gem
		gem /= teller;
		
		//Scanner sluiten
		userInput.close();
		//uitvoer
		String uitvoer=String.format("gemiddelde is %.1f",gem);
		System.out.print(uitvoer);

	}

}
