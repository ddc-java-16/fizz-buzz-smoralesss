package edu.cnm.deepdive.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class MainTest {

  @ParameterizedTest
  @CsvFileSource(resources = "fizz-buzz-cases.csv", useHeadersInDisplayName = true)
  void detectFizzBuzz(int input, String expected) {
    assertEquals(expected, Main.detectFizzBuzz(input));
  }

}