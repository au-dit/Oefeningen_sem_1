package cui;
import java.util.*;

public class ArrayListVullenEnTonen {

	public static void main(String[] args) {
		
		List<Double> lijst = new ArrayList<>();
		Scanner userInput = new Scanner(System.in);
		double input;
		
		//innemen van waardes die 0 of meer zijn
		do {
			System.out.print("Geef een positief bedrag (stoppen met -1): ");
			input = userInput.nextDouble();
			if(input>=0) {
				lijst.add(input);
			}
		} while(input != -1);
		
		//controle op lege lijst
		if( lijst.size() == 0)
			System.out.print("De lijst is leeg!!");
		else
			//uitprinten alle waardes in de lijst
			System.out.print("De lijst met bedragen: ");
			for(double waarde : lijst) 
				System.out.printf("%9.2f", waarde);	
		
		userInput.close();
	}

}
