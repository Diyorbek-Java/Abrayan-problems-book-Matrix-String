package matrix;

import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Given two positive integers M and N, create and output an M × N matrix of integers such that all
                its elements of the I-th row are equal to 10·I (I = 1, …, M).
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        scanner.close();

        int[][] matrix = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = 10 * (i + 1);
            }
        }

        System.out.println("Generated Matrix is");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        
    }
}
