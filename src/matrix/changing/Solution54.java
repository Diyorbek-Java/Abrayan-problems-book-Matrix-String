package matrix.changing;

import java.util.Scanner;

public class Solution54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Exchange the column with the order number 1 and the last
                column that contains positive numbers only. If the matrix does not contain the required columns then
                do not change it.
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

        int firstPositiveColumnIndex = findFirstPositiveColumn(matrix);

        if (firstPositiveColumnIndex != -1) {
            exchangeColumns(matrix,0,firstPositiveColumnIndex);
        }

        System.out.println("Matrix after exchanging columns:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int findFirstPositiveColumn(double[][] matrix) {
        int lastPositiveColumn = -1;
        int m = matrix.length;
        int n = matrix[0].length;
        for (int j = n - 1; j >= 0; j++) {
            boolean allPositive = true;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] <= 0) {
                    allPositive = false;
                    break;
                }
            }
            if (allPositive) {
                lastPositiveColumn = j;
                break;
            }
        }
        return lastPositiveColumn;
    }
    public static void exchangeColumns(double[][] matrix, int col1, int col2) {
        for (int i = 0; i < matrix.length; i++) {
            double temp = matrix[i][col1];
            matrix[i][col1] = matrix[i][col2];
            matrix[i][col2] = temp;
        }
    }

}
