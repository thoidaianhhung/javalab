package main;

import java.util.Scanner;

import models.Prime;

public class PrimeSolution {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter n: ");
    int n = Integer.parseInt(in.nextLine());
    Prime prime = new Prime(n);
    prime.printPrime(n);
  }


}
