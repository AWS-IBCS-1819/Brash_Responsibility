//Pokerhan.java by Rashida

import java.util.*;

public class Pokerhand {

  public Deck shuffle(Deck d){
      return d;
    }

    public static void main(String[] args) {
      Deck d = new Deck();

      Random r = new Random(); //<-- this is to create a new object; constructor method
      int[] ar = r.ints(6300, 0, 52).distinct().toArray();//can't just print array
      for (int i = 0; i < ar.length; i ++){//loop is to help print contents of array
        //System.out.println(ar[i]);
        System.out.println(d.cards.get(ar[i]));
      }



}

}
