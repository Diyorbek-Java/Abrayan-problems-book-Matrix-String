package matrix;

import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive integers M and N, a real number D, and a sequence of M real numbers are given.
                Create and output an M × N matrix of real numbers such that its first row contains all numbers from the given sequence (in the same order),
                and elements of each next row are equal to the sum of the corresponding element of the previous row and
                the number R (so each column of the matrix will be a geometric sequence with the common ratio R).
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter real number R: ");
        double R = scanner.nextDouble();

        System.out.println("Enter the sequence of " + M + " real numbers:");
        double[] sequence = new double[M];
        for (int i = 0; i < M; i++) {
            sequence[i] = scanner.nextDouble();
        }

        scanner.close();

        double[][] matrix = generateMatrix(M, N, R, sequence);

        System.out.println("Generated Matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }


    }

    private static double[][] generateMatrix(int M, int N, double R, double[] sequence) {
        double[][] matrix = new double[M][N];

        // Fill the first row with the given sequence
        for (int j = 0; j < N; j++) {
            matrix[0][j] = sequence[j];
        }

        // Fill the remaining rows with geometric sequences
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = matrix[i - 1][j] * R;
            }
        }

        return matrix;
    }
}
