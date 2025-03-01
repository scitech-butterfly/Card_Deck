// Main.java

// Name: Kashvi Singh
// PRN: 23070126057
// Batch: AIML A3

import java.util.*;

class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); // Scanner to take input
  Deck deck = new Deck(); // Inititalize a new Deck
  int choice;

  // Display Menu to User
  while (true) {
   System.out.println("\n===== Card Deck Menu =====");
   System.out.println("1. Create Deck");
   System.out.println("2. Print Deck");
   System.out.println("3. Print a Specific Card");
   System.out.println("4. Find Cards of Same Suit");
   System.out.println("5. Compare Two Cards");
   System.out.println("6. Search for a Card");
   System.out.println("7. Deal 5 Random Cards");
   System.out.println("8. Shuffle Deck");
   System.out.println("0. Exit");
   System.out.print("Enter your choice: ");

   choice = scanner.nextInt(); // Take integer input for user choice
   scanner.nextLine(); // Consume newline character

   // Exit the program if choice is 0
   if (choice == 0) {
    System.out.println("Exiting the program...");
    break;
   }

   switch (choice) {
    case 1:
     System.out.println("\n-----Creating Deck-----");
     deck.createDeck();
     break;

    case 2: // Print the entire deck
     System.out.println("----- Printing Deck -----");
     deck.printDeck();
     break;

    case 3: // Print a specific card
     System.out.print("Enter position (1-52) of the card: ");
     int index = scanner.nextInt();
     deck.printCard(index);
     break;

    case 4: // Find a card of the same suit
     System.out.print("Enter suit (Clubs, Diamonds, Hearts, Spades): ");
     String suit = scanner.nextLine();
     deck.sameCard(suit);
     break;

    case 5: // To compare 2 cards by rank and suit
     System.out.print("Enter first card rank: ");
     String rank1 = scanner.nextLine();
     System.out.print("Enter first card suit: ");
     String suit1 = scanner.nextLine();
     System.out.print("Enter second card rank: ");
     String rank2 = scanner.nextLine();
     System.out.print("Enter second card suit: ");
     String suit2 = scanner.nextLine();

     Card card1 = new Card(rank1, suit1);
     Card card2 = new Card(rank2, suit2);
     deck.compareCard(card1, card2);
     break;

    case 6: // Find a card using rank and suit
     System.out.print("Enter rank of card to search: ");
     String searchRank = scanner.nextLine();
     System.out.print("Enter suit of card to search: ");
     String searchSuit = scanner.nextLine();
     deck.findCard(searchRank, searchSuit);
     break;

    case 7: // To deal 5 random cards
     deck.dealCard();
     break;

    case 8: // To shuffle the deck
     System.out.println("\n----- Shuffling Deck -----");
     deck.shuffleDeck();
     break;

    default: // Default case
     System.out.println("Invalid choice! Please enter a valid option.");
   }

  }

  scanner.close();
 }
}