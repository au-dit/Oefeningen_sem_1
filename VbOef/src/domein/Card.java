package domein;

public class Card {
	
	
	// attributen 
	private final String face;
	private final String suit;
	
	
	//constructoren
	public Card(String face,String suit) {
		this.face = face;
		this.suit = suit;
	}
	
	//methoden
	public String toString() {
		return face + " of " +suit;
	}
	
}
