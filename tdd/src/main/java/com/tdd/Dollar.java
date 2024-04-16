package com.tdd;

import com.tdd.Money;

class Dollar extends Money {
  protected int amount;

  // constructor
  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  String currency() {
    return this.currency;
  }

  public boolean equals(Object object) {
    Dollar dollar = (Dollar) object;
    return amount == dollar.amount;
  }

  public Money times(int multiplier) {
    return Money.dollar(this.amount * multiplier);
  }
}
