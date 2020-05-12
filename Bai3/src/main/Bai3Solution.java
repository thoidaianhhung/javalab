package main;

import java.util.Scanner;

import models.Season;

public class Bai3Solution {
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args) {
    
    Season season = new Season();
    System.out.print("Enter moth: ");
    int month = in.nextInt();
    System.out.print("Enter date: ");
    int date = in.nextInt();
    System.out.println(season.season(month, date));
  }
}
