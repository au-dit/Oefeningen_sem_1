package cui;
import java.security.SecureRandom;
import java.util.Random;


public class TestSecureRandom {

	static int min;
	static int max;
	static int testLengte = 5000000;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		int dobbelOgen[] = new int[6];
		
		for(int i = 0; i<testLengte; i++) {
			
			++dobbelOgen[random.nextInt(6)];
		
		}
		
		System.out.printf("%s%25s%n","Worp","Aantal keer geworpen");
		for(int i=0; i<dobbelOgen.length ;i++){
			System.out.printf("%3d%15d%n",i+1,dobbelOgen[i]);
		}
		
	}

}
