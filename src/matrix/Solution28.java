package matrix;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the minimal value among the maximal elements of matrix columns.
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

        double minOfMaxColumnElements = Double.POSITIVE_INFINITY;
        for (int j = 0; j < N; j++) {
            double maxColumn = matrix[0][j];
            for (int i = 0; i < M; i++) {
                if (matrix[i][j] > maxColumn) {
                    maxColumn = matrix[i][j];
                }
            }
            if (maxColumn < minOfMaxColumnElements) {
                minOfMaxColumnElements = maxColumn;
            }
        }

        System.out.println("Minimal value among the maximal elements of matrix columns: " + minOfMaxColumnElements);
    }
}
