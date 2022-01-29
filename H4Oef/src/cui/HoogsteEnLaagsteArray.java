package cui;

public class HoogsteEnLaagsteArray {

	public static void main(String[] args) {
		/* 
		nitialiseer een array met de omzet per maand van een bepaald warenhuis. 
		De omzetwaarden zijnrespectievelijk:  360,  2100,  450,  1450,  650,  780,  321,  1200,  560,  1850,  960,  420.  
		Druk  vervolgens  de laagste en de hoogste waarde van de omzet af en het nummer van de corresponderende maand.
		 */
		
		
		//innit variabele
		int omzetWaarde[] = {360,  2100,  450,  1450,  650,  780,  321,  1200,  560,  1850,  960,  420};
		final int lengteArray = omzetWaarde.length;
		String printMessage = "\n%s omzet %d in maand %d";
		int posHoogste = 0;
		int posLaagste = 0;
		
		
		//Positie zoeken van laagste en hoogste getal.
		for(int i=0; i<lengteArray; i++) {
			if (omzetWaarde[i]<omzetWaarde[posLaagste]) {
				posLaagste = i;
			}
			if(omzetWaarde[i]>omzetWaarde[posHoogste]) {
				posHoogste = i;
			}
		}
		
		
		//Printen
		System.out.printf(printMessage, "Hoogste", omzetWaarde[posHoogste], posHoogste+1);
		System.out.printf(printMessage, "Laagste", omzetWaarde[posLaagste], posLaagste+1);
		
		
		
		
		
	}

}
