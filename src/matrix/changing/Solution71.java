package matrix.changing;

import java.util.Scanner;

public class Solution71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Double the occurrence of the matrix column that contains the minimal matrix element.
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

        int minColumn = findMinElementColumn(matrix);

        for (int i = 0; i < M; i++) {
            matrix[i][minColumn] *= 2;
        }

        System.out.println("Matrix after exchanging :");
        for (double[] doubles : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(doubles[j] + " ");
            }
            System.out.println();
        }

    }

    public static int findMinElementColumn(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        double minElement = matrix[0][0];
        int minColumn = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                    minColumn = j;
                }
            }
        }
        return minColumn;
    }

}
