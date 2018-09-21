// Gradebook.java by Rashida and Julia
// 9-19-18

import java.util.*;
import java.io.*;

public class gradebook {

  public static void main(String [] args) {

    System.out.println ("Welcome to the Student Gradebook, what would you like to see");
    System.out.println ("1. Mean Grade");
    System.out.println ("2. Median Grade");
    System.out.println ("3. Top Grade");
    System.out.println ("4. Lowest Grade");
    System.out.println ("5. Class Subject and Teacher");
    System.out.println ("6. Student Roster");


  StringBuilder myStr = new StringBuilder();

  String userIn = newIn.nextline ();
  if (userIn.equals ("1")) {
    System.out.println ("The mean grade was" + );
  }
  if (userIn.equals ("2")) {
    Sytem.out.println ("The median grade was" + );
  }
  if (userIn.equals ("3")) {
    System.out.println ("The top grade was" + );
  }
  if (userIn.equals ("4")) {
    System.out.println ("The lowest grade was" + );
  }
  if (userIn.equals ("5")) {
    System.out.println ("The class subject and teacher was" + )
  }
  if (userIn.equals ("6")) {
    System.out.println ("The student roster was" + )
  }

    try {
      File Grade = new File ("grades.txt");
      Scanner sc = new  Scanner (grades);

    while (sc.hasNext());
      Str1.append (sc.names());
      Str2.next (sc.grades());

      catch (FileNotFoundException e) {
        e.printStackTrace ();
      }
    }
  }
  

  /*  public static double mean (double [] m) {
      double sum = 0;
      for (int i = 0; i < m. length; i++) {
        sum += m [i];
      }
      return sum / m.length;
    } */

  }
}
