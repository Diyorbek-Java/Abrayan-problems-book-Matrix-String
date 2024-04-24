package matrix.analysis;

import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the minimal element for each matrix row
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

        double[] rowMin = new double[M];
        for (int i = 0; i < M; i++) {
            double min = matrix[i][0];
            for (int j = 1; j < N; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
        }

        System.out.println("Minimal element for each matrix row:");
        for (int i = 0; i < M; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowMin[i]);
        }
    }
}
