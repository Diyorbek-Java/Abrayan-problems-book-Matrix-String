package matrix;

import java.util.Scanner;

public class Solution49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                 An M × N matrix of real numbers is given. For each matrix row exchange values of its minimal and maximal element.
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

        exchangeMinMaxElements(matrix);

        // Output the modified matrix
        System.out.println("Matrix after exchanging minimal and maximal elements in each row:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeMinMaxElements(double[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;

        for (int i = 0; i < M; i++) {
            int minIndex = 0;
            int maxIndex = 0;
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] < matrix[i][minIndex]) {
                    minIndex = j;
                }
                if (matrix[i][j] > matrix[i][maxIndex]) {
                    maxIndex = j;
                }
            }

            double temp = matrix[i][minIndex];
            matrix[i][minIndex] = matrix[i][maxIndex];
            matrix[i][maxIndex] = temp;
        }
    }
}
