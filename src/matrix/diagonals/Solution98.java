package matrix.diagonals;

import java.util.Scanner;

public class Solution98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Rotate its elements by 180°
                (that is, exchange values of matrix elements A1,1 and AM,M, A1,2 and AM,M−1, and so on).
                Do not use an additional matrix.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.printf("Enter the elements of the matrix from A(%d):", i);
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        System.out.println("Given Diagonal Matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < M / 2; i++) {
            for (int j = 0; j < M; j++) {
                // Swap elements across the horizontal axis
                double temp = matrix[i][j];
                matrix[i][j] = matrix[M - i - 1][j];
                matrix[M - i - 1][j] = temp;
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M / 2; j++) {
                // Swap elements across the vertical axis
                double temp = matrix[i][j];
                matrix[i][j] = matrix[i][M - j - 1];
                matrix[i][M - j - 1] = temp;
            }
        }

        System.out.println("Changed matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }


}
