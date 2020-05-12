package main;

import java.util.Arrays;
import java.util.Scanner;

public class SortSolution {
  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter N");
      int N = Integer.parseInt(in.nextLine());
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(in.nextLine());
      }
      Arrays.sort(arr);
      for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
      }
      
      for (int i = arr.length - 1; i >= 0 ; i--) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
