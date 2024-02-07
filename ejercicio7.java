import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int number = scanner.nextInt();

        ArrayList<Integer> factors = primeFactors(number);

        System.out.println("Los factores primos de " + number + " son:");
        for (int factor : factors) {
            System.out.println(factor);
        }

        scanner.close();
    }

    public static ArrayList<Integer> primeFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }
}