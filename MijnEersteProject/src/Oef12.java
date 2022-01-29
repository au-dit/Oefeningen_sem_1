import java.util.Scanner;


public class Oef12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Geef de hoogte van de muur in cm in: ");
		int hoogte = input.nextInt();
		
		System.out.print("Geef de lengte van de muur in cm in: ");
		int lengte = input.nextInt();
		
		int rollen = ((lengte/50+1)*(hoogte))/1000;
		rollen ++;
		
		System.out.printf("Het aantal benodigde rollen is %d",rollen);
	}

}
