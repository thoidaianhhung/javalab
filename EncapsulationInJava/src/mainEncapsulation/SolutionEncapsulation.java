package mainEncapsulation;

import java.util.Scanner;

import models.Encapsulate;

public class SolutionEncapsulation {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Enter name: ");
      String name = input.nextLine();
      System.out.print("Enter age: ");
      int age = input.nextInt();
      Encapsulate obj = new Encapsulate(name, age);
      System.out.println("I am name " + obj.getName());
      System.out.println("I am age " + obj.getAge());
    }
  }
}
