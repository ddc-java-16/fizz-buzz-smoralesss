package edu.cnm.deepdive.fizzbuzz;

import java.util.EnumSet;
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


  public enum FizzBuzz {
    FIZZ, BUZZ;

    public static Set<FizzBuzz> valueOf(int value) {
      Set<FizzBuzz> result = EnumSet.noneOf(FizzBuzz.class);
      if (value % 3 == 0) {
        result.add(FIZZ);
      }
      if (value % 5 == 0) {
        result.add(BUZZ);
      }
      return result;
    }

  }


}
