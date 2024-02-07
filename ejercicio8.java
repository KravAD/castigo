import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = getNumbersFromUser();
        double average = calculateAverage(numbers);
        int min = findMin(numbers);
        int max = findMax(numbers);

        System.out.println("La media de los números introducidos es: " + average);
        System.out.println("El número mínimo introducido es: " + min);
        System.out.println("El número máximo introducido es: " + max);
    }

    public static ArrayList<Integer> getNumbersFromUser() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Introduce números enteros. Introduce 0 para terminar.");

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        scanner.close();
        return numbers;
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static int findMin(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int findMax(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}