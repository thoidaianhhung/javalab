package main;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Find {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner in = new Scanner(System.in);
    try {
      int n = Integer.parseInt(in.nextLine());
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(in.nextLine());
      }
      System.out.println("Max: " + findMax(arr));
    } 
    catch(InputMismatchException ex) {
      
    }
    catch (Exception e) {
      // TODO: handle exception
    }

  }
  
  public static void testhrow() throws IOException {
      findMax(null);
  }

  public static int findMax(int[] arr) throws IOException {
    int max = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }
    return max;
  }
}
