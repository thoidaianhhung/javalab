package main;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayArrayList {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    System.out.print("Enter n: ");
    int n = Integer.parseInt(in.nextLine());
    for (int i = 0; i < n; i++) {
      list.add(i, in.nextLine());
    }
    for (String string : list) {
      System.out.print(String.format("%-15s", string));
    }
  }
}
