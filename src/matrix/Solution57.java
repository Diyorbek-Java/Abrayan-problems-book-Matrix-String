package matrix;

import java.util.Scanner;

public class Solution57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                An M × N matrix of real numbers is given (N is an even number). Exchange the left and right half of the matrix.
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

        exchangeQuarters(matrix);

        System.out.println("Matrix after exchanging : ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeQuarters(double[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int halfM = m / 2;
        int halfN = n / 2;
        for (int i = 0; i < halfM; i++) {
            for (int j = 0; j < halfN; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[i + halfM][j + halfN];
                matrix[i + halfM][j + halfN] = temp;
            }
        }
    }


}
