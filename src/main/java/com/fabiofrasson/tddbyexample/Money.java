package com.fabiofrasson.tddbyexample;

import java.util.Objects;

public class Money implements Expression {

  protected int amount;
  protected String currency;

  public Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  protected String currency() {
    return currency;
  }

  public Expression times(int multiplier) {
    return new Money(amount * multiplier, this.currency);
  }

  public static Money dollar(int amount) {
    return new Money(amount, "USD");
  }

  public static Money franc(int amount) {
    return new Money(amount, "CHF");
  }

  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount && Objects.equals(this.currency, money.currency);
  }

  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }

  @Override
  public Money reduce(Bank bank, String to) {
    return new Money(amount / bank.rate(this.currency, to), to);
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
