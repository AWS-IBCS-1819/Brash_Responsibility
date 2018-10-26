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

    for (int i = 0; i < 2; i++) {
        Card c = b.d.drawCard ();
          b.userHand.add(c);
        System.out.println ("This is your hand:" );
        System.out.println ("Value:");
      }
      return userHand;

    for (int i = 0; i < 1; i++) {
        Card c = b.d.drawCard ();
          b.compHand.add(c);
          System.out.println ("This is the dealer's hand: " );
          System.out.println ("Value:");
        }
        return compHand;
  }

  public Integer calculateHand(ArrayList<Card> hand) {
    int x = 0; // defining a starting a point
      for (int i= 0; i < hand.size (); i++) {
        hand.get(i).getValue (); // to get the value of the card
        x = x + hand.get(i).getValue ();  // getting new value of the card by adding the old total
        if (hand.get(i).getValue()>10) {

        }
    }
    return x;

/* public String Nameofcards (ArrayList<Card> h) {
  String name = 0;
  for ()
  h.get(i).getName ();
}
return name;*/
}


public static void main (String[] args) {

  Blackjack b = new Blackjack();
    b.d.reset (); // if you want to restart the game
    b.d.shuffle (); // to shuffle the deck


System.out.println ("You are Playing Blackjack");

  boolean playgame = true; // have something to run the while loog for running the whole program

    while (playgame) {
      System.out.println ("Your options are: \n 1.Hit (Draw Card) \n 2.Stay \n 3.Quit");
        Scanner option = new Scanner(System.in);
        int choice = Integer.valueOf (option.nextLine ());

    if (choice == 1) {
      b.d.drawCard(b.userHand); // choosing to hit adding another card to your card values
        System.out.println ("This is your hand:");
        for (int i = 0; i < b.userHand.size (); i++) {
        System.out.println (b.userHand.get(i).getName());
        b.userHand.add(b.d.drawCard ()); // adding a card to someones hand
        System.out.println ("value:");
        int value = b.calculateHand (b.userHand);

      if (b.userHand == 21) {
        System.out.println ("YOU WIN!");
        break;
      }
      else if (b.userHand > 21) {
        System.out.println ("You lose");
        break;
      }

     }
  }
    else if (choice == 2) { //choosing to stay where you are with your card value
      System.out.println ("This is the Dealers:");
      int value  = b.calculateHand (b.compHand);
        b.cardNames(b.compHand.get(i));

      while (b.d.calculateHand(b.compHand) <=16) { // the value is less than 16 computer can draw card
        b.d.drawCard(comphand);
    }
  }

      if  (b.d.calculateHand(b.compHand) > 21) { // if the dealer hand is higher than 21 then you win
        System.out.println ("Bust \n You Win");
      }
      else if (b.d.calculateHand(b.compHand)==21) {
      System.out.println ("Dealer wins,You Lose");

      }

    if (choice == 3){ //choosing to quit the game
      System.out.println ("Do you want to Play again ? \n 1.Yes \n 2.No");
        break;
    }
    else if (choice == 1) { //choosing to play again

    }
    else if (choice == 2){ // choosing to not play another game

      }
      }
      }
    }
