package edu.cnm.deepdive.fizzbuzz;

public class Main {

  private static final String FIZZ_RESULT = "fizz";
  private static final String BUZZ_RESULT = "buzz";
  private static final String FIZZ_BUZZ_RESULT = FIZZ_RESULT + BUZZ_RESULT;

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(detectFizzBuzz(i));
    }
  }

  static String detectFizzBuzz(int i) {
    int remainder = i % 15;
    return switch (remainder) {
      case 0 -> FIZZ_BUZZ_RESULT;
      case 3, 6, 9, 12 -> FIZZ_RESULT;
      case 5, 10 -> BUZZ_RESULT;
      default -> String.valueOf(i);
    };
  }

}
