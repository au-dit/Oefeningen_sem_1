import java.util.Scanner;


public class Oef10Rechthoek {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome bij de rechthoek berekenaar! Geef hieronder de info voor je rechthoek.");
		System.out.print("Lengte van de rechthoek: ");
		int lengte = userInput.nextInt();
		System.out.print("Breedte van de rechthoek: ");
		int breedte = userInput.nextInt();
		
		System.out.printf("De omtrek = %d%nDe oppervlakte = %d",2*(lengte+breedte), lengte*breedte);
	}

}
