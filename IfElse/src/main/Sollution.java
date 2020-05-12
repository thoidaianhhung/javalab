package main;

import java.util.Scanner;

public class Sollution {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Enter N");
    int n = in.nextInt();
    
    
    if (name(n)) {
      System.out.println("Là số nguyển tố");
    } else {
      System.out.println("Không phải số nguyển tố");
    }
  }
  public static boolean name(int n) {
    if (n < 2) {
      return false;
    }
    int k = (int) Math.sqrt(n);
    for (int i = 2; i <= k; i++) {
      if (n % i == 0) {
        return false;
      }
      
    }
    return true;
  }
}
