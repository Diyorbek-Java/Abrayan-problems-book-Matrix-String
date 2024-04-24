package matrix.analysis;

import java.util.Scanner;

public class Solution25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given. Find the order number of the matrix row with the maximal sum of elements.
                Output this order number and the maximal sum value.
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

        double maxSum = Double.NEGATIVE_INFINITY;
        int maxSumRow = -1;
        for (int i = 0; i < M; i++) {
            double sum = 0;
            for (int j = 0; j < N; j++) {
                sum += matrix[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumRow = i;
            }
        }

        System.out.println("Order number of the row with maximal sum: " + (maxSumRow + 1));
        System.out.println("Maximal sum value: " + maxSum);

    }
}
