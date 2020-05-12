package models;

import abtracts.HienThi;
import interfaces.TinhToan;

public class HinhVuong extends HienThi implements TinhToan {
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
  public HinhVuong(int a, int b) {
    // TODO Auto-generated constructor stub
    this.a = a;
    this.b = b;
  }
  @Override
  public double DienTich() {
    // TODO Auto-generated method stub
    return a  *  b;
  }
  @Override
  public double ChuVi() {
    // TODO Auto-generated method stub
    return 2 * a + 2 * b;
  }
  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("Dien tich hinh vuong: " + DienTich()); 
    System.out.println("Chu vi hinh vuong: " + ChuVi());
  }
  
}
