package interfaces;

import java.awt.print.Book;
import models.BusinessBook;
import models.ProgramingBook;

public interface Customer {
  void buy(Book book);
  void buy(ProgramingBook Book);
  void buy(BusinessBook Book);
}
