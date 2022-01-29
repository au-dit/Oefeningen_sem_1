package H2_Theorie;

public class floats_and_doubles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float float_getal;
		double double_getal;
		
		float_getal = 10;
		double_getal = float_getal;
		float_getal *= 12.123456789;
		double_getal *= 12.123456789;
		System.out.printf("%s%.14f%n", "float: ", float_getal);
		System.out.printf("%s%.14f%n", "double: ", double_getal);
	}

}
