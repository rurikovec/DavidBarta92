package labdaNstream;

import java.util.Arrays;
import java.util.List;

public class exercise1 {
  static List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

  public static void main(String[] args) {

    numbers.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);
  }
}
