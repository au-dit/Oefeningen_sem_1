package H2_oefeningen;

public class Oef12 {

	public static void main(String[] args) {
		
		int a =0, b=0, c=0;
		
		a = ++b + ++c;
		System.out.printf("a = %d, b = %d, c = %d%n",a,b,c);
		
		a = b++ + c++;
		System.out.printf("a = %d, b = %d, c = %d%n",a,b,c);
		
		a = ++b + c++;
		System.out.printf("a = %d, b = %d, c = %d%n",a,b,c);
		
		a = b-- + c--;
		System.out.printf("a = %d, b = %d, c = %d%n",a,b,c);
		

	}

}
