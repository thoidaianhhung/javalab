package main;

import models.MultiplyFun;

public class PolymorphicSolution {
  public static void main(String[] args) {
    MultiplyFun mul = new MultiplyFun();
    int result1 = mul.multiply(4, 5);
    System.out.println(result1);
    double result2 = mul.multiply(4.0, 5.0);
    System.out.println(result2);
  }
}
