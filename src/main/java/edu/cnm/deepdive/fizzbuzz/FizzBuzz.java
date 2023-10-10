package edu.cnm.deepdive.fizzbuzz;

import java.util.EnumSet;
import java.util.Set;

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
