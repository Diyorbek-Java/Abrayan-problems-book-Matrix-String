package matrix.changing;

import java.util.Scanner;

public class Solution69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ N).
                 Insert a new column of elements with the value 1 after the matrix column with the order number K.
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

        double[][] newMatrix = insertColumnAfter(matrix, K, M, N);

        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] insertColumnAfter(double[][] matrix, int k, int rows, int cols) {
        double[][] newMatrix = new double[rows][cols + 1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < k; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
            newMatrix[i][k] = 1.0;
            for (int j = k + 1; j <= cols; j++) {
                newMatrix[i][j] = matrix[i][j - 1];
            }
        }
        return newMatrix;
    }

}
