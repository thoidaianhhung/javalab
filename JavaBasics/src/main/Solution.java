package main;

import java.util.Scanner;

import models.Result;

public class Solution {
  public static void main(String[] args) {
    
    /* Welcome hello = new Welcome(); hello.hello(); */
     
    /*
     * StdinAndStdout scanner = new StdinAndStdout(); scanner.scanner();
     */
    /*
     * IfElse name = new IfElse(); name.ifElse();
     */
    /*
     * OutputFormatting output = new OutputFormatting(); output.output();
     */
    /*
     * Loops loops = new Loops(); loops.loops();
     */
    /*
     * DataTypes data = new DataTypes(); data.dataTypes();
     */
    /*
     * IntToString name = new IntToString(); name.forbidExit();
     */
    
    /* BubbleSort sort = new BubbleSort(); sort.sort(); */
     
    
    /*
     * System.out.println("Hello"); int x = 20; int y = 25;
     * 
     * if (++x < (y = y - 4) || (x = 4) > y) { System.out.println(x + y); }
     * System.out.println("exit");
     */
    try (Scanner input = new Scanner(System.in)) {
      System.out.println("Enter month");
      int month = Integer.parseInt(input.nextLine());
      System.out.println("Enter date");
      int date = Integer.parseInt(input.nextLine());
      System.out.println("Enter year");
      int year = Integer.parseInt(input.nextLine());
      Result res = new Result();
      String re = res.findDay(month, date, year);
      System.out.println(re);
    }
     
  }
  /*
   * static int B, H; static boolean flag = true; static {
   * 
   * @SuppressWarnings("resource") Scanner input = new Scanner(System.in); B =
   * Integer.parseInt(input.nextLine()); H = Integer.parseInt(input.nextLine());
   * if (B > 0 && H > 0) { flag = true; } else {
   * System.out.println("java.lang.Exception: Breadth and height must be positive"
   * ); flag = false; } }
   */
  
}
