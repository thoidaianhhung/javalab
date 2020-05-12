package main;

import java.util.Scanner;

import models.EuclideanArray;

public class EuclideanArraySolution {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Enter n: ");
    int n = Integer.parseInt(in.nextLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(in.nextLine());
    }
    EuclideanArray find = new EuclideanArray(n, arr);
    System.out.println("GCD of arrays: " + find.findGcd(arr, n));
  }
}
