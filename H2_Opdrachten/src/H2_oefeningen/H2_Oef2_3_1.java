package H2_oefeningen;
import java.util.Scanner;

public class H2_Oef2_3_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x , y = 0;
		
		while (true) {
			
			
			
			x = input.nextInt();
			
			switch (x) {
			case 100,150,170,190 -> y++;
			}
			
			System.out.printf("y = %d%n", y);
		}
	}

}
