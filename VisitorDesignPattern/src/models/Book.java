package models;

import interfaces.ItemElement;
import interfaces.ShoppingCartVisitor;

public class Book implements ItemElement {
  private int price;
  private String isbnNumber;
  
  public Book(int price, String isbnNumber) {
    // TODO Auto-generated constructor stub
    this.setPrice(price);
    this.setIsbnNumber(isbnNumber);
  }

  @Override
  public int accept(ShoppingCartVisitor v) {
    // TODO Auto-generated method stub
    return v.visitBook(this);
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  public void setIsbnNumber(String isbnNumber) {
    this.isbnNumber = isbnNumber;
  }

}
