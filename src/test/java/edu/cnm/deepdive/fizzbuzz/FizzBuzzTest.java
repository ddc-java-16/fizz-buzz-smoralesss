package edu.cnm.deepdive.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.EnumSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

  @DisplayName("Testing expected FIZZ:")
  @ParameterizedTest(name = "[{index}] Assert that FizzBuzz.valueOf({0}) returns [FizzBuzz.FIZZ].")
  @ValueSource(ints = {3, 36, 9, 12})
  void valueOf_fizz(int value) {
    assertEquals(EnumSet.of(FizzBuzz.FIZZ), FizzBuzz.valueOf(value));
  }
}
