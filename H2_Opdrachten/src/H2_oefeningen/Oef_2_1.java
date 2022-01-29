package H2_oefeningen;
import java.util.Scanner;


public class Oef_2_1 {

	public static void main(String[] args) {
		
		
		
		while (true) {
			//Scanner voor input
			Scanner input = new Scanner(System.in);
			
			//input nemen
			int x = input.nextInt();
			
			//positief of negatief naar Y
			String y = (x >= 0)?"positief": "negatief";
			
			
			System.out.println(y);
			
			
		}
		
		
		
	}
	
}
