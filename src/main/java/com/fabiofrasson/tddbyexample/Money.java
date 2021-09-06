package com.fabiofrasson.tddbyexample;

import java.util.Objects;

public class Money implements Expression {

  protected final int amount;
  protected final String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  protected String currency() {
    return currency;
  }

  @Override
  public Expression times(int multiplier) {
    return new Money(amount * multiplier, this.currency);
  }

  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && Objects.equals(this.currency, money.currency);
  }

  @Override
  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  @Override
  public Money reduce(Bank bank, String to) {
    return new Money(amount / bank.rate(this.currency, to), to);
  }

  @Override
  public String toString() {
    return "Money{" + "amount=" + amount + ", currency='" + currency + '\'' + '}';
  }
}
