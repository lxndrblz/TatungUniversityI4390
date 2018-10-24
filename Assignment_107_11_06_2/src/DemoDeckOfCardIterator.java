/*
 * Demo Class for checking the functionality of the DeckOfCardIterator
 */

public class DemoDeckOfCardIterator {

	public static void main(String[] args) {
		DeckOfCardIterator deckOfCardIterator = new DeckOfCardIterator();
		// Shuffle the cards 
		deckOfCardIterator.shuffle();
		// Print the Current Deck
		deckOfCardIterator.printDeck();
		// Deal a card
		System.out.println("Card Received: ");
		deckOfCardIterator.deal().print_face_suit();
		// Print the Current Deck
		deckOfCardIterator.printDeck();
	}

}
