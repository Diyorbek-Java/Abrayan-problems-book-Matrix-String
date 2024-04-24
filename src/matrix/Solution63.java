package matrix;

import java.util.Scanner;

public class Solution63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ N). Remove the matrix column with the order number K.
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

        removeRowWithMinElement(matrix);

        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void removeRowWithMinElement(double[][] matrix) {
        int minRowIndex = 0;
        double minElement = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minRowIndex = i;
                }
            }
        }

        if (matrix.length == 1)
            matrix[0] = null;
        else
            for (int i = minRowIndex; i < matrix.length - 1; i++)
                matrix[i] = matrix[i + 1];


    }

}
