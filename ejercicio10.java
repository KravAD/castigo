import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la dimensión de la matriz:");
        int N = scanner.nextInt();

        generateAndPrintSymmetricMatrix(N);

        scanner.close();
    }

    public static void generateAndPrintSymmetricMatrix(int N) {
        int[][] matrix = new int[N][N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int randomNum = random.nextInt(100);
                matrix[i][j] = randomNum;
                matrix[j][i] = randomNum;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}