package matrix.changing;

import java.util.Scanner;

public class Solution73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
               An M × N matrix of real numbers is given. Insert a new column of elements with zero value after the last matrix
               column that contains negative numbers only. If the matrix does not contain the required columns then do not change it.
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

        double[][] updatedMatrix = insertColumn(matrix);


        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < updatedMatrix[0].length; j++) {
                System.out.print(updatedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] insertColumn(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int insertionColumn = -1;
        for (int j = n - 1; j >= 0; j--) {
            boolean allNegative = true;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] >= 0) {
                    allNegative = false;
                    break;
                }
            }
            if (allNegative) {
                insertionColumn = j;
                break;
            }
        }

        if (insertionColumn != -1) {
            double[][] newMatrix = new double[m][n + 1];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n + 1; j++) {
                    if (j <= insertionColumn) {
                        newMatrix[i][j] = matrix[i][j];
                    } else if (j == insertionColumn + 1) {
                        newMatrix[i][j] = 0;
                    } else {
                        newMatrix[i][j] = matrix[i][j - 1];
                    }
                }
            }
            return newMatrix;
        } else {
            return matrix;
        }
    }

}
