package SumAll;

public class SumAll {
    public static void main(String[] args) {
        byte[] numbers = {3, 4, 5, 6, 7};
        int sum = 0;
        for (byte i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
