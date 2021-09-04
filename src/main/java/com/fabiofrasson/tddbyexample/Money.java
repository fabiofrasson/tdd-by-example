package com.fabiofrasson.tddbyexample;

public class Money {

  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  protected String currency() {
    return currency;
  }

  public Money times(int multiplier) {
    return new Money(amount * multiplier, this.currency);
  }

  public static Money dollar(int amount) {
    return new Dollar(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Franc(amount, "CHF");
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && this.currency == money.currency;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Money{");
    sb.append("amount=").append(amount);
    sb.append(", currency='").append(currency).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
