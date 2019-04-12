import java.util.*;
import java.io.*;

public class HashTest {

  public static void main(String[] args) {

  ArrayList<Integer> numbers = new ArrayList <Integer>();// a create an ArrayList
  numbers.add(5); // add numbers
  numbers.add(2);
  numbers.add(9);
  numbers.add(6);
  numbers.add(3);

  Collections.shuffle(numbers); // this is to shuffle the array of numbers

  System.out.println("The first set is" + numbers);

  int num1 = numbers.get(0); // get whatever the first number is

  if (num1 < 4) { // if the first number is less than 4 the do a * b
    int a = 12 - numbers.get(0);
    int b = 13;
    int c = a * b;

    numbers.set(0,c);

  }

  if (num1 > 4) {
    int a1 = 24 * numbers.get(2);
    int b2 = 93 / numbers.get(3);
    int c3 = a1 + b2;

    numbers.set(0,c3);
  }

  int num2 = numbers.get(1);

  if (num2 < 7) {
    int d = 3;
    int e = 7;
    int f = d * e;

    numbers.set(1,f);

  }

  if (num2 > 7) { // if change what the number is greater or less than to make the output evenmore random
    int d1 = 5 + numbers.get(4);
    int e2 = 20 - numbers.get(2);
    int f3 = d1 + e2;

    numbers.set(1,f3);
  }

  int num3 = numbers.get(2);

  if (num3 < 3) {
    int g = 78/ numbers.get(1);
    int h = 31 + numbers.get(4);
    int j = g + h;

    numbers.set(2,j);

  }

  if (num3 > 3) {
    int g1 = 9 + numbers.get(3);
    int h2 = 60 - numbers.get(0);
    int j3 = g1 + h2;

    numbers.set(2,j3);
  }

  int num4 = numbers.get(3);

  if (num4 < 6) {
    int k = 82 * numbers.get(2);
    int m = 4 + numbers.get(0);
    int n = k + m;

    numbers.set(3,n);

  }

  if (num4 > 6) {
    int k1 = 6;
    int m2 = 17 * numbers.get(0);
    int n3 = k1 + m2;

    numbers.set(3,n3);
  }

  int num5 = numbers.get(4);

  if (num5 < 8) {
    int o = 2 - numbers.get(4);
    int p = 97 - numbers.get(3);
    int q = o * p;

    numbers.set(4,q);

  }

  if (num5 > 8) {
    int o1 = 9 * numbers.get(3);
    int p2 = 75;
    int q3 = o1 + p2;

    numbers.set(4,q3);
  }

  System.out.println("The new code is" + numbers);
  System.out.println("Do java HashTest over and over for the numbers the shuffle");



 }
}
