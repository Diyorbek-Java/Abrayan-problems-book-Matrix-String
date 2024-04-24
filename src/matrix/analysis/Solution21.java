package matrix.analysis;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the average of elements for each matrix row with odd order number (1, 3, …).
                Do not use conditional statements.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        double[][] matrix = new double[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();

        double[] rowAverages = new double[(M + 1) / 2];
        for (int i = 0, row = 0; row < M; row += 2, i++) {
            double sum = 0;
            for (int j = 0; j < N; j++) {
                sum += matrix[row][j];
            }
            rowAverages[i] = sum / N;
        }

        System.out.println("Average of elements for each row with odd order number:");
        for (int i = 0; i < (M + 1) / 2; i++) {
            System.out.println("Row " + (2 * i + 1) + ": " + rowAverages[i]);
        }
    }
}
