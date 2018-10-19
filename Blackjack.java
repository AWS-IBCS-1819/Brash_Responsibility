// Blackjack.java by Rashida

import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;


  public Blackjack () {
    d = new Deck (); // conctructor method that creates a new deckcalls things from Deck.java
    userHand = new ArrayList<Card> ();
    compHand = new ArrayList<Card> ();

  }

  public Integer calculateHand(ArrayList<Card> h) {
  int total = 0; // defining a starting a point
    for (int i= 0; i < h.size (); i++) {
      h.get(i).getValue (); // to get the value of the card
      total = total + h.get(i).getValue ();  // getting new value of the card by adding the old total
    }
    return total;
}

public static void main (String[] args) { // main method

  Blackjack b = new Blackjack();
  b.d.reset (); // if you want to restart the game
  b.d.shuffle (); // to shuffle the deck


  b.userHand.add(b.d.drawCard ()); // adding a card to someones hand


  System.out.println ("This is Blackjack");
  System.out.println ("This is your hand:");
  System.out.println ("Your options are: \n 1.Hit (Draw Card) \n 2.Stay \n 3.Quit");
  System.out.println ("value:");

    for (int i = 0; i < 10; i++) {
      Card c = b.d.drawCard ();
      b.userHand.add(c);
    }
    for (int i = 0; i < b.userHand.size (); i++) {
      System.out.println (b.userHand.get(i).getName());
    }
  }

}
