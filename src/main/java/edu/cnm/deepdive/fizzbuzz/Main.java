package edu.cnm.deepdive.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(detectFizzBuzz(i));
    }
  }

  private static String detectFizzBuzz(int i) {
    int remainder = i % 15;
    return switch (remainder) {
      case 0 -> "fizzbuzz";
      case 3, 6, 9, 12 -> "fizz";
      case 5, 10 -> "buzz";
      default -> String.valueOf(i);
    };
  }

}
