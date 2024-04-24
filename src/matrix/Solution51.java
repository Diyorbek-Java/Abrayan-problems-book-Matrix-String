package matrix;

import java.util.Scanner;

public class Solution51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Exchange matrix rows containing the minimal and the maximal element of the matrix
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
        int minRowIndex = 0;
        int maxRowIndex = 0;
        double minElement = matrix[0][0];
        double maxElement = matrix[0][0];
        for (int i = 1; i < M; i++) {
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minRowIndex = i;
                }
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRowIndex = i;
                }
            }
        }
        exchange(matrix, minRowIndex, maxRowIndex);

        System.out.println("Matrix after exchanging rows containing minimal and maximal elements:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchange(double[][] matrix, int row1, int row2) {
        double[] temp = new double[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }


}
