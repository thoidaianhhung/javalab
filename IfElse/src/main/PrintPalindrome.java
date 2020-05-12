package main;

import java.util.Scanner;

public class PrintPalindrome {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Type one or more words: ");
    String w = in.nextLine();
    System.out.println();
    boolean p = true;
    int length = w.length();
    for (int i = 0; i < length; i++) {
      if (Character.toLowerCase(w.charAt(i)) != Character.toLowerCase(w.charAt(length - i - 1))) {
        p = false;
      }
    }
    if (p) {
      System.out.println("True");
    }
    else {
      System.out.println("False");
    }
    
  }
}
