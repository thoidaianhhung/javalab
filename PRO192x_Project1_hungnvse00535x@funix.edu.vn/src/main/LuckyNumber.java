package main;

import java.util.Random;
import java.util.Scanner;

public class LuckyNumber {
  // a constant is MAXIMUM.
  public static final int MAXIMUM = 10;
  static Scanner input = new Scanner(System.in);

  // the main() function controls the main thread of the lucky number program.
  public static void main(String[] args) {
    int game = 0;
    String result;
    int countGuess = play();
    game++;
    int min = countGuess;
    System.out.print("Do you want to play again? ");

    // convert upper case to lower case.
    result = input.next();
    result = result.toLowerCase();
    System.out.println();
    // conditions continue to play.
    while (result.equals("yes") || result.equals("y")) {
      game++;
      int countGuessNew = play();
      if (min > countGuessNew) {
        min = countGuessNew;
      }
      countGuess += countGuessNew;
      System.out.print("Do you want to play again? ");
      result = input.next().toLowerCase();
      System.out.println();
    }
    report(countGuess, game, min);
  }

//play() function to execute the game.
  public static int play() {
    int count = 0;
    System.out.println("I am thinking of a number between 0 and " + MAXIMUM);
    Random lucky = new Random();
    int luckyNumber = lucky.nextInt(MAXIMUM + 1);
    // variable initialization is number.
    System.out.print("Which number will you enter? ");
    int number = 0;
    // check input.
    while (input.hasNext()) {
      // check integers.
      if (input.hasNextInt()) {
        count++;
        number = input.nextInt();
        if (number > luckyNumber) {
          System.out.println("The lucky number is smaller than your predicted number.");
        } else if (number < luckyNumber) {
          System.out.println("The lucky number is bigger than your predicted number.");
        } else {
          System.out.println("Congratulations, you have guessed the lucky number after " + count + " predictions.");
          break;
        }
        // notice re-entered.
        System.out.print("Which number will you enter? ");
      } else {
        System.out.println("Please input an integer.");
        System.out.print("Which number will you enter? ");
        input.next();
      }
    }
    return count;
  }

  // report() function to display the report.
  public static void report(int countGuess, int game, int min) {
    System.out.println("Overall results:");
    System.out.print("Total games   = " + game);
    System.out.println();
    System.out.print("Total guesses = " + countGuess);
    System.out.println();
    double avg = countGuess / game;
    System.out.print("Guesses/game  = " + avg);
    System.out.println();
    System.out.println("Best game     = " + min);
  }
}
