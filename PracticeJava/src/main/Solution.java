package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import models.HinhTron;
import models.HinhVuong;

public class Solution {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Nhap BK");
    int bk = Integer.parseInt(in.nextLine());
    HinhTron ht = new HinhTron(bk);
    ht.display();
    System.out.println();
    System.out.print("Nhap a: ");
    int a = Integer.parseInt(in.nextLine());
    System.out.print("Nhap b: ");
    int b = Integer.parseInt(in.nextLine());
    HinhVuong hv = new HinhVuong(a, b);
    hv.display();

    ArrayList<HinhTron> list = null;

    Collections.sort(list, new Comparator<HinhTron>() {

      @Override
      public int compare(HinhTron o1, HinhTron o2) {
        // TODO Auto-generated method stub
        return 0;
      }
    });

  }
}
