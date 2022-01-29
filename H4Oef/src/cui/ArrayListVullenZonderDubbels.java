package cui;
import java.util.*;

public class ArrayListVullenZonderDubbels {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> lijstNummers = new ArrayList<>();
		int getalUser;
		int getalLengte;
		String getalUserString;
		
		do {
			System.out.print("geef een getal van 8 cijfers :\n");
			getalUser = userInput.nextInt();
			getalUserString = String.valueOf(getalUser);
			getalLengte = getalUserString.length();
		}
		while(getalLengte != 8);
		
		for(int i=0; i<8; i++) {
			String zoek = getalUserString.charAt(i)+"";
			if(lijstNummers.contains(zoek));
			else
				lijstNummers.add(zoek);
		}
		
		
		System.out.print("Alle verschillende cijfers in dit getal (in volgorde van voorkomen) zijn: \n" );
		for(String nummer : lijstNummers)
			System.out.print("  " + nummer);
			//System.out.print(getalUserString.charAt(i));
			
			//System.out.println(getalUser);
			//System.out.println();
		
		userInput.close();
		

	}

}
