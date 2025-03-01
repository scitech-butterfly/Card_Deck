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
   System.out.println("2. Shuffle Deck");
   System.out.println("3. Print a Specific Card");
   System.out.println("4. Find Cards of Same Suit");
   System.out.println("5. Compare Two Cards");
   System.out.println("6. Search for a Card");
   System.out.println("7. Deal 5 Random Cards");
   System.out.println("0. Exit");
   System.out.print("Enter your choice: ");

   choice = scanner.nextInt(); // Take integer input for user choice
   scanner.nextLine(); // Consume newline character

  } while (choice != 0);
 }
}