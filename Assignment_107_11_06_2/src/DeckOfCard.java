/*
 * DeckOfCard class is used to represent a deck of playing cards.
 * A deck of playing cards consists of 52 different cards.
 * Each playing card has a face (e.g., “Ace”, “deuce”, “Three”, … , “Jack”,
 * “Queen”, “King”) and a suit (e.g., “Hearts”, “Diamonds”, “Clubs”, “Spades”).
 * The DeckOfCard class has method to shuffle the cards in the deck.
 * And, a method to deal a card. Use a Card class to represent a playing card.
 * The Card class should be an inner class of the DeckOfCard class.
 * Design a main method to shuffle the cards and then print out the cards in the deck.
 */

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCard {
	// ArrayList for storing all the cards of the deck
	private ArrayList<Card> deck = new ArrayList<Card>(52);

	// Default constructor instantiates a whole deck of cards when called
	public DeckOfCard() {
		for (Card.Face face : Card.Face.values()) {
			for (Card.Suit suit : Card.Suit.values()) {
				// instantiate new card and add to deck
				Card c = new Card(face, suit);
				deck.add(c);
			}
		}
	}

	protected static class Card {
		private Face face;
		private Suit suit;

		// Getter for face variable
		public Face getFace() {
			return face;
		}

		// Setter for face variable
		public void setFace(Face face) {
			this.face = face;
		}

		// Getter for suit variable
		public Suit getSuit() {
			return suit;
		}

		// Setter for suit variable
		public void setSuit(Suit suit) {
			this.suit = suit;
		}

		// Constructor for generating the card
		public Card(Face face, Suit suit) {
			this.face = face;
			this.suit = suit;
		}

		public enum Face {
			Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
		}

		public enum Suit {
			Clubs, Diaomonds, Hearts, Spades
		}

		// Prints the face and suit of a card
		public void print_face_suit() {
			System.out.format("Face: %6s, Suit: %10s \n", getFace(), getSuit());
		}

	}

	// Shuffles all the cards inside the deck
	public void shuffle() {
		Collections.shuffle(deck);
	}

	// Takes the last card of the deck and returns it
	public Card deal() {
		Card card = null;
		// make sure there are still cards left
		if (deck.size() > 0) {
			card = deck.get(deck.size() - 1);
			deck.remove(card);
		}
		return card;
	}

	// Prints all existing cards in the deck
	public void printDeck() {
		System.out.format("Cards in stack: %d \n", deck.size());
		for (Card d : deck) {
			d.print_face_suit();
		}
	}

}
