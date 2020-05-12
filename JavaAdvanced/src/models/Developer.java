package models;

import java.awt.print.Book;

import interfaces.Customer;

public class Developer implements Customer {

  @Override
  public void buy(Book book) {
    // TODO Auto-generated method stub
    System.out.println("Developer buy a Book");
  }

  @Override
  public void buy(ProgramingBook Book) {
    // TODO Auto-generated method stub
    System.out.println("Developer buy a Programing Book");
  }

  @Override
  public void buy(BusinessBook Book) {
    // TODO Auto-generated method stub
    System.out.println("Developer buy a Business Book");
  }

}
