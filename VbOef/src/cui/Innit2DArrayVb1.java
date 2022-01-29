package cui;

public class Innit2DArrayVb1 {

	public static void main(String[] args) {
		
		
		int[][]array={{1,2,3},{4,5}};
		//final int aantalKolommen = array.length;
		
		for(int[] rij: array) {
			
			for(int element : rij) {
				System.out.printf("%-5d",element);
			}
			System.out.println();
		}
	}

}
