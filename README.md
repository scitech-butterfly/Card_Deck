# Card_Deck

## Description

<p>This is a menu-driven Java program that demonstrates object-oriented programming (OOP) concepts such as classes, constructors, ArrayList, and instance members. The program simulates a deck of 52 playing cards and allows users to perform various operations like creating, shuffling, searching, and dealing cards.</p>

## Features
<ol>
<li>Create a deck of 52 standard playing cards</li>

<li>Display all cards in the deck</li>

<li>Shuffle the deck randomly</li>

<li>Search for a specific card (by rank and suit)</li>

<li>Find all cards of the same suit</li>

<li>Compare two cards to check if they have the same rank</li>

<li>Deal 5 random cards from the deck</li>

<li>Menu-driven using switch-case</li>
</ol>

## How to Run
<ol>
<li>git clone https://github.com/scitech-butterfly/Card-Deck.git</li>

<li>cd Card_Deck</li>

<li><p>javac Main.java</p>
<p>java Main</p></li>
</ol>

## Methods and Functionalities

<ol>
<li>Card.java (Defines Card Class)</li>

This class represents a playing card with attributes rank and suit. It includes a constructor and a method to display card details.

<li>Deck.java (Deck Operations - CRUD)</li>

This class manages the deck of 52 playing cards using an ArrayList and provides methods for various operations.

Method Description:
<ol>
  <li> createDeck(): To create a deck of 52 cards.</li>
  <li> printDeck(): To print the entire deck created.</li>
  <li> printCard(index): To print a given card at a particular index.</li>
  <li> compareCards(): To compare 2 cards by their ranks and suits.</li>
  <li> sameCards(): To find all cards in the deck that belong to the same suit entered by the user.</li>
  <li> findCard(): To search for a card by its rank and suit.</li>
  <li> dealCard(): To randomly select 5 cards from the deck.</li>
  <li> shuffleDeck(): To shuffle the deck to rearrange the order of its members.</li>
</ol> <p></p>

<li>Main.java (Menu-Driven Program)</li>

This class serves as the entry point for the program, providing a menu for users to interact with. It calls methods from Deck.java based on user input.
 </ol>


