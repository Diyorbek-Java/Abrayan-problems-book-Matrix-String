package matrix.changing;

import java.util.Scanner;

public class Solution64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Remove the matrix column that contains the maximal matrix element.
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

        removeColumnWithMaxElement(matrix);

        System.out.println("Matrix after exchanging:");
        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void removeColumnWithMaxElement(double[][] matrix) {
        int maxColIndex = 0;
        double maxElement = matrix[0][0];

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxColIndex = j;
                }
            }
        }

        if (matrix[0].length == 1) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i] = null;
            }
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = maxColIndex; j < matrix[0].length - 1; j++) {
                    matrix[i][j] = matrix[i][j + 1];
                }
            }
        }
    }

}
