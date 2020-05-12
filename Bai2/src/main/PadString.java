package main;

import java.util.Scanner;

public class PadString {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    String string = in.next();
    int number = in.nextInt();
    int length = string.length();
    for (int i = 0; i < number - length; i++) {
      string = " " + string;
    }
    System.out.println(string);
  }
}
