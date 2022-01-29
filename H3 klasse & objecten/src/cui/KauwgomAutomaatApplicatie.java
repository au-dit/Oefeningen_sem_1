package cui;
import domein.KauwgomAutomaat;

public class KauwgomAutomaatApplicatie {

	public static void main(String[] args) {
		
		// variable
		String message1 = "De kleur van de %s automaat is: \"%s\". Deze bezit %d balletjes%n";
		
		//automaten maken
		KauwgomAutomaat automaat1 = new KauwgomAutomaat();
		KauwgomAutomaat automaat2 = new KauwgomAutomaat(50);
		
		//printen
		System.out.printf(message1, "1ste",automaat1.getKleur(), automaat1.getAantalBallen());
		System.out.printf(message1, "2de",automaat2.getKleur(), automaat2.getAantalBallen());
		
		
		//automaat ontgrendelen
		automaat1.setVergrendeld(false);
		
		//automaat1 bijvullen
		automaat1.vulBij(20);
		
		//automaat1 vergrendelen
		automaat1.setVergrendeld(true);
		
		//printen
		System.out.printf(message1, "1ste",automaat1.getKleur(), automaat1.getAantalBallen());
		System.out.printf(message1, "2de",automaat2.getKleur(), automaat2.getAantalBallen());
		
		//automaat1 nogmaals vullen
		automaat1.vulBij(75);
		
		//printen
		System.out.printf(message1, "1ste",automaat1.getKleur(), automaat1.getAantalBallen());
		System.out.printf(message1, "2de",automaat2.getKleur(), automaat2.getAantalBallen());
		
	}
	
	

}
