package edu.cnm.deepdive.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int remainder = i % 15;
      String value;
      switch (remainder) {
        case 0:
         value = "fizzbuzz";
          break;
        case 3, 6, 9, 12:
          value = "fizz";
          break;
        case 5, 10:
          value = "buzz";
          break;
        default:
          value = String.valueOf(i);
      }
      System.out.println(value);

    }
  }

}
