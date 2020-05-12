package main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Prime;

public class TestShape {
  @Test
  public void testPrime() {
    Prime prime = new Prime(2);
    assertEquals(prime.isPrime(4), false );
  }
}
