package matrix;

import java.util.Scanner;

public class Solution56 {
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
        exchangeLeftRight(matrix);

        System.out.println("Matrix after exchanging :");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void exchangeLeftRight(double[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int halfN = N / 2;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < halfN; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[i][halfN + j];
                matrix[i][halfN + j] = temp;
            }
        }
    }

}
