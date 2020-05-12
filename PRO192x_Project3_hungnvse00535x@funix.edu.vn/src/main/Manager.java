package main;

import java.util.Scanner;

import models.BookList;

public class Manager {
  static Scanner input = new Scanner(System.in);
  
//The main() function will contain the code to display the menu for the user to choose.
 public static void main(String[] args) {
   
   System.out.println("Welcome to the online book library.");
   System.out.println("This application will help you manage books in the library.");
   BookList bookList = new BookList();
   while (true) {
     System.out.println("---------------------");
     System.out.println("1. Enter new a book");
     System.out.println("2. Search a book by book title");
     System.out.println("3. Display books");
     System.out.println("4. Borrow a book by book id");
     System.out.println("5. Exit");
     System.out.print("Your choice: ");
     int choice = 0;
     // Check input choice variable.
     while (input.hasNext()) {
       if (input.hasNextInt()) {
         choice = input.nextInt();
         if (choice >= 1 && choice <= 5) {
           break;
         }
         else {
           System.out.println("Enter false.");
         }
         System.out.print("Your choice: ");
       }
       else {
         System.out.print("Your choice: ");
         input.next();
       }
     }
     switch (choice) {
       case 1:
         ((BookList) bookList).add();
         break;
       case 2:
         bookList.search();
         break;
       case 3:
         bookList.display();
         break;
       case 4:
         bookList.borrow();
         break;
       case 5:
         bookList.exit();
         break;
     }
   }
 }
}
