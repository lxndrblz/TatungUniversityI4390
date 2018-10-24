/*
 * Demo Class for checking the functionality of the DeckOfCard
 */
public class DemoDeckOfCard {

	public static void main(String[] args) {
		DeckOfCard deckOfCard = new DeckOfCard();
		// Shuffle the cards 
		deckOfCard.shuffle();
		// Print the Current Deck
		deckOfCard.printDeck();
		// Deal a card
		System.out.println("Card Received: ");
		deckOfCard.deal().print_face_suit();
		// Print the Current Deck
		deckOfCard.printDeck();
	}

}
