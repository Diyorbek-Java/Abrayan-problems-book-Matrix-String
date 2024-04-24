package matrix.diagonals;

import java.util.Scanner;

public class Solution95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix of order M is given. Assign zero value to the matrix elements that lie below
                the main diagonal (or on it) and below the secondary diagonal (or on it) simultaneously.
                Do not use conditional statements.
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

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (j >= i && j <= M - i - 1) {
                    matrix[i][j] = 0;
                }
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
