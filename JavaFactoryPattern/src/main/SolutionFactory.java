package main;

import java.util.Scanner;

import interfaces.Food;
import models.FoodFactory;

public class SolutionFactory {
  public static void main(String[] args) {
    DoNotTerminate.forbidExit();
    try (Scanner input = new Scanner(System.in)) {

      FoodFactory foodFactory = new FoodFactory();

      Food food = foodFactory.getFood(input.nextLine());
     
      System.out.println("The factory returned  " + food.getClass());
      System.out.println(food.getType());
    } catch (DoNotTerminate.ExitTrappedException e) {
      // TODO: handle exception
      System.out.println("Unsuccessful Termination!!");
    }
  }
}
