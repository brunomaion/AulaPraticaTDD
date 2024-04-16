package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.tdd.Franc;

public class FrancTest {
  @Test
  public void testMultiplication() {
    Franc five = new Franc(5, "CHF");
    assertTrue((new Franc(10, "CHF")).equals(five.times(2)));
    assertTrue((new Franc(15, "CHF")).equals(five.times(3)));
  }

  @Test
  public void testEquality() {
    assertTrue((new Franc(5, "CHF")).equals(new Franc(5, "CHF")));
    assertFalse(new Franc(5, "CHF").equals(new Franc(6, "CHF")));
  }

  @Test
  public void testCurrency() {
    assertEquals("CHF", new Franc(1, "CHF").currency());
  }
}
