import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int N = 10;
        ArrayList<Integer> primes = generatePrimeNumbers(N);

        System.out.println("Los primeros " + N + " números primos son:");
        for (int prime : primes) {
            System.out.println(prime);
        }
    }

    public static ArrayList<Integer> generatePrimeNumbers(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        int number = 2;

        while (primes.size() < n) {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}