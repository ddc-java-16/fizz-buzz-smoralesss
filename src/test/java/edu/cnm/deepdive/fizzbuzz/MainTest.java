package edu.cnm.deepdive.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import edu.cnm.deepdive.fizzbuzz.Main.FizzBuzz;
import java.util.EnumSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

class MainTest {

//  @ParameterizedTest
//  @CsvFileSource(resources = "fizz-buzz-cases.csv", useHeadersInDisplayName = true)
//  void detectFizzBuzz(int input, String expected) {
//    assertEquals(expected, Main.detectFizzBuzz(input));
//  }

  static class FizzBuzzTest {
    @DisplayName("Testing expected FIZZ:")
    @ParameterizedTest(name = "[{index}] Assert that FizzBuzz.valueOf({0}) returns [FizzBuzz.FIZZ].")
    @ValueSource(ints = {3, 36, 9, 12})
    void valueOf_fizz(int value) {
      assertEquals(EnumSet.of(FizzBuzz.FIZZ), Main.FizzBuzz.valueOf(value));
    }
  }

  @DisplayName("Testing expected BUZZ:")
    @ParameterizedTest(name = "[{index}] Assert that FizzBuzz.valueOf({0}) returns [FizzBuzz.BUZZ].")
    @ValueSource(ints = {5, 10, 50, 1_555_555_555})
    void valueOf_buzz(int value) {
      assertEquals(EnumSet.of(FizzBuzz.BUZZ), Main.FizzBuzz.valueOf(value));

  }

  @DisplayName("Testing expected FIZZBUZZ:")
  @ParameterizedTest(name = "[{index}] Assert that FizzBuzz.valueOf({0}) returns [FizzBuzz.FUZZ, FizzBuzz.BUZZ].")
  @ValueSource(ints = {15, 30, 75})
  void valueOf_fizzbuzz(int value) {
    assertEquals(EnumSet.allOf(FizzBuzz.class), Main.FizzBuzz.valueOf(value));
  }

  @DisplayName("Testing expected neither:")
  @ParameterizedTest(name = "[{index}] Assert that FizzBuzz.valueOf({0}) returns []].")
  @ValueSource(ints = {1, 17, 34})
  void valueOf_none(int value) {
    assertEquals(EnumSet.noneOf(FizzBuzz.class), Main.FizzBuzz.valueOf(value));
  }
}