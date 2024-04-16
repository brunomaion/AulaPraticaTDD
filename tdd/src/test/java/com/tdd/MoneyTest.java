package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.tdd.Money;
import com.tdd.Dollar;
import com.tdd.Franc;

public class MoneyTest {
  @Test
  public void testDifferentClassEquality() {
    assertFalse(new Money(10, "CHF").equals(new Franc(1, "CHF")));
  }
}
