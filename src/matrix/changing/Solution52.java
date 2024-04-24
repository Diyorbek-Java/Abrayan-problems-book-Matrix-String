package matrix.changing;

import java.util.Scanner;

public class Solution52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Exchange matrix columns containing the minimal and the maximal element of the matrix.
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
        int minColumnIndex = 0;
        int maxColumnIndex = 0;
        double minElement = matrix[0][0];
        double maxElement = matrix[0][0];

        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minColumnIndex = j;
                }
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxColumnIndex = j;
                }
            }
        }
        exchange(matrix, minColumnIndex, maxColumnIndex);

        System.out.println("Matrix after exchanging rows containing minimal and maximal elements:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchange(double[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
            double temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }


}
