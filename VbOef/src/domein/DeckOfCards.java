package domein;

public class DeckOfCards {
	//attributen
	private Card[] deck;
	private int currentCard;
	private final int NUMBER_OF_CARDS = 52;
	
	
	public DeckOfCards() {
		
		String[] faces={"Ace","Deuce","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suits={"Hearts","Diamonds","Clubs","Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		
		for(int i = 0; i<NUMBER_OF_CARDS; i++) {
			deck[i] = new Card(faces[i%13], suits[i/13]);
		}
		
	}
	
	//methodes
	public void shuffle() {
		currentCard = 0;
		
		for(int i = 0; i < NUMBER_OF_CARDS; i++) {
			 int second = (int) (Math.random()*NUMBER_OF_CARDS);
			 
			 Card temp = deck[i];
			 deck[i] = deck[second];
			 deck[second] = temp;
		}
	}
	
	public Card dealCard(){
		if(currentCard<=NUMBER_OF_CARDS) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}
	
	public void waardeTest() {
		System.out.printf("currentCard: %s\ndeck.length: %d\nNUMBER_OF_CARDS %d\n",currentCard, deck.length, NUMBER_OF_CARDS);
	}
}
