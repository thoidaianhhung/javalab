package models;

public class Book {
//The basic information fields required by a book are: id, title, author, isBorrowed.
 private String id;
 private String title;
 private String author;
 private Boolean isBorrowed = false;
 // Constructor Declaration of Class
 public Book(String id, String title, String author, Boolean isBorrowed) {
   this.id = id;
   this.title = title;
   this.author = author;
   this.isBorrowed = isBorrowed;
 }
 // The method displays the current value of your ID field into an external code.
 public String getId() {
   return  id;
 }

 // The method allows external code to change the value of the ID field.
 public void setId(String id) {
   this.id = id;
 }

 // The method displays the current value of your Title field into an external code.
 public String getTitle() {
   return  title;
 }

 // The method allows external code to change the value of the Title field.
 public void setTitle(String title) {
   this.title = title;
 }

 // The method displays the current value of your Author field into an external code.
 public String getAuthor() {
   return  author;
 }

 // The method allows external code to change the value of the Author field.
 public void setAuthor(String author) {
   this.author = author;
 }

 // The method displays the current value of your IsBorrowed field into an external code.
 public Boolean getIsBorrowed() {
   return  isBorrowed;
 }

 // The method allows external code to change the value of the IsBorrowed field.
 public void setIsBorrowed(Boolean isBorrowed) {
   this.isBorrowed= isBorrowed;
 }

 // The toString() method to specify how the information fields will be displayed.
 @Override
 public String toString() {
   return String.format("%-15s%-25s%-25s%-25b", id, title, author, isBorrowed);
 }
}
