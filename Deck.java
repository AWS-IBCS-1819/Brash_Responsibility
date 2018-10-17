//Deck.java by Rashida
//10/5/18

import java.util.*;

public class Deck { // create class

  ArrayList<Card> cards; // ArrayList of card objects - main deck
  ArrayList<Card> discard; // ArrayList of discarded cards - keep track of what is given out/ the cards that has been handed out

  public Card drawCard() { // this method draws a card
    Card c = cards.get(0);
    cards.remove (0); // remove the card from the deck
    discard.add (c); // add the removed card to the discarded pile- count as one we gave out
    return c; // the method returns a card object
  }

  public void reset () { // adds everything in discard back into the main deck
    cards.addAll (discard);
    discard.clear (); // get rid of what discard is
  }

  public void shuffle () {  // mixing up the deck of cards
    Random r = new Random (); // using a random object because shuffling is random
    ArrayList<Card> shuffled = new ArrayList<Card> ();

    int [] ar = r.ints (10000, 0, 52).distinct ().toArray (); // creates an integer Array of all of the ditinct integer giving it a integer stream
    for (int i = 0; i < 52; i++) {
      shuffled.add(cards.get(ar[i]));
    }

    cards = shuffled;

  }
   public Deck () {
    cards = new ArrayList<Card>();
    discard = new ArrayList<Card>();

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
        c.setName(num + "of" + suit);
      }
    }
  }
}
