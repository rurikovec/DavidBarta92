package labdaNstream;

import java.util.Arrays;
import java.util.List;

public class exercise4 {
  static List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

  public static void main(String[] args) {
    numbers.stream()
        .filter(n -> n % 2 != 0)
        .mapToInt(n -> n)
        .average()
        .ifPresent(System.out::println);
  }
}
