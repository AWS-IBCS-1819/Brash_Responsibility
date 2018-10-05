//Deck.java by Rashida
//10/5/18

import java.util.*;

public class Deck {

  ArrayList<String> card;

  public Deck(){
    card = new ArrayList<String>();

    for (int i = 1; i< 14; i++){
      String num = Integer.toString(i);
      card.add(" of Diamonds");
      }

    for (int j = 14; j < 27; j++){
      String num= Integer.toString (j);
      card.add(" of Clubs");
    }

    for (int k= 27; k < 40; k++){
      String num = Integer.toString (k);
      card.add(" of Hearts");
    }

    for (int l = 40; l < 53; l++){
      String num = Integer.toString (l);
      card.add(" of Spades");
    }
  }
}
