package models;

public class Euclidean {
  private int a;
  private int b;
  public int getA() {
    return a;
  }
  public void setA(int a) {
    this.a = a;
  }
  public int getB() {
    return b;
  }
  public void setB(int b) {
    this.b = b;
  }
  public Euclidean(int a, int b) {
    // TODO Auto-generated constructor stub
    this.a = a;
    this.b = b;
  }
  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
  public int lcm(int a, int b) {
    return a * b / gcd(a, b);
  }
}
