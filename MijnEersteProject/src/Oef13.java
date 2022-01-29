import java.util.Scanner;


public class Oef13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Geef een datum in <ddmmjjjj>: ");
		int datum = input.nextInt();
		
		int dag = (datum / 1000000);
		int maand = (datum/10000)%100;
		
		int dagenTotNieuw = (30*(12-maand)) + (30-dag);
		
		System.out.printf("Het zijn nog %d dagen tot nieuwjaar!!", dagenTotNieuw);
		
	}

}
