package cui;
import java.util.*;

public class ArrayListVullenZonderDubbel2 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<Integer> lijst = new ArrayList<>();
		int in,deler;
		
		//krijg een 8 cijferige integer
		do {
			System.out.print("Geef een getal van 8 cijfers :\n");
			in = userInput.nextInt();
		}
		while(in>=100000000 || in<10000000);
		
		//elk cijfer apart krijgen (beginnend vanvoor) & toevoegen aan de lijst indien uniek
		deler=10000000;
		do {
			int eenheid = in/deler;
			in%=deler;
			deler/=10;
			if(!lijst.contains(eenheid))
				lijst.add(eenheid);
		}while (in>0);
		
		//printen!!!
		System.out.println("Alle verschillende cijfers in dit getal (in volgorde van voorkomen) zijn: ");
		for(int waarde : lijst)
			System.out.printf("%3d", waarde);
		
		userInput.close();
	}

}
