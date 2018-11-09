//Zoo.java by Julia and Rashida

import java.util.*;

 public class Zoo{

   public static void main(String[] args) {

    Animal k = new Animal();
      k.setName("Monkey");
      k.setType("Forest");
      k.setTemp(85);

    Animal l = new Animal();
      l.setName("Lion");
      l.setType("Jungle");
      l.setTemp(91);

    Map<String,String> m = new HashMap<String, String>(); //animal, enclosure
    m.put(k.getName (), k.getType);
    m.put(l.getName (), l.getType);

  //  Map<String,Integer> f = new HashMap<String, Integer>(); //animal, temperature

     System.out.println("Welcome to the zoo!");
     System.out.println("Which animal would you like to know about?");
     System.out.println("Monkeys or lions?");

     Scanner In = new Scanner (Sytsem.in);
     String answer = In.nextLine ();
   }
}
