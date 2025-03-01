// Deck.java

import java.util.ArrayList;
import java.util.Collections;

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
   System.out.println("Invalid position! Please choose between 1 and " + (deck.size()));
  }
 }

 // Find cards of the same suit
 public void sameCard(String suit) {
  System.out.println("Cards with suit " + suit + ":");
  for (Card card : deck) {
   if (card.suit.equalsIgnoreCase(suit)) {
    System.out.println(card);
   }
  }
 }

 // Compare two cards if they have the same rank
 public void compareCard(Card card1, Card card2) {
  if (card1.rank.equals(card2.rank)) {
   System.out.println("Both cards have the same rank: " + card1.rank);
  } else {
   System.out.println("The cards have different ranks.");
  }
 }

 // Search for a specific card
 public boolean findCard(String rank, String suit) {
  for (Card card : deck) {
   if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
    System.out.println("Card found: " + card);
    return true;
   }
  }
  System.out.println("Card not found!");
  return false;
 }

 // Deal 5 random cards from the deck
 public void dealCard() {
  System.out.println("Dealing 5 random cards:");
  Collections.shuffle(deck);
  for (int i = 0; i < 5 && !deck.isEmpty(); i++) {
   System.out.println(deck.remove(0)); // Remove and print
  }
 }

 // Method to shuffle the deck
 public void shuffleDeck() {
  Collections.shuffle(deck);
 }
}