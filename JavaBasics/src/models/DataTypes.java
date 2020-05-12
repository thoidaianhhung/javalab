package models;

import java.util.Scanner;
import java.lang.Math;

public class DataTypes {
  public void dataTypes() {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N: ");
    int t = Integer.parseInt(input.nextLine());
    for (int i = 0; i < t; i++) {
      try {
        long x = Long.parseLong(input.nextLine());
        System.out.println(x + " can be fitted in:");
        if (x >= -Math.pow(2, 7) && x <= Math.pow(2, 7) - 1) {
          System.out.println("* byte");
        }
        if (x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1) {
          System.out.println("* short");
        }
        if (x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1) {
          System.out.println("* int");
        }
        if (x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1) {
          System.out.println("* long");
        }
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(input.nextLine() + " can't be fitted anywhere.");
      }
    }
  }
}
