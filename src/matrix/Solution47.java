package matrix;

import java.util.Scanner;

public class Solution47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and two integers K(1), K(2) are given (1 ≤ K(1) < K(2) ≤ M).
                Exchange matrix rows with the order numbers K(1) and K(2).
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

        exchangeRows(matrix, K1 - 1, K2 - 1);

        System.out.println("Matrix after exchanging rows " + K1 + " and " + K2 + ":");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeRows(double[][] matrix, int row1, int row2) {
        double[] temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }
}
