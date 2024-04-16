package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.tdd.Dollar;

public class DollarTest {
  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5, "USD");
    assertTrue(new Dollar(10, "USD").equals(five.times(2)));
    assertTrue(new Dollar(15, "USD").equals(five.times(3)));
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5, "USD").equals(new Dollar(5, "USD")));
  }

  @Test
  public void testCurrency() {
    assertEquals("USD", new Dollar(1, "USD").currency());
  }
}
