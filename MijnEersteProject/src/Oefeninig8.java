import java.util.Scanner;


public class Oefeninig8 {

	public static void main(String[] args) {
		// Scanner input maken
		Scanner input = new Scanner(System.in);
		
		// maken variabele
		int num1,num2,num3,verm;
		
		//input en output
		System.out.print("Eerst nummer: ");
		num1 = input.nextInt();
		
		System.out.print("Tweede nummer: ");
		num2 = input.nextInt();
		
		System.out.print("Derde nummer: ");
		num3 = input.nextInt();
		
		System.out.printf("De vermeningvuldiging van %d, %d en %d is %d", num1, num2, num3, (num1*num2*num3));
		
		
	}

}
