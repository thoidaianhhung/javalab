package models;

import java.util.Scanner;

import abtracts.HienThi;
import interfaces.TinhToan;

public class HinhTron extends HienThi implements TinhToan  {

  public static final double PI = Math.PI;
  private int bk;
  public HinhTron(int bk) {
    // TODO Auto-generated constructor stub
    this.bk = bk;
  }
  @Override
  public double DienTich() {
    // TODO Auto-generated method stub
    return PI * Math.pow(bk, 2);
  }

  public double DienTich(int inputbk) {
    return PI * Math.pow(inputbk, 2);
  }
  @Override
  public double ChuVi() {
    // TODO Auto-generated method stub
    return 2 * PI * bk;
  }

  public int getBk() {
    return bk;
  }

  public void setBk(int bk) {
    this.bk = bk;
  }
  @Override
  public void display() {
    // TODO Auto-generated method stub
    System.out.println("Chu Vi: " + ChuVi());
    System.out.println("Dien Tich: " + DienTich());
    System.out.println("Nhap ban kinh:");
    Scanner in = new Scanner(System.in);
    int inputbk = Integer.parseInt(in.nextLine());
    System.out.println("Dien Tich: " + DienTich(inputbk));
  }
  
  
}
