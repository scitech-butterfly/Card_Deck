// Main.java

// Name: Kashvi Singh
// PRN: 23070126057
// Batch: AIML A3

import java.util.Scanner;

class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); // Scanner to take input
  Deck deck = new Deck(); // Inititalize a new Deck
  int choice;

  // Display Menu to User
  do {
   System.out.println("\n===== Card Deck Menu =====");
   System.out.println("1. Print Deck");
   System.out.println("2. Print a Specific Card");
   System.out.println("3. Find Cards of Same Suit");
   System.out.println("4. Compare Two Cards");
   System.out.println("5. Search for a Card");
   System.out.println("6. Deal 5 Random Cards");
   System.out.println("7. Shuffle Deck");
   System.out.println("0. Exit");
   System.out.print("Enter your choice: ");

   choice = scanner.nextInt(); // Take integer input for user choice
   scanner.nextLine(); // Consume newline character

   switch (choice) {
    case 1: // Print the entire deck
     System.out.println("\n----- Printing Deck -----");
     deck.printDeck();
     break;

    case 2: // Print a specific card
     System.out.print("Enter position (1-52) of the card: ");
     int index = scanner.nextInt();
     deck.printCard(index);
     break;

    case 3: // Find a card of the same suit
     System.out.print("Enter suit (Clubs, Diamonds, Hearts, Spades): ");
     String suit = scanner.nextLine();
     deck.sameCard(suit);
     break;

    default: // Default case
     System.out.println("Invalid choice! Please enter a valid option.");
   }

  } while (choice != 0);
 }
}