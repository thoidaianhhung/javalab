package models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BookList {
  List<Book> myBooks = new ArrayList<>();
  static Scanner input = new Scanner(System.in);
  
  // Add() enter new information about the book.
  public void add() {
    System.out.println("Enter information for the new book:");
    
    System.out.print("ID: ");
    String id = input.nextLine();

    System.out.print("Title: ");
    String title = input.nextLine();

    System.out.print("Author: ");
    String author = input.nextLine();

    System.out.print("Is borrowed (1 = yes, 0 = no): ");
    int choice = 0;
    while (input.hasNext()) {
      if (input.hasNextInt()) {
        choice = input.nextInt();
        break;
      }
      else {
        System.out.print("Is borrowed (1 = yes, 0 = no): ");
        input.next();
      }
    }
    Boolean isBorrowed = false;
    switch (choice) {
      case 1:
        isBorrowed = true;
        break;
      case 0:
        isBorrowed = false;
        break;
    }
    addToList(id.toUpperCase(), title, author, isBorrowed);
    System.out.println("A new book has been added.");
  }

  // add to list.
  public void addToList(String id, String title, String author, Boolean isBorrowed) {
    Book book = new Book(id.toUpperCase(), title, author, isBorrowed);
    myBooks.add(book);
  }

  // Search() searches for books.
  public void search() {
    Set<Book> booksFound = new HashSet<>();
    System.out.println("Enter book title to search.");
    
    System.out.print("Book title: ");
    String searchKey = input.nextLine();
    searchKey = searchKey.toLowerCase();
    for (Book book : myBooks) {
      if (book.getTitle().toLowerCase().contains(searchKey)) {
        booksFound.add(book);
      }
    }
    if (booksFound.isEmpty()) {
      System.out.println("The book you are looking for is not currently available in the library.");
      System.out.println("You can return to search later.");
    } else {
      System.out.println(String.format("%-15s%-25s%-25s%-25s", "ID", "Title", "Author", "Is borrowed"));
      for (Book book: booksFound) {
        System.out.println(book.toString());
      }
    }
  }

  // Display() displays the list.
  public void display() {
    System.out.println(String.format("%-15s%-25s%-25s%-25s", "ID", "Title", "Author", "Is borrowed"));
    for (Book book: myBooks) {
      System.out.println(book.toString());
    }
  }

  // Borrow() lends books.
  public void borrow() {
    System.out.println("Enter book ID to borrow:");
    
    System.out.print("Book ID: ");
    String searchKey = input.nextLine();
    for (Book aBook: myBooks) {
      if (aBook.getId().equalsIgnoreCase(searchKey)) {
        if (aBook.getIsBorrowed()) {
          System.out.println("The library has this book but is currently available for others to borrow.");
          System.out.println("You can borrow it later.");
          return;
        }
        aBook.setIsBorrowed(true);
        System.out.println("You have successfully borrow the book:" + aBook.getTitle());
        return;
      }
      else {
        System.out.println("The library does not currently have this book.");
        return;
      }
    }
    if (myBooks.isEmpty()) {
      System.out.println("The library does not currently have this book.");
    }
  }

  // Exit() ends the program.
  public void exit() {
    System.out.println("Good bye.");
    System.exit(0);
  }
}
