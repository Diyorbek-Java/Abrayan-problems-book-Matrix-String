package matrix.changing;

import java.util.Scanner;

public class Solution61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ M). Remove the matrix row with the order number K.
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
        double[][] newMatrix = new double[m - 1][n];
        int newRow = 0;
        for (int i = 0; i < m; i++) {
            if (i != k - 1) { // Exclude the row to remove
                System.arraycopy(matrix[i], 0, newMatrix[newRow], 0, n);
                newRow++;
            }
        }
        return newMatrix;


    }


}
