package matrix.analysis;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the sum of elements for each matrix column with even order number (2, 4, …).
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

        double[] columnSums = new double[(N + 1) / 2];
        for (int j = 0, col = 1; col <= N; col += 2, j++) {
            double sum = 0;
            for (int i = 0; i < M; i++) {
                sum += matrix[i][col - 1];
            }
            columnSums[j] = sum;
        }

        System.out.println("Sum of elements for each column with even order number:");
        for (int j = 0; j < (N + 1) / 2; j++) {
            System.out.println("Column " + (2 * j + 2) + ": " + columnSums[j]);
        }
    }
}
