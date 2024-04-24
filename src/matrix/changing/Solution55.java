package matrix.changing;

import java.util.Scanner;

public class Solution55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given (M is an even number). Exchange the upper and lower half of the matrix.
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

        exchangeUpperLowerHalf(matrix);

        System.out.println("Matrix after exchanging upper and lower half:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void exchangeUpperLowerHalf(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int halfM = m / 2;

        for (int i = 0; i < halfM; i++) {
            for (int j = 0; j < n; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[halfM + i][j];
                matrix[halfM + i][j] = temp;
            }
        }
    }

}
