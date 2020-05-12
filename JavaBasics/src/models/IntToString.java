package models;

import java.util.Scanner;

public class IntToString {
  public void forbidExit() {
    try {
      Scanner input = new Scanner(System.in);
      int n = Integer.parseInt(input.nextLine());
      input.close();
      String s = Integer.toString(n);
      if (n == Integer.parseInt(s)) {
        System.out.println("Good job");
      } else {
        System.out.println("Wrong answer");
      }
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("Unsuccessful Termination");
    }
  }
}
