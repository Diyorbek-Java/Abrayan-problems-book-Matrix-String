package matrix;

import java.util.Scanner;

public class Solution67 {
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
        scanner.close();

        removeColumnsWithPositiveOnly(matrix);

        System.out.println("Matrix after exchanging: ");
        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void removeColumnsWithPositiveOnly(double[][] matrix) {
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            boolean allPositive = true;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] <= 0) {
                    allPositive = false;
                    break;
                }
            }
            if (allPositive) {
                for (int i = 0; i < matrix.length; i++) {
                    double[] newRow = new double[matrix[i].length - 1];
                    System.arraycopy(matrix[i], 0, newRow, 0, j);
                    System.arraycopy(matrix[i], j + 1, newRow, j, matrix[i].length - j - 1);
                    matrix[i] = newRow;
                }
            }
        }
    }
}
