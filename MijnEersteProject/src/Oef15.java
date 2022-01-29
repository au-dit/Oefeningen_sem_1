import java.util.Scanner;


public class Oef15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef het eerste getal in: ");
		int num1 = input.nextInt();
		
		System.out.print("Geef het tweede getal in: ");
		int num2 = input.nextInt();
		
		System.out.print("Geef het derde getal in: ");
		int num3 = input.nextInt();
		
		int som = num1+num2+num3;
		int gem = som/3;
				
		System.out.printf("Van de ingevoerde getallen %d, %d en %d%nIs de som %d%nhet gemiddelde %d%nen de rest %d",num1,num2,num3,som,gem, som%gem);		
		
		
	}

}
