package homework;

import java.util.Random;

public class CardDealer {
	 // Method to deal five random cards
	 public static void dealCards() {
	     // Array of all possible suits
	     Suit[] suits = Suit.values();

	     // Array of all possible face values
	     FaceValue[] faceValues = FaceValue.values();

	     // Creating a Random object to generate random indices
	     Random random = new Random();

	     // Deal five random cards
	     System.out.println("Dealing five random cards:");
	     for (int i = 0; i < 5; i++) {
	         // Generate random indices for suit and face value
	         int suitIndex = random.nextInt(suits.length);
	         int faceValueIndex = random.nextInt(faceValues.length);

	         // Create a card with the randomly selected suit and face value
	         Card card = new Card(suits[suitIndex], faceValues[faceValueIndex]);

	         // Print the dealt card
	         System.out.println("Card " + (i + 1) + ": " + card);
	     }
	 }

	 public static void main(String[] args) {
	     // Deal five random cards
	     dealCards();
	 }
	}
