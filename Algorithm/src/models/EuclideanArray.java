package models;

public class EuclideanArray {
  private int n;
  private int[] arr;
  public EuclideanArray(int n, int[] arr) {
    // TODO Auto-generated constructor stub
    this.n = n;
    this.arr = arr;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }
  
  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    
    return gcd(b, a % b);
  }

  public int findGcd(int[] arr, int n) {
    int result = arr[0];
    for (int i = 1; i < n - 1; i++) {
      result = gcd(arr[i], result);
      if (result == 1) {
        return 1;
      }
    }
    return result;
  }

  public int[] getArr() {
    return arr;
  }

  public void setArr(int[] arr) {
    this.arr = arr;
  }

}
