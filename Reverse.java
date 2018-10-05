// Reverse.java by Rashida


import java.io.*;
import java.util.*;

public class Reverse {

  // the recursive
    public static void main (string [] args) {

      System.out.println ("Hello");

      Scanner scan = new Scanner (System.in);
      String str = scan.nextLine();
      String Hello = Reverse (str);
    }

    public static String Reverse (String str) {

      if (str.length () <=1)
        return str;
      }
      else{
        return (Reverse (str.substring (1)) + str.charAt (0));
      }
  // the loop
    public static void main(String [] args) {

      Scanner scan = new Scanner(Sytem.in);
      String Hello = scan.nextLine();
      for (int i = Hello.length ()-1; i>0; i--)
      System.out.print(Hello.charAt(i));
    }

}
