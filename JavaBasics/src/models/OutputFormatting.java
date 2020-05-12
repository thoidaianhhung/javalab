package models;

import java.util.Scanner;

public class OutputFormatting {
  public void output() {
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("====================");
      for (int i = 0; i < 3; i++) {
        String s1 = input.nextLine();
        int x = Integer.parseInt(input.nextLine());
        System.out.printf("%-15s%03d%n", s1, x);
      }
      System.out.println("====================");
    }
    
  }
}
