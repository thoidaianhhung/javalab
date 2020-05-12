package models;

import java.util.Scanner;

public class StdinAndStdout {
  public void scanner() {
    @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
    try {
      System.out.print("Enter a ");
      int a = Integer.parseInt(input.nextLine());
      System.out.print("Enter b ");
      int b = Integer.parseInt(input.nextLine());
      System.out.print("Enter c ");
      int c = Integer.parseInt(input.nextLine());
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
    }
    catch (Exception e) {
      // TODO: handle exception
      System.out.println("Please enter an integer.");
      input .nextLine();
    }
  }
}
