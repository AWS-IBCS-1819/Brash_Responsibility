//


public class Fibonacci {

  public static int Fibonacci (int n) {
    if (n == 1) {
      return 1;
    }
    else if  (n == 2){
    return 1;
  }
      else {
      return n- 1 + Fibonacci (n-2);
    }
    
  }
  public static void main (String [] args) {

    int numberinsequence = 8;
    int number = Fibonacci(numberinsequence);
    System.out.println (number);
  }
}
