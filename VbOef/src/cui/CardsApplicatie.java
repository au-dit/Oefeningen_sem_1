package cui;

import domein.DeckOfCards;
import domein.Card;

public class CardsApplicatie {
	public static void main(String[] args) {
		
		/*
		DeckOfCards deck = new DeckOfCards();
		deck.waardeTest();
		deck.shuffle();
		deck.waardeTest();
		
		for (int i= 0; i<7;i++) {
		System.out.printf(deck.dealCard()+"\n");
		}
		
		deck.waardeTest();
		*/
		
		DeckOfCards deck = new DeckOfCards();
		Card kaart = deck.dealCard();
		String kaartNaam;
		int maxLength = 0;
		int length;
		final int SHUFFLE_COUNT = 5;
		for(int i=0; i<52; i++) {
			for(int j = 0; j<SHUFFLE_COUNT; j++) {
				deck.shuffle();
			}
			kaart = deck.dealCard();
			kaartNaam = kaart.toString();
			length = kaartNaam.length();
			maxLength = (length>maxLength)? length: maxLength;
			
			System.out.printf("%-19s", kaartNaam);
			if((i+1)%4 == 0) {
				System.out.println();
			}
		}
		System.out.print(maxLength);
		
	}
}
