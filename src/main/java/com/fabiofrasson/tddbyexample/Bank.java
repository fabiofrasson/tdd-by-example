package com.fabiofrasson.tddbyexample;

public class Bank {

  Money reduce(Expression source, String toCurrency) {
    return source.reduce(toCurrency);
  }
}
