package matrix;

import java.util.Scanner;

public class Solution50 {
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

        exchangeMinMaxColumnElements(matrix);

        System.out.println("Matrix after exchanging minimal and maximal elements in each column:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeMinMaxColumnElements(double[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;

        for (int j = 0; j < N; j++) {

            int minIndex = 0;
            int maxIndex = 0;

            for (int i = 1; i < M; i++) {
                if (matrix[i][j] < matrix[minIndex][j]) {
                    minIndex = i;
                }
                if (matrix[i][j] > matrix[maxIndex][j]) {
                    maxIndex = i;
                }
            }

            double temp = matrix[minIndex][j];
            matrix[minIndex][j] = matrix[maxIndex][j];
            matrix[maxIndex][j] = temp;
        }
    }

}
