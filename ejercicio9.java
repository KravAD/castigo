import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de elementos en los vectores:");
        int N = scanner.nextInt();

        System.out.println("Introduce los elementos del primer vector:");
        int[] vector1 = getVectorFromUser(N, scanner);

        System.out.println("Introduce los elementos del segundo vector:");
        int[] vector2 = getVectorFromUser(N, scanner);

        int dotProduct = calculateDotProduct(vector1, vector2);

        System.out.println("El producto escalar de los dos vectores es: " + dotProduct);

        scanner.close();
    }

    public static int[] getVectorFromUser(int N, Scanner scanner) {
        int[] vector = new int[N];
        for (int i = 0; i < N; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static int calculateDotProduct(int[] vector1, int[] vector2) {
        int dotProduct = 0;
        for (int i = 0; i < vector1.length; i++) {
            dotProduct += vector1[i] * vector2[i];
        }
        return dotProduct;
    }
}