package main;

import java.util.Scanner;

import models.Euclidean;

public class EuclideanSolution {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter a: ");
    int a = Integer.parseInt(in.nextLine());
    System.out.print("Enter b: ");
    int b = Integer.parseInt(in.nextLine());
    Euclidean e = new Euclidean(a, b);
    System.out.println("GCD: " + e.gcd(a, b));
    System.out.println("LCM: " + e.lcm(a, b));
  }
}
