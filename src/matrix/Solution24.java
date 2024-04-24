package matrix;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the maximal element for each matrix column.
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

        double[] columnMax = new double[N];
        for (int j = 0; j < N; j++) {
            double max = matrix[0][j];
            for (int i = 0; i < M; i++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
            columnMax[j] = max;
        }
        System.out.println("Maximal element for each matrix column:");
        for (int j = 0; j < N; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnMax[j]);
        }
    }
}
