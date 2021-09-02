package com.fabiofrasson.tddbyexample;

public class Franc {

  private int amount;

  public Franc(int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier) {
    return new Franc(amount * multiplier);
  }

  public boolean equals(Object object) {
    Franc franc = (Franc) object;
    return amount == franc.amount;
  }
}
