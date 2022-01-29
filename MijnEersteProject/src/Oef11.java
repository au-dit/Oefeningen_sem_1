import java.util.Scanner;


public class Oef11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef een  geheel  getal  (>=999  en  <=9999)  in: ");
		int userNum = input.nextInt();
		
		System.out.println("Het getal bestaat uit: ");
		System.out.printf("%d duizendtallen%n%d honderdtallen%n%d tientallen%n%d eenheden", userNum/1000, (userNum%1000)/100, (userNum%100)/10, userNum%10);		
		
	}

}
