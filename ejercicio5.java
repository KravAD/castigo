public class Main {
    public static void main(String[] args) {
        int[][] tables = generateMultiplicationTables(10);

        for (int i = 0; i < tables.length; i++) {
            System.out.println("Tabla de multiplicar del número " + i + ":");
            for (int j = 0; j < tables[i].length; j++) {
                System.out.println(i + " x " + j + " = " + tables[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] generateMultiplicationTables(int n) {
        int[][] tables = new int[n][10];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                tables[i][j] = i * j;
            }
        }
        return tables;
    }
}