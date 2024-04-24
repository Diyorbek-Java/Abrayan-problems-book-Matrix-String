package matrix;

import java.util.Scanner;

public class Solution48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and two integers K1, K2 are given (1 ≤ K1 < K2 ≤ N).
                Exchange matrix columns with the order numbers K1 and K2.
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
        System.out.print("Enter the order numbers K1 :");
        int K1 = scanner.nextInt();
        System.out.print("Enter the order numbers K2 :");
        int K2 = scanner.nextInt();

        scanner.close();

        exchangeColumns(matrix, K1 - 1, K2 - 1);

        System.out.println("Matrix after exchanging columns " + K1 + " and " + K2 + ":");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeColumns(double[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
            double temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }
}
