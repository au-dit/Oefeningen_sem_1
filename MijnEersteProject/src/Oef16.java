import java.util.Scanner;


public class Oef16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef een geheel getal in: ");
		int getal = input.nextInt();
		
		System.out.printf("octale notatie = %o%nhexadecimale notatie (kleine letters) = %x%nhexadecimale notatie (grote letters) = %X", getal,getal,getal);		
		

	}

}
