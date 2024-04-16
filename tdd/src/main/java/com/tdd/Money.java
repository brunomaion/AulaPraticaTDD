package com.tdd;

import com.tdd.Dollar;
import com.tdd.Franc;

class Money {
  protected int amount;
  protected String currency;

  // constructor
  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  String currency() {
    return currency;
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    System.out.println("amount: " + amount + " money.amount: " + money.amount);
    return amount == money.amount && getClass().equals(money.getClass());
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, currency);
  }

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }
}
