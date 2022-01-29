package cui;
import domein.Product;
import java.util.Scanner;


public class ProductApplicatie {
	public static void main(String[] args) {
		
		//maken objecten
		Product pannenkoek = new Product("Pannenkoek", 0.125, 21, 5);
		Product pannenkoekMetSuiker = new Product("Pannenkoek met suiker", 2, 6, 10);
		Product pannenkoekMetChoco = new Product("Pannenkoek met choco", 2.2, 6, 15);
		
		Scanner input = new Scanner(System.in);
		
		//variabele maken
		double totPrijs = 0;
		String messPan = "Hoeveel stuks wilt u van '%s'? ";
		int aantal;
		
		//de echte stuff
		//Pannenkoeken
		System.out.printf("%n" + messPan, pannenkoek.getNaam());
		aantal = input.nextInt();
		totPrijs += pannenkoek.berekenPrijs(aantal);
		
		//Pannenkoeken met suiker
		System.out.printf("%n" + messPan, pannenkoekMetSuiker.getNaam());
		aantal = input.nextInt();
		totPrijs += pannenkoekMetSuiker.berekenPrijs(aantal);
		
		//Pannenkoeken met choco
		System.out.printf("%n" + messPan, pannenkoekMetChoco.getNaam());
		aantal = input.nextInt();
		totPrijs += pannenkoekMetChoco.berekenPrijs(aantal);
		
		//totale prijs geven
		System.out.printf("Aan de kassa zal u '%.2f' EURO moeten betalen", totPrijs);
	}
}
