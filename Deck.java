// Deck.java

import java.util.ArrayList;

class Deck {
 // Create an ArrayList of "Card" type called deck
 ArrayList<Card> deck;

 // Method to create a new ArrayList
 public Deck() {
  this.deck = new ArrayList<>();
 }

 // Method to create a deck
 public void createDeck() {
  String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
  String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

  for (String rank : ranks) {
   for (String suit : suits) {
    deck.add(new Card(rank, suit));
   }
  }
 }

 // Method to print a deck
 public void printDeck() {
  for (Card card : deck) {
   System.out.println(card);
  }
 }

 // Print a single card from the deck using position
 public void printCard(int index) {
  if (index >= 1 && index <= deck.size()) {
   System.out.println(deck.get(index - 1));
  } else {
   System.out.println("Invalid index! Please choose between 1 and " + (deck.size()));
  }
 }

}