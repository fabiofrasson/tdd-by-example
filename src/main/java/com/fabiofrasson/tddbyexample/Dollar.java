package com.fabiofrasson.tddbyexample;

public class Dollar {

  int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  void times(int multiplier) {
    amount *= multiplier;
  }
}
