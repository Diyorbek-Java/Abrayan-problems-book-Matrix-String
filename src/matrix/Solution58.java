package matrix;

import java.util.Scanner;

public class Solution58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given (M and N are even numbers).
                Exchange the upper right and lower left quarter of the matrix.
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

        exchangeQuarters(matrix);

        System.out.println("Matrix after exchanging:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeQuarters(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m / 2; i++) {
            for (int j = n / 2; j < n; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[i + m / 2][j - n / 2];
                matrix[i + m / 2][j - n / 2] = temp;
            }
        }
    }


}
