package models;

import java.util.Scanner;

public class BubbleSort {
  public void sort() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N ");
    int N = Integer.parseInt(input.nextLine());
    int[] arr = new int[N];
    
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(input.nextLine());
    }
    input.close();
    int temp = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if(arr[i] > arr[i + 1] ) {
        
        arr[i] = arr[i + 1]; // b = c
        arr[i] = temp; // c = a
        temp = arr[i + 1];
      }
    }
    System.out.println("Hello");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
