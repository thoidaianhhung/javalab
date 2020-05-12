package models;

import interfaces.ItemElement;
import interfaces.ShoppingCartVisitor;

public class Fruit implements ItemElement {
  private int pricePerKg;
  private int weight;
  private String name;
  
  public Fruit(int pricePerKg, int weight, String name) {
    // TODO Auto-generated constructor stub
    this.setPricePerKg(pricePerKg);
    this.setWeight(weight);
    this.setName(name);
  }

  @Override
  public int accept(ShoppingCartVisitor v) {
    // TODO Auto-generated method stub
    return v.visitFruit(this);
  }

  public int getPricePerKg() {
    return pricePerKg;
  }

  public void setPricePerKg(int pricePerKg) {
    this.pricePerKg = pricePerKg;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
