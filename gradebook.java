// Gradebook.java by Rashida and Julia
// 9-19-18
import java.util.*;
import java.io.*;

public class gradebook {

  public static void main(String [] args) { //main method

    System.out.println ("Welcome to the Student Gradebook, what would you like to see");
    System.out.println ("1. Mean Grade");
    System.out.println ("2. Grade Spread");
    System.out.println ("3. Top Grade");
    System.out.println ("4. Lowest Grade");
    System.out.println ("5. Class Subject and Teacher");
    System.out.println ("6. Student Roster");
    System.out.println("7. Quit");

  StringBuilder myStr = new StringBuilder();
  Scanner In = new Scanner(System.in); //scan user input
  String userIn = newIn.nextLine ();

  if (userIn.equals ("1")) {
    System.out.println ("The mean grade was");
  }
  else if (userIn.equals ("2")) {
    Sytem.out.println ("The median grade was");
  }
  else if (userIn.equals ("3")) {
    System.out.println ("The top grade was");
  }
  else if (userIn.equals ("4")) {
    System.out.println ("The lowest grade was");
  }
  else if (userIn.equals ("5")) {
    System.out.println ("The class subject and teacher was");
  }
  else if (userIn.equals ("6")) {
    System.out.println ("The student roster was");
  }
  else if (userIn2.equals("7")){
    System.exit(0);
  }
  else{
    System.out.println("this is not one of the option, choose again(from 1 to 6)");
    Scanner In1 = new Scanner (System.in);
    String userIn2 = newIn1.nextLine();
    System.out.println("or do you want to quit?(enter 7)");
}
  if (userIn2.equals ("1")) {
    System.out.println ("The mean grade was");
  }
  else if (userIn2.equals ("2")) {
    Sytem.out.println ("The median grade was");
  }
  else if (userIn2.equals ("3")) {
    System.out.println ("The top grade was");
  }
  else if (userIn2.equals ("4")) {
    System.out.println ("The lowest grade was");
  }
  else if (userIn2.equals ("5")) {
    System.out.println ("The class subject and teacher was");
  }
  else if (userIn2.equals ("6")) {
    System.out.println ("The student roster was");
  }
  else if (userIn2.equals("7")){
    System.exit(0);
  }
  else {
    System.out.println("Stop typing nonsense and bother the system. Try again later!");
    System.exit(0);
  }


  //break up the stringbuilder into name and Number



    try { //see if our text is empty
      File Grade = new File ("grades.txt");
      Scanner sc = new  Scanner (grades);

    while (sc.hasNext()); {
      myStr.append (sc.next() + " ");
    }
  }
    catch (FileNotFoundException e) {
      e.printStackTrace ();
}

  }
}
