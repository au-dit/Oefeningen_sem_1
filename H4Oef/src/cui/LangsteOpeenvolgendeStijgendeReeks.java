package cui;
import java.util.*;

public class LangsteOpeenvolgendeStijgendeReeks {

	public static void main(String[] args) {
		
		int[] a = {4,7,15,3,9,22,36,24,28,14,19,27,30,31,2,9,29,30,16,19};
		int langsteVolgLengte = 0;
		int huidigeVolgLengte = 0;
		
		ArrayList<Integer> langsteRij = new ArrayList<>();
		ArrayList<Integer> huidigeRij = new ArrayList<>();
		
		int vorig = a[0];
		huidigeRij.add(a[0]);
		
		
		for(int getal: a) {
			if(getal>vorig) {
				huidigeVolgLengte++;
				huidigeRij.add(getal);
			}else {
				if(huidigeVolgLengte>langsteVolgLengte) {
					langsteRij.clear();
					langsteRij.addAll(huidigeRij);
					langsteVolgLengte = huidigeVolgLengte;
				}
				huidigeVolgLengte = 1;
				huidigeRij.clear();	
				huidigeRij.add(getal);
			}
			vorig = getal;
		}
		
		System.out.printf("Het meest aantal opeenvolgende stijgende getallen is %d en bestaat uit de reeks: ",langsteVolgLengte);
		for(int waarde : langsteRij)
			System.out.print(" "+waarde);
		
	}

}
