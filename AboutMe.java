//AboutMe.java by Rashida
// 9-12-18

import java.util.*;

public class AboutMe{

  public String color;// creation of the static variable
  public static String hand; // right/left hand
  public static String subject;// this means favorite subject
  public String interest; // as in interest that you have but others may find it boring
  public static String birthplace;
  public static Integer siblings; // as in how many
  public static String time; // as in morning/night person


public AboutMe() {
  color = "blue"; // assign the name to the static variable
  hand = "right";
  subject = "math";
  interest = "banjo";
  birthplace = "Vermont";
  siblings = 4;
  time = "morning";
}

public static void main ( String [] args){

  AboutMe Anna = new AboutMe(); // call constructor method

    System.out.println ("You will learn about Anna"); // a greeting
    System.out.println ("Anna's favorite color is " + Anna.color);
    System.out.println ("Anna is " + Anna.hand);
    System.out.println ("Anna's favorite color is " + Anna.subject);
    System.out.println ("Anna's interest is " + Anna.interest);
    System.out.println ("Anna was born in " + Anna.birthplace);
    System.out.println ("Anna has " + Anna.siblings);
    System.out.println ("Anna is a " + Anna.time);

    Scanner colorInp = new Scanner(System.in); //scanner for mutable variable
      String colorIn = colorInp.next();
      if (colorIn.equals("a")) {
        System.out.println(Anna.color);
      }
      else if (colorIn.equals("b")) {
        System.out.println(" Yellow for the Sun");
      }
    Scanner interestInp = new Scanner(System.in); // scanner for mutable variable
     String interestIn = interestInp.next ();
     if (interestIn.equals("a")) {
       System.out.println(Anna.interest);
     }
     else if (interestIn.equals("b")) {
       System.out.println (" riding a bike");
     }
 }



}
