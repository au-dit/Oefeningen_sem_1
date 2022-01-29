package H2_oefeningen;

public class Oef11 {

	public static void main(String[] args) {
		
		double tempLeeuwen;
		int leeuwen = 50;
		int jaren = 0;
		do {
			tempLeeuwen = leeuwen;
			tempLeeuwen *= 1.15;
			leeuwen = (int) tempLeeuwen;
			jaren++;
		}while(leeuwen < 1000);
		
		System.out.printf("Na %d jaren zijn er meer dan 1000 leeuwen",jaren);
	}

}
