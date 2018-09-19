// Pinata.java by Rashida
//9-18-18

import java.util.*;

public class Pinata {

  public static String mood;
  public static String want;
  public static String need;

  public Pinata() {
   mood = "fine"; // as in I'm fine
   want = "vacation"; // as in I want a break from school badly
   need = "time"; // as in I need more time to do all of this work I keep getting assigned
 }

 public static void main ( String [] args){

 Pinata me = new Pinata (); // call constructor method

  System.out.println (" This is suppose to be about whatever a pinata is");
  System.out.println (" My mood right now is " + me.mood);
  System.out.println (" What do I want" + me.want);
  System.out.println (" What do I need" + me.need);

  }
}
