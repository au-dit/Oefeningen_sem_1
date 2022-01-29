package cui;
import java.util.*;

public class FrequentieTabel {

	public static void main(String[] args) {

		int nummersLengte = 20;
		int invoer;
		int[] nummers = new int[nummersLengte];
		int[] frequentie = new int[10];
		Scanner s = new Scanner(System.in);
		
		//invoer user getallen + bijhouden frequentie
		for(int i=0; i<nummersLengte;i++) {
			do {
				System.out.printf("Geef een getal in range [1,10]: (%d)",i+1);
				invoer = s.nextInt();
			}
			while(invoer<1 || invoer>10);
			
			frequentie[invoer-1]++;
			nummers[i] = invoer;
		}
		
		
		// printen gegeven nummers in de array
		System.out.print("De array bevat volgende getallen: \n");
		for(int nummer : nummers)
			System.out.print(nummer+" ");
		
		System.out.print("\nDit levert volgende frequentie op");
		System.out.printf("\n\n%10s%16s\n","GETAL", "AANTAL KEER");
		for(int i=0; i<10;i++) {
			System.out.printf("%10d%16d\n",i+1,frequentie[i]);
		}

		s.close();
	}

}
