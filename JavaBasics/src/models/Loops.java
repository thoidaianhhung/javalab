package models;

import java.util.Scanner;

public class Loops {
  public void loops() {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter N: ");
      int N = Integer.parseInt(input.nextLine());
      int result = 0;
      for (int i = 1; i < 11; i++) {
        result = i * N;
        System.out.println(N + " x " + i + " = " + result);
      }
    }
  }
}
