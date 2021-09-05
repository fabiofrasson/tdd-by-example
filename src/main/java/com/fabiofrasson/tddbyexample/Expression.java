package com.fabiofrasson.tddbyexample;

public interface Expression {
  Money reduce(Bank bank, String to);
}
