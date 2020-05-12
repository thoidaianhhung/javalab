package main;

import java.util.Scanner;

import models.Regex;

public class Solution {
  public static void main(String[] args) {
    /*
     * ProgramingBook book = new ProgramingBook(); Customer code = new Developer();
     * code.buy(book);
     * 
     * ProgramingBook programingBook = new ProgramingBook();
     * code.buy(programingBook);
     */
    try (Scanner in = new Scanner(System.in)) {
      while (in.hasNext()) {
        String string = (String) in.next();
        System.out.println(string.matches(new Regex().pattern));
      }
    }
  }
}
