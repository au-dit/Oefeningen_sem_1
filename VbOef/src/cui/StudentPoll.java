package cui;

public class StudentPoll {
	public static void main(String[] args) {
		
		int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2};
		int[] frequency = new int[6];
		
		int frequencyLength= frequency.length;
		
		/*loopen door responses array
		de waarde van de positie (overeenkomend met de respons waarde) in frequency 
		met 1 verhogen */
		
		for(int i=0;i<responses.length;i++) {
			
			++ frequency[responses[i]];
		}
		
		
		//Alles mooi weergeven
		System.out.printf("%s %s\n","Rating", "Frequency");
		
		for(int i = 1; i<frequencyLength; i++) {
			System.out.printf("%6d %9d\n", i, frequency[i]);
		}
		
	}
}
