package cui;

public class EnhancedForLoop {
	public static void main(String[] args) {
		int[]getal={4,8,2,3,5,17,7,99,3,12};
		
		int kleinste=Integer.MAX_VALUE;
		
		for(int waarde : getal) {
			if(waarde<kleinste) {
				kleinste=waarde;
			}
		}
		
		for(int i=0;i<getal.length;i++) {
			getal[i]*=2;
		}
	}
}
