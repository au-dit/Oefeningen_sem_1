package cui;

public class GradeDistribution {

	public static void main(String[] args) {

		//array maken
		int array[]={8,0,6,7,11,9,13,5,17,2,1};
		
		//constantes maken
		final String START_MESSAGE = "Grade Distribution";
		
		
		
		// effectieve logica
		
		System.out.printf(START_MESSAGE);
		
		for(int i = 0; i < array.length; i++) {
			System.out.printf("\n");
			
			if (i+1 == array.length) {
				System.out.printf("%5d: ",i*10);
			}
			if (i+1 < array.length) {
				System.out.printf("%02d-%02d: ", i*10, i*10+9); 
			}
			
			for(int j = 0; j<array[i]; j++) {
				System.out.printf("*");
			}
		}

	}

}
