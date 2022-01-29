package cui;
import domein.Marktkraam;
import java.util.Scanner;

public class MarktkraamApplicatie {

	public static void main(String[] args) {
		
		//variabele maken
		int aantalKramen;
		
		//scanner
		Scanner s = new Scanner(System.in);
		
		//hoeveel kramen?
		do {
			System.out.print("geef het aantal kramen op de rommelmarkt: ");
			aantalKramen = s.nextInt();
		}while(aantalKramen < 1);
		
		Marktkraam[] kramen = new Marktkraam[aantalKramen];
		for(int i=0;i<aantalKramen;i++) {
			System.out.printf("Geef de naam van de eigenaar van kraam %d: ",i+1);
			String naam = s.next();
			System.out.printf("Geef de lengte (in meter) van kraam %d: ",i+1);
			int lengte = s.nextInt();
			kramen[i] = new Marktkraam(naam,lengte);
		}
		
		//int keuze;
		
		do {
			System.out.print("Aan welk kraam wil je iets kopen?\n0. Stoppen\n");
			int teller = 1;
			for(Marktkraam kraam : kramen) {
				System.out.printf("%d. Kraam van %s\n",teller, kraam.getNaam());
				teller++;
			}
			
			System.out.print("Geef je keuze: ");
			int keuze = s.nextInt();
			if (keuze>0 && keuze<= aantalKramen) {
				System.out.print("Geef de prijs in EURO van de gekochte items: ");
				kramen[keuze-1].voegToeAanInkomsten(s.nextDouble());
			} else break;
			
		}while(true);
		
		System.out.print("Overzicht van de winsten per kraam.\n");
		int teller = 1;
		for(Marktkraam kraam : kramen) {
			System.out.printf("%4d%16s%22.2f EURO\n",teller,kraam.getNaam(),kraam.berekenWinst());
			teller++;
		}
			

	}

}
