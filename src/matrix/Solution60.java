package matrix;

import java.util.Scanner;

public class Solution60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Reflect its elements about the horizontal axis of symmetry of the matrix
                (that is, exchange matrix rows with the order numbers 1 and M, 2 and M − 1, and so on).
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

        verticalAxis(matrix);

        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void verticalAxis(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int j = 0; j < n / 2; j++) {
            for (int i = 0; i < m; i++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

    }


}
