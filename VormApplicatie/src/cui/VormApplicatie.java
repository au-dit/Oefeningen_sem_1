package cui;
import domein.Rechthoek;
import domein.Driehoek;
import java.util.Scanner;



public class VormApplicatie {

	public static void main(String[] args) {
		
		
		// variabelen
		int keuze;
		int rechthoekigeDriehoeken = 0;
		int grooteRechthoeken = 0;
		int vormen = 0;
		
		// teksten
		String header = "Rechthoeken en driehoeken\n-------------------------\n";
		String vraag = "Wil je graag een vorm ingeven (1=een rechthoek, 2= een driehoek, 0=nee)? ";
		String leaverText = "Overzicht vormen:%nTotaal aantal vormen: %d%n"
				+ "Aantal rechthoeken met opp > 50: %d%n"
				+ "Aantal rechthoekige driehoeken: %d%n";
		String driehoekText = "Geef de lengte van zijde %s: ";
		String rechthoekText = "Geef de %s van de rechthoek: ";
		
		
		//scanner maken
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s", header);
		
		while(true) {
			System.out.print(vraag);
			keuze = input.nextInt();
			
			if (keuze ==1){
				System.out.printf(rechthoekText, "lengte");
				double lengte = input.nextDouble();
				System.out.printf(rechthoekText, "breedte");
				double breedte = input.nextDouble();
				Rechthoek rechthoek = new Rechthoek(lengte,breedte);
				vormen++;
				if(rechthoek.berekenOppervlakte()>50)
					grooteRechthoeken++;
				
			} else if(keuze==2){
				System.out.printf(driehoekText,"A");
				int a = input.nextInt();
				System.out.printf(driehoekText,"B");
				int b = input.nextInt();
				System.out.printf(driehoekText,"C");
				int c = input.nextInt();
				Driehoek driehoek = new Driehoek(a,b,c);
				vormen++;
				if(driehoek.isRechthoekigeDriehoek())
					rechthoekigeDriehoeken++;
				
			}else break;
				
				
		}
		
		
		System.out.printf(leaverText,vormen,grooteRechthoeken,rechthoekigeDriehoeken);
		
		
	}


}

