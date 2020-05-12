package models;

import interfaces.Food;

public class Pizza implements Food {

  @Override
  public String getType() {
    // TODO Auto-generated method stub
    return "Someone ordered a Fast Food!";
  }

}
