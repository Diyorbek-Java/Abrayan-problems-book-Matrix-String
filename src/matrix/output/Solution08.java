package matrix.output;

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers and an integer K are given (1 ≤ K ≤ M).
                Output elements of the matrix row with the order number K.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        double[][] matrix = new double[M][N];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.println("Enter the elements of the matrix: When M = " + i);
            for (int j = 0; j < N; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.print("Enter number K: ");
        int K = scanner.nextInt();
        scanner.close();

        System.out.println("Elements of row " + K + ":");
        for (int j = 0; j < N; j++) {
            System.out.print(matrix[K - 1][j] + " ");
        }
    }
}
