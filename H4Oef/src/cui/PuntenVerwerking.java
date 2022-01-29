package cui;
import java.util.*;

public class PuntenVerwerking {

	public static void main(String[] args) {
		
		//vars
		String[] namenLijst = {"Jan","Piet","Els","Mark","Bob"
				,"Josh","Romeo","JackShiraq","Samson","MohGertjeToch"};
		ArrayList<String> geslaagd = new ArrayList<>();
		ArrayList<String> gebuisd = new ArrayList<>();
		int lengte = namenLijst.length;
		int[] punten = new int[lengte];
		Scanner s = new Scanner(System.in);
		int input;
		
		for(int i = 0; i<lengte;i++) {
			
			do {
				System.out.printf("Geef de punten [0,20] van %s: ",namenLijst[i]);
				input = s.nextInt();
			}while(input<0 || input > 20);
			
			punten[i] = input;
			
			if(punten[i]>=10)
				geslaagd.add(namenLijst[i]);
			else
				gebuisd.add(namenLijst[i]);
			
		}
		
		//printen
		int geslaagden = geslaagd.size();
		int gebuisden = gebuisd.size();
		
		if(geslaagden > 0) {
			System.out.println("Volgende Studenten zijn geslaagd: ");
			for(int i = 0; i<geslaagden; i++)
				System.out.println(geslaagd.get(i));
		}else
			System.out.println("Er zijn geen geslaagden studenten");
		
		if(gebuisden > 0) {
			System.out.println("Volgende Studenten zijn gebuisd: ");
			for(int i = 0; i<gebuisden; i++)
				System.out.println(gebuisd.get(i));
		}else
			System.out.println("Er zijn geen gebuidsden studenten");
		
		s.close();
	}

}
