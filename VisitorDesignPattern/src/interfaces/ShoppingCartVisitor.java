package interfaces;

import models.Book;
import models.Fruit;

public interface ShoppingCartVisitor {
  public int visitBook(Book book);
  public int visitFruit(Fruit fruit);
}
