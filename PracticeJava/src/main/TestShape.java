package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.HinhTron;
import models.HinhVuong;

public class TestShape {
  @Test
  public void TestDientich() {
    HinhTron htron = new HinhTron(5);

    assertEquals(htron.DienTich(), 5 * 5 * Math.PI, 0);
    HinhVuong hvuong = new HinhVuong(5, 5);
    assertEquals(hvuong.ChuVi(), 2 * 5 + 2 * 5, 0);
  }
}
