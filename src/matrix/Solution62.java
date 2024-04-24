package matrix;

import java.util.Scanner;

public class Solution62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ N). Remove the matrix column with the order number K.
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
        System.out.print("Enter integer K: ");
        int K = scanner.nextInt();
        scanner.close();

        double[][] newMatrix = copyAndCreateMatrix(matrix, K);


        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] copyAndCreateMatrix(double[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        double[][] newMatrix = new double[m][n - 1];
        for (int i = 0; i < m; i++) {
            int newCol = 0;
            for (int j = 0; j < n; j++) {
                if (j != k - 1) {
                    newMatrix[i][newCol] = matrix[i][j];
                    newCol++;
                }
            }
        }
        return newMatrix;


    }


}
