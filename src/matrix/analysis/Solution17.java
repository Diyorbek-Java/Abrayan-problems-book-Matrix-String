package matrix.analysis;

import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ M).
                Find the sum and the product of elements of the matrix row with the order number K.
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

        System.out.print("Enter the order number of the row (K): ");
        int K = scanner.nextInt();
        scanner.close();

        double sum = 0;
        double product = 1;
        for (int j = 0; j < N; j++) {
            sum += matrix[K - 1][j];
            product *= matrix[K - 1][j];
        }

        // Output the sum and product
        System.out.println("Sum of elements of row " + K + ": " + sum);
        System.out.println("Product of elements of row " + K + ": " + product);

    }
}
