package matrix.changing;

import java.util.Scanner;

public class Solution75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. A matrix element is called the local minimum if it is smaller
                than all its neighbors. Replace all local minimums of the matrix by zero values. An additional matrix may
                be used for performing the required replacement.
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

        double[][] updatedMatrix = replaceLocalMaximums(matrix);


        System.out.println("Updated matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(updatedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static double[][] replaceLocalMaximums(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;


        double[][] updatedMatrix = new double[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (isLocalMaximum(matrix, i, j)) {
                    updatedMatrix[i][j] = -matrix[i][j];
                } else {
                    updatedMatrix[i][j] = matrix[i][j];
                }
            }
        }

        return updatedMatrix;
    }

    public static boolean isLocalMaximum(double[][] matrix, int row, int col) {
        double currentElement = matrix[row][col];
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = Math.max(0, row - 1); i <= Math.min(m - 1, row + 1); i++) {
            for (int j = Math.max(0, col - 1); j <= Math.min(n - 1, col + 1); j++) {
                if (i == row && j == col) {
                    continue;
                }

                if (currentElement <= matrix[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

}
