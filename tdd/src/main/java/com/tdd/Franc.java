package com.tdd;

import com.tdd.Money;

public class Franc extends Money {
  // constructor
  public Franc(int amount, String currency) {
    super(amount, currency);
  }

  String currency() {
    return currency;
  }

  // public boolean equals(Object object) {
  //   Franc franc = (Franc) object;
  //   return amount == franc.amount;
  // }

  public Money times(int multiplier) {
    return Money.franc(amount * multiplier);
  }
}
