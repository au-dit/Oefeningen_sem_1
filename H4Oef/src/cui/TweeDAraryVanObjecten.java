package cui;
import domein.Rekening;
import java.util.Scanner;

public class TweeDAraryVanObjecten {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int rijen = 3;
		Rekening rekeningen[][] = new Rekening[rijen][];
		double basisGetal = 10;
		int rijLengte;
		int kolomLengte;
		
		//rijlengtes krijgen
		for(int i = 0; i<rijen;i++) {
			System.out.printf("Geef het aantal kolommen voor rij %d: ",i+1);
			rekeningen[i] = new Rekening[userInput.nextInt()];
		}
		
		//saldo's toekennnen en geformatteerd weergeven
		rijLengte = rekeningen.length;
		for(int i = 0;i<rijLengte;i++) {
			kolomLengte = rekeningen[i].length;
			for(int j=0; j<kolomLengte;j++) {
				rekeningen[i][j] = new Rekening();
				rekeningen[i][j].stortOp((basisGetal*(j+1))+i);
				System.out.printf("%-8.2f",rekeningen[i][j].getSaldo());
			}
			System.out.println();
		}
		
	}

}
