package matrix;

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive integers M and N, a real number D, and a sequence of M real numbers are given.
                Create and output an M × N matrix of real numbers such that its first column contains all numbers from the given sequence (in the same order),
                and elements of each next column are equal to the sum of the corresponding element of the previous column
                and the number D (so each row of the matrix will be an arithmetic sequence with the common difference D).
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter real number D: ");
        double D = scanner.nextDouble();

        System.out.println("Enter the sequence of " + M + " real numbers:");
        double[] sequence = new double[M];
        for (int i = 0; i < M; i++) {
            sequence[i] = scanner.nextDouble();
        }

        scanner.close();

        double[][] matrix = generateMatrix(M, N, D, sequence);

        System.out.println("Generated Matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }


    }

    private static double[][] generateMatrix(int M, int N, double D, double[] sequence) {
        double[][] matrix = new double[M][N];

        for (int i = 0; i < M; i++) {
            matrix[i][0] = sequence[i];
        }

        // Fill the remaining columns with arithmetic sequences
        for (int j = 1; j < N; j++) {
            for (int i = 0; i < M; i++) {
                matrix[i][j] = matrix[i][j - 1] + D;
            }
        }

        return matrix;
    }
}
