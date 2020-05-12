package models;

public class Prime {
  private int n;
  public Prime(int n) {
    // TODO Auto-generated constructor stub
    this.n = n;
  }
  
  public int getN() {
    return n;
  }
  
  public void setN(int n) {
    this.n = n;
  }
  
  public boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    if (n <= 3) {
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0) {
      return false;
    }
    for (int i = 5; i * i <= n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false;
      }
    }
    return true; 
  }
  public void printPrime(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
