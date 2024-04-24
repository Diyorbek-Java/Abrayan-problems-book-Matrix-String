package matrix.changing;

import java.util.Scanner;

public class Solution68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ M).
                Insert a new row of elements with zero value before the matrix row with the order number K.
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
        System.out.print("Enter number K: ");
        int K = scanner.nextInt();
        scanner.close();

        double[][] newMatrix = insertRowBefore(matrix, K, M, N);

        System.out.println("Matrix after exchanging: ");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] insertRowBefore(double[][] matrix, int k, int m, int n) {
        double[][] newMatrix = new double[m + 1][n];
        for (int i = 0; i < k - 1; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, n);
        }

        for (int j = 0; j < n; j++) {
            newMatrix[k - 1][j] = 0.0;
        }

        for (int i = k - 1; i < m; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i + 1], 0, n);
        }
        return newMatrix;
    }
}
