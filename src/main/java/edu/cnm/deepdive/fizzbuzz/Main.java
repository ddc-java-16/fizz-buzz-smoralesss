package edu.cnm.deepdive.fizzbuzz;

import java.util.Set;

public class Main {

  private static final String FIZZ_RESULT = "fizz";
  private static final String BUZZ_RESULT = "buzz";
  private static final String FIZZ_BUZZ_RESULT = FIZZ_RESULT + BUZZ_RESULT;

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      Set<FizzBuzz> value = FizzBuzz.valueOf(i);
      System.out.println(value.isEmpty() ? i : value);
    }
  }


}
