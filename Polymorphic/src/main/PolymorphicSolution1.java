package main;

import models.Parent;

public class PolymorphicSolution1 {
  public static void main(String[] args) {
    Parent a;
    a = new Parent();
    a.print();
    a = new Parent();
    a.print();
  }
}
