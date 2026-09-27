import java.util.ArrayList;
import java.util.List;

public class OddNonPrimeNumbers {

    public static void main(String[] args) {
        int start = 1;
        int end = 50;

        List<Integer> oddNonPrimeNumbers = findOddNonPrimeNumbers(start, end);
        System.out.println("Odd but not prime numbers between " + start + " and " + end + ":");
        for (Integer number : oddNonPrimeNumbers) {
            System.out.println(number);
        }
    }

    private static List<Integer> findOddNonPrimeNumbers(int start, int end) {
        List<Integer> oddNonPrimeNumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (isOdd(i) && !isPrime(i)) {
                oddNonPrimeNumbers.add(i);
            }
        }

        return oddNonPrimeNumbers;
    }

    private static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}