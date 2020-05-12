package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import models.SinhVien;

public class Main {

  public static void main(String[] args) {

    ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();

    try (Scanner input = new Scanner(System.in)) {
      while (true) {
        System.out.println("Nhap ten: ");
        SinhVien sv = new SinhVien();
        String name = input.nextLine();

        sv.setName(name);
        System.out.println("Nhap diem");
        double diem = Double.parseDouble(input.nextLine());
        sv.setDiem(diem);

        listSV.add(sv);

        System.out.println("Ban co muon tiep tuc?");

        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("N")) {
          break;
        }

      }

      for (int i = 0; i < listSV.size(); i++) {
        SinhVien sv = listSV.get(i);
        System.out.println(sv.getName() + " " + sv.getDiem());
      }

      for (SinhVien sinhVien : listSV) {
        System.out.println(sinhVien.getName() + " " + sinhVien.getDiem());
      }

      Collections.sort(listSV, new Comparator<SinhVien>() {

        @Override
        public int compare(SinhVien o1, SinhVien o2) {
          // TODO Auto-generated method stub
          return (int) (o2.getDiem() - o1.getDiem());
        }
      });

      for (SinhVien sinhVien : listSV) {
        System.out.println(sinhVien.getName() + " " + sinhVien.getDiem());
      }

      System.out.println("Nhap so phan tu");
      int n = Integer.parseInt(input.nextLine());
      int[] mang = new int[n];
      for (int i = 0; i < mang.length; i++) {
        System.out.println("mang[" + (i + 1) + "]=");
        mang[i] = Integer.parseInt(input.nextLine());
      }
      int sum = 0;
      for (int i = 0; i < mang.length; i++) {
        sum += mang[i];
      }
      System.out.println(sum / mang.length);

      // hung =>
      String name = input.nextLine();
      name = name.substring(0, 1).toUpperCase() + name.substring(1);
      System.out.println(name);
    }
  }
}
