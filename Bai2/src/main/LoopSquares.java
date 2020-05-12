package main;

public class LoopSquares {
  public static void main(String[] args) {
    int a = 1;
    for (int i = 3; i <= 21; i += 2) {
      System.out.print(a + " ");
      a += i;
    }
  }
}
