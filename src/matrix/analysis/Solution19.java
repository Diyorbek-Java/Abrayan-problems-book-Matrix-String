package matrix.analysis;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the sum of elements for each matrix row.
                """);
        System.out.print("Enter the order of the square matrix (M, must be odd): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();


        double[][] matrix = new double[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        scanner.close();


        double[] rowSums = new double[M];
        for (int i = 0; i < M; i++) {
            double sum = 0;
            for (int j = 0; j < N; j++) {
                sum += matrix[i][j];
            }
            rowSums[i] = sum;
        }

        System.out.println("Sum of elements for each row:");
        for (int i = 0; i < M; i++) {
            System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
        }


    }
}
