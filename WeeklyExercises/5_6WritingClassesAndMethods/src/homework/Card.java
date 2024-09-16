package homework;


//Enum for representing card suits
enum Suit {
 SPADES, HEARTS, CLUBS, DIAMONDS
}

//Enum for representing card face values
enum FaceValue {
 ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
}

//Class representing a standard playing card
class Card {
 private Suit suit;
 private FaceValue faceValue;

 // Constructor
 public Card(Suit suit, FaceValue faceValue) {
     this.suit = suit;
     this.faceValue = faceValue;
 }

 // Getter for suit
 public Suit getSuit() {
     return suit;
 }

 // Getter for face value
 public FaceValue getFaceValue() {
     return faceValue;
 }

 // ToString method to represent the card as a string
 public String toString() {
     return faceValue + " of " + suit;
 }
}



