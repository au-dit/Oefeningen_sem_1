package cui;
import java.util.Scanner;
import domein.Matrix;


public class MatrixApplicatie {

	public static void main(String[] args) {
		
		//variabelen
		int[][] matrix;
		int rijen,kolommen;
		Scanner s = new Scanner(System.in);
		
		//rijen en kolommen krijgen
		System.out.print("Geef het aantal rijen van de matrix: ");
		rijen = s.nextInt();
		System.out.print("Geef het aantal kolommen van de matrix: ");
		kolommen = s.nextInt();
		
		//matrix opstellen
		matrix = new int[rijen][kolommen];
		for(int i = 0;i<rijen;i++) {
			for(int j = 0; j<kolommen;j++) {
				System.out.printf("Geef het element op rij %d en kolom %d: ",i+1,j+1);
				matrix[i][j] = s.nextInt();
			}
		}
		
		//nieuw matrix
		Matrix m1 = new Matrix(rijen,kolommen);
		
		m1.setGetallen(matrix);
		
		//transposeren
		matrix = m1.transponeer();
		
		//printen naar scherm
		System.out.print("\nDe getransposeerde matrix:\n");
		for(int[] rijWaarde: matrix) {
			for(int kolomWaarde : rijWaarde) {
				System.out.printf("%5d",kolomWaarde);
			}
			System.out.println();
		}
		
		
		s.close();
		
		
	}

}
