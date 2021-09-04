package com.fabiofrasson.tddbyexample;

public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }
}
