package H2_oefeningen;

import java.util.Scanner;

public class H2_Oef2_3 {

	public static void main(String[] args) {
		
		int i,k = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		while (true) {
			
			
			
			i = userInput.nextInt();
			
			switch (i) {
				case 1 -> k=3;
				case 2 -> k=6;
				case 3,4 -> k=10;
				default -> k=20;
			};
			System.out.println(k);
			
		}
		
		
	}

}
