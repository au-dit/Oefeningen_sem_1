import java.util.Scanner;

public class Oef9Salaris {

	public static void main(String[] args) {

		Scanner ingave = new Scanner(System.in);
		
		int brMaanSal;
		
		System.out.print("Wat is je bruto maandsalaris: ");
		brMaanSal = ingave.nextInt();
		
		
		System.out.printf("Bruto jaarsalaris = %d €\nVakantiegeld = %d", (brMaanSal*12), (((brMaanSal*12)/100)*8));
	}

}
