package matrix.changing;

import java.util.Scanner;

public class Solution65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Remove its first column that contains positive numbers only.
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

        removeFirstPositiveColumn(matrix);

        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void removeFirstPositiveColumn(double[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            boolean allPositive = true;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] <= 0) {
                    allPositive = false;
                    break;
                }
            }
            if (allPositive) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int k = j; k < matrix[0].length - 1; k++) {
                        matrix[i][k] = matrix[i][k + 1];
                    }
                }
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i] = java.util.Arrays.copyOf(matrix[i], matrix[i].length - 1);
                }
                break;
            }
        }
    }

}
