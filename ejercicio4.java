import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Introduce números enteros positivos. Introduce un número negativo para terminar.");

        while (true) {
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        if (min != Integer.MAX_VALUE) {
            System.out.println("El número mínimo introducido es: " + min);
            System.out.println("El número máximo introducido es: " + max);
        } else {
            System.out.println("No se introdujo ningún número positivo.");
        }

        scanner.close();
    }
}