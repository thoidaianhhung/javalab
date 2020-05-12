package main;

import interfaces.ItemElement;
import interfaces.ShoppingCartVisitor;
import models.Book;
import models.Fruit;
import models.Shopping;

public class ShoppingCartClient {
  public static void main(String[] args) {
    ItemElement[] items = new ItemElement[] {new Book(20, "1234"), new Fruit(29, 4, "Apple")};
    int sum = calculatePrice(items);
    System.out.println("Total cost: "+ sum);
  }
  private static int calculatePrice(ItemElement[] items) {
    ShoppingCartVisitor v = new Shopping();
    int sum = 0;
    for (ItemElement itemElement : items) {
      sum += itemElement.accept(v);
    }
    return sum;
  }
}
