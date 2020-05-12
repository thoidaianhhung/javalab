package models;

import interfaces.Food;

public class FoodFactory {
  public Food getFood(String order) {
    switch (order) {
    case "pizza":
      return new Pizza();
    case "cake":
      return new Cake();
    default:
      return null;
    }
  }
}
