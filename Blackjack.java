// Blackjack.java by Rashida

import java.util.*;

public class Blackjack {

  Deck d;
    ArrayList<Card> userHand;
    ArrayList<Card> compHand;


  public Blackjack () {
    d = new Deck (); // conctructor method
      userHand = new ArrayList<Card> ();
      compHand = new ArrayList<Card> ();
  }

  public Integer calculateHand(ArrayList<Card> hand) {
    int x = 0; // defining a starting a point
      for (int i = 0; i < hand.size (); i++) {
        hand.get(i).getValue (); // to get the value of the card

        if (hand.get(i).getValue()== 11) {
            x = x + 10; // Jack
          }
          else if (hand.get(i).getValue()== 12) {
            x = x + 10; // King
          }
          else if (hand.get(i).getValue()== 13) {
            x = x + 10; // Queen
          }
          else if (hand.get(i).getValue()== 1) {
            x = x + 11; // Ace
          }
          else {
            x = x + hand.get(i).getValue (); //
          }

    }
    return x;
  }

 public String cardNames (ArrayList<Card> hand) {
  String cardname = "";
  for (int i = 0; i < hand.size (); i++) {
  cardname = cardname + hand.get(i).getName()+ " ";
  }
  return cardname;
  }

public static void main (String[] args) {

  Blackjack b = new Blackjack();
  while (true) {
    b.d.reset (); // if you want to restart the game
    b.d.shuffle (); // to shuffle the deck
    b.userHand.clear (); // to make sure that the data in the game before is cleared
    b.compHand.clear (); // to make sure that the data in the game before is cleared

System.out.println ("You are playing Blackjack");
// for userHand
for (int i = 0; i < 2; i++) {
    Card c = b.d.drawCard ();
      b.userHand.add(c);
  }
  System.out.print ("\nThis is your hand: " );
  System.out.println(b.cardNames(b.userHand));

  System.out.print ("Value: ");
  System.out.println(b.calculateHand (b.userHand)); //calculate userHand to show user value

  if (b.calculateHand (b.userHand) > 21) {
    System.out.println ("\nYou lose");
    break;
  }

// for compHand
for (int i = 0; i < 2; i++) {
    Card c = b.d.drawCard ();
      b.compHand.add(c);
    }
    System.out.print ("\nThis is the dealer's hand: " );
    System.out.println (b.compHand.get(1).getName ());
    int value = b.calculateHand (b.compHand); // calculate compHand to show the dealers value

  boolean playgame = true; // have something to run the while loog for running the whole program

    while (playgame) {
      System.out.println ("\nYour options are: \n 1.Hit (Draw Card) \n 2.Stay \n 3.Quit");
        Scanner option = new Scanner(System.in); // scanner for reading through the options of hit, stay, or quit
        int choice = Integer.valueOf (option.nextLine ());

    if (choice == 1) {

        b.userHand.add(b.d.drawCard ()); // choosing to hit adding another card to your card values
        for (int i = 0; i < b.userHand.size (); i++) {
        System.out.println ("\nYour hand: ");
        System.out.println(b.cardNames(b.userHand));
        System.out.print ("Value: ");
        System.out.println(b.calculateHand (b.userHand)); //calculate userHand to show user value
        System.out.println (b.userHand.get(b.userHand.size()-1).getName()); // shows the newest card

      if (b.calculateHand (b.userHand) == 21) { // if your hand equals 21 then you win
        System.out.println ("\nYOU WIN!");
        break;
      }
      else if (b.calculateHand (b.userHand) > 21) { // if your hand is greater than 21 then you lose
        System.out.println ("\nYou lose");
        break;
      }

     }
  }
    else if (choice == 2) { //choosing to stay where you are with your card value

      System.out.println ("\nThis is the Dealers hand:");
      for (int i = 0; i < b.compHand.size(); i++) {
      System.out.println (b.compHand.get(i).getName());
     }
      System.out.print ("Value: ");
      System.out.println(b.calculateHand (b.userHand)); //calculate userHand to show user value

      while (b.calculateHand(b.compHand) <=16) { // the value is less than 16 computer can draw card
        b.compHand.add(b.d.drawCard ());

    }

  }
      if  (b.calculateHand(b.compHand) > 21) { // if the dealer hand is higher than 21 then you win
        System.out.println ("Bust \n You Win");
      }

          else if (b.calculateHand(b.compHand) > b.calculateHand(b.userHand)){
                System.out.println("You lose, Dealer wins");
              }
      else if (b.calculateHand(b.compHand)==21) { // if the dealers cards equals 21 and yours doesn't then the dealer wins
      System.out.println ("Dealer wins,You Lose");
break;
      }

    if (choice == 3){ //choosing to quit the game
      System.out.println ("\nDo you want to Play again ? \n 1.Yes \n 2.No");
        System.exit(0);
    }
}
    Scanner option1 = new Scanner (System.in); // scanner for making choices for playing again or not
      int chosen = Integer.valueOf (option1.nextLine ());

   if (chosen == 1) { //choosing to play again
  }

  else if (chosen == 2){ // choosing to not play another game
      System.out.println ("Goodbye");
      break; // if you choose to not play again then you don't need to do anything else
      }


  } // the while for everything
  } // main method
  } // blackjack class
