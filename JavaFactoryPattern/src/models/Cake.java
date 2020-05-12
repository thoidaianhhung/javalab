package models;

import interfaces.Food;

public class Cake implements Food {

  @Override
  public String getType() {
    // TODO Auto-generated method stub
    return "Someone ordered a Dessert!";
  }

}
