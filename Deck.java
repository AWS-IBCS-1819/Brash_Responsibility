//Deck.java 
//10/5/18

import java.util.*;

public class Deck {

  ArrayList<Card> cards;

  public Deck() {
    cards = new ArrayList<Card>();

    for (int i = 1; i <= 13; i++) {
      for (int j = 1; j <= 4; j++) {
        String num;
        String suit;
        if (i == 11) {
          num = "Jack";
        }
        else if (i == 12) {
          num = "Queen";
        }
        else if (i == 13) {
          num = "King";
        }
        else if (i == 1) {
          num = "Ace";
        }
        else {
          num = Integer.toString(i);
        }
        if (j == 1) {
          suit = "Diamonds";
        }
        else if (j == 2) {
          suit = "Clubs";
        }
        else if (j == 3) {
          suit = "Hearts";
        }
        else {
          suit = "Spades";
        }
        Card c = new Card ();
        cards.add(c);
        c.setValue(i);
        cards.setName(num + "of" + suit);
      }
    }
  }
