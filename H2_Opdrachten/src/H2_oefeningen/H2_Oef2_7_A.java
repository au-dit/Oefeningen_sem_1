package H2_oefeningen;

public class H2_Oef2_7_A {

	public static void main(String[] args) {
		
		int totaal = 0;
		int i = 1;
		
		
		while (i <= 500){
			
			if(i % 12 == 0) {
				totaal += i;
			}
			
			i++;
			
		}
		
		
		System.out.printf("Het totaal is: %d", totaal);
			
		

	}

}
