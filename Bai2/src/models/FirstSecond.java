package models;

import java.util.Scanner;

public class FirstSecond {
  public void sort() {
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter N");
      int N = Integer.parseInt(in.nextLine());
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
        arr[i] = Integer.parseInt(in.nextLine());
      }
      int temp;
      for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
          if (arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
      }
      System.out.println();
      for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
      }
    }
  }
}
