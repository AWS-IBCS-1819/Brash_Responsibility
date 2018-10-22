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

// public cardName (ArrayList<Card> h);

public static void main (String[] args) { // main method

  Blackjack b = new Blackjack();
  b.d.reset (); // if you want to restart the game
  b.d.shuffle (); // to shuffle the deck


  System.out.println ("You are Playing Blackjack");

  boolean playgame = true; // have something to run the while for running the whole program

    while (playgame) {
      System.out.println ("Your options are: \n 1.Hit (Draw Card) \n 2.Stay \n 3.Quit");
        Scanner option = new Scanner(System.in);
    int choice = Integer.valueOf (option.nextLine ());

    if (choice == 1) {
      b.d.drawCard(b.userHand); // choosing to hit adding another card to your card values
      System.out.println ("This is your hand:");
        b.userHand.add(b.d.drawCard ()); // adding a card to someones hand
      System.out.println ("value:");
         = b.calculateHand (b.userHand);

    }
    else if (choice == 2) { //choosing to stay where you are with your card value
    break; // exits the while loop
    }
    else if (choice == 3){ //choosing to quit the game
      System.out.println ("Do You want to Play again ? \n 1.Yes \n 2.No");
      break;
    }
    if (choice == 1) { //choosing to play again

    }
    else if (choice == 2){ // choosing to not play another game

      }
    }
    if (b.d.calculateHand(b.compHand) <=16) { // the value is less than 16 computer can draw card
      b.d.drawCard(comphand);
    }

    for (int i = 0; i < 10; i++) {
      Card c = b.d.drawCard ();
      b.userHand.add(c);
    }
    for (int i = 0; i < b.userHand.size (); i++) {
      System.out.println (b.userHand.get(i).getName());
    }

  }
}
