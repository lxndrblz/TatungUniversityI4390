/*
 * Redo the exercise (1). In this exercise, a printDeck method is designed to print out
 * the cards in the deck. This method uses an iterator to step through the deck of cards.
 * An iterator is an object of CardIterator class. The CardIterator class implements an
 * interface called GameCardIterator, which extends the interface in
 * java.util.Iterator<T>. The CardIterator class should be an inner class of the
 * DeckOfCard class. Design a main method to shuffle the cards and then use the printDeck
 * method to print out the cards in the deck.
 * Hint: this exercise is similar to the DataStructure class discussed in the example of
 * inner class.
 */

import java.util.ArrayList;
import java.util.Collections;

public class DeckOfCardIterator {
	private final static int SIZE = 52;
	
	// Interface Definition for GameCardIterator
	interface GameCardIterator extends java.util.Iterator<Card> {

		Card last();
	}

	// ArrayList for storing all the cards of the deck
	private ArrayList<Card> deck = new ArrayList<Card>(SIZE);

	// Default constructor instantiates a whole deck of cards when called
	public DeckOfCardIterator() {
		for (Card.Face face : Card.Face.values()) {
			for (Card.Suit suit : Card.Suit.values()) {
				// instantiate new card and add to deck
				Card c = new Card(face, suit);
				deck.add(c);
			}
		}
	}

	// Implementation of interface
	protected class CardIterator implements GameCardIterator {
		// Start stepping through the array from the top
		private int nextIndex = 0;

		public boolean hasNext() {
			// Check if the current element is the last in the array
			return (nextIndex <= deck.size() - 1);
		}

		public Card next() {
			// Avoid out of index problems
			if (hasNext()) {
				Card retValue = deck.get(nextIndex);
				// Get the next even element
				nextIndex += 1;
				return retValue;
			}
			return null;
		}
		public Card last() {
			// Avoid out of index problems
			if (hasNext()) {
				Card retValue = deck.get(deck.size() -1);
				// Get the next even element
				nextIndex += 1;
				return retValue;
			}
			return null;
		}

	}

	protected static class Card {
		private Face face = Face.Ace;
		private Suit suit = Suit.Clubs;

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
		GameCardIterator iterator = this.new CardIterator();
		Card card = null;
		// make sure there are still cards left
		if (iterator.hasNext()) {
			card = iterator.last();
			deck.remove(card);
		}
		return card;
	}

	// Prints all existing cards in the deck
	public void printDeck() {
		GameCardIterator iterator = this.new CardIterator();
		System.out.format("Cards in stack: %d \n", deck.size());
		// Print out values of even indices of the array
		while (iterator.hasNext()) {
			iterator.next().print_face_suit();
		}

	}
}
