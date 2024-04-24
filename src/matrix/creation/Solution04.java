package matrix.creation;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Two positive integers M, N and a sequence of M real numbers are given. Create and output an M × N matrix of real
                numbers such that each of its rows contains all numbers from the given sequence (in the same order).
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        System.out.println("Enter the sequence of " + M + " real numbers:");
        double[] sequence = new double[M];
        for (int i = 0; i < M; i++) {
            sequence[i] = scanner.nextDouble();
        }

        scanner.close();

        double[][] matrix = new double[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[j][i] = sequence[i];
            }
        }

        System.out.println("Generated Matrix is");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
