package matrix.changing;

import java.util.Scanner;

public class Solution66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Remove its last column that contains negative numbers only.
                If the matrix does not contain the required columns then do not change it.
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

        removeLastNegativeColumn(matrix);

        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void removeLastNegativeColumn(double[][] matrix) {
        for (int j = matrix[0].length - 1; j >= 0; j--) {
            boolean allNegative = true;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] >= 0) {
                    allNegative = false;
                    break;
                }
            }
            if (allNegative) {
                for (int i = 0; i < matrix.length; i++) {
                    double[] newRow = new double[matrix[i].length - 1];
                    System.arraycopy(matrix[i], 0, newRow, 0, j);
                    System.arraycopy(matrix[i], j + 1, newRow, j, matrix[i].length - j - 1);
                    matrix[i] = newRow;
                }
                break;
            }
        }
    }
}
