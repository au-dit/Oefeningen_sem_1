import java.util.Scanner;


public class Oef14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Geef een positief getal in: ");
		int num = input.nextInt();
		
		System.out.printf("%10d%10d%10d%10d%10d", 1, 10, 100, 1000, 10000);
		System.out.printf("%n%10d%10d%10d%10d%10d", num*1, num*10, num*100, num*1000, num*10000);
	}
}
