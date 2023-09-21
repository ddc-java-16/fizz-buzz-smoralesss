package edu.cnm.deepdive.fizzbuzz;

public class Main {

  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int remainder = i % 15;
      switch (remainder) {
        case 0:
          System.out.println("fizzbuzz");
          break;
        case 3, 6, 9, 12:
          System.out.println("fizz");
          break;
        case 5, 10:
          System.out.println("buzz");
          break;
        default:
          System.out.println(i);
      }


    }
  }

}
