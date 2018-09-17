// conditions.java by Rashida
// 9/14/18
// file project

import java.util.*;
import java.io.*; // for reading files

public class proposal {

    public static void main(String[] args) {

      StringBuilder myStr = new StringBuilder(); // StringBuilder is a object

      try {
        File randtxt = new File ("proposal.txt");
        Scanner sc = new  Scanner (randtxt);

      while (sc.hasNext()); //checks to see if out file is empty
        myStr.append (sc.next());
      }

    catch (FileNotFoundException e) {
      e.printStackTrace();

    }

    System.out.println(myStr);
  }
}
