package models;

import java.util.Scanner;

public class IfElse {
  public void ifElse() {
    
    Scanner input = new Scanner(System.in);
    input.close();
    try {
      System.out.print("Enter an integer N: ");
      int N = Integer.parseInt(input.nextLine());
      //input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
      if (N % 2 != 0) {
        System.out.println("Weird");
      }
      else if (N % 2 == 0 && N >= 2 && N <= 5) {
        System.out.println("Not weird");
      }
      else if (N % 2 == 0 && N >= 6 && N <= 20) {
        System.out.println("Weird");
      }
      else if (N % 2 == 0 && N > 20) {
        System.out.println("Not weird");
      }
    }catch (Exception e) {
      // TODO: handle exception
      input.next();
    }
  }
}
