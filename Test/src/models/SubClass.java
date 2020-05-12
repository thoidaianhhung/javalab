package models;

public class SubClass {
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
  public void print() {
    System.out.println("Tôi là Hùng");
  }
  public int multiply(int a, int b) {
    return a * b;
  }
  
  public double multiply(double a, double b) {
    return a * b;
  }
}
