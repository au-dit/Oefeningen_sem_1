package H2_Theorie;
import java.util.Scanner;

public class while_lussen_vb3 {

	public static void main(String[] args) {
		
		//Vraag aan 10 studenten hun punten
		// geef gemiddelde en totaal
		Scanner gegeven = new Scanner(System.in);
		
		int student = 0;
		int puntStudent;
		int totaalPunten = 0;
		int gemiddeldePunten = 0;
		
		do {
			student ++;
			
			System.out.printf("Hallo student %d. Hoeveel punten had jij?%n", student);
			puntStudent = gegeven.nextInt();
			
			totaalPunten += puntStudent;
		}while (student < 10);
			
			
		
		
		System.out.printf("Van de %d %s was de totale score: %d en het klasgemiddelde: %d",student, (student == 1)? "student":"studenten", totaalPunten, totaalPunten/student );
		gegeven.close();
	}

}
