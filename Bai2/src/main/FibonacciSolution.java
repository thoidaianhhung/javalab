package main;

public class FibonacciSolution {
  public static void main(String[] args) {
    int num1 = 0;
    int num2 = 1;
    for (int i = 1; i < 13; i++) {
      System.out.print(num2 + " ");
      int result = num1 + num2;
      num1 = num2;
      num2 = result;
    }
   
  }
}
