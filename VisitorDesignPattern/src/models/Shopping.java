package models;

import interfaces.ShoppingCartVisitor;

public class Shopping implements ShoppingCartVisitor{

  @Override
  public int visitBook(Book book) {
    // TODO Auto-generated method stub
    int cost = 0;
    if (book.getPrice() > 50) {
      cost = book.getPrice() - 5;
    }
    else {
      cost = book.getPrice();
    }
    System.out.println("Book ISBN " + book.getIsbnNumber() + " cost = " + cost);
    return cost;
  }

  @Override
  public int visitFruit(Fruit fruit) {
    // TODO Auto-generated method stub
    int cost = fruit.getPricePerKg() * fruit.getWeight();
    System.out.println(fruit.getName() + " cost = " + cost);
    return cost;
  }

}
