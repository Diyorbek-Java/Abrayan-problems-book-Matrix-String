package matrix.diagonals;

import java.util.Scanner;

public class Solution82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given. Find the sum of elements of each matrix diagonal
                that is parallel to the main diagonal. Begin with the single-element diagonal A1,M.
                """);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            System.out.printf("Enter matrix element while A(%d)", i);
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        System.out.println("Given matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < M; i++) {
            double sum = 0;
            for (int j = 0; j < M - i; j++) {
                sum += matrix[j][i + j];
            }
            System.out.println("Sum of elements of diagonal A1," + (M - i) + ": " + sum);
        }
    }


}
