package matrix.diagonals;

import java.util.Scanner;

public class Solution99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Rotate its elements counter-clockwise by 90° (that is,
                assign an initial value of A1,1 to AM,1, an initial value of AM,1 to AM,M, and so on).
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
            for (int j = i; j < M - i - 1; j++) {
                double temp = matrix[i][j];
                matrix[i][j] = matrix[j][M - i - 1];
                matrix[j][M - i - 1] = matrix[M - i - 1][M - j - 1];
                matrix[M - i - 1][M - j - 1] = matrix[M - j - 1][i];
                matrix[M - j - 1][i] = temp;
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
