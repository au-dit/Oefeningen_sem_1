package H2_Theorie;

public class H2_6_3_nested_if_else {

	public static void main(String[] args) {
		
		// a & b maken
		int a = 1;
		int b = 5;
		while (a < b)
		{
			int z = a<b? a++: b--;
			System.out.printf("a = %d & b = %d & z = %d%n",a,b,z);
		}

	}

}
