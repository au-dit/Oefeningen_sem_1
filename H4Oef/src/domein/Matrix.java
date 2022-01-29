package domein;

public class Matrix {
	//variablelen
	int[][] getallen;
	
	
	//constructoren
	public Matrix(int aantalRijen, int aantalKolommen) {
		aantalRijen = (aantalRijen < 1)? 1:aantalRijen;
		aantalKolommen = (aantalKolommen<1)?1:aantalKolommen;
		
		this.getallen = new int[aantalRijen][aantalKolommen];
	}
	
	//setters
	public void setGetallen(int[][] getallen) {
		this.getallen = getallen;
	}
	
	//getters
	public int[][] getGetallen(){
		return getallen;
	}
	
	//methodes
	public int[][] transponeer(){
		int rijen = getallen.length;
		int kolommen = getallen[0].length;
		
		int[][] newMatrix = new int[kolommen][rijen];
		
		for(int i=0;i<rijen;i++) {
			for(int j=0;j<kolommen;j++) {
				newMatrix[j][i] = getallen[i][j];
			}	
		}
		return newMatrix;
	}
	
	
}
