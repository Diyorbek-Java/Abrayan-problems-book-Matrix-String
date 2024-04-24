package matrix.analysis;

import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the product of elements for each matrix column.
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

        double[] columnProducts = new double[N];
        for (int j = 0; j < N; j++) {
            double product = 1;
            for (int i = 0; i < M; i++) {
                product *= matrix[i][j];
            }
            columnProducts[j] = product;
        }

        System.out.println("Product of elements for each column:");
        for (int j = 0; j < N; j++) {
            System.out.println("Column " + (j + 1) + ": " + columnProducts[j]);
        }
    }
}
