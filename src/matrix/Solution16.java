package matrix;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                A real-valued square matrix A of order M is given (M is an odd number). Starting with the element A(1,1) and
                moving counter-clockwise, output all matrix elements in the spiral order: the first column from up to down,
                the last row from left to right, the last column from down to up, the first row from right to left, all
                remaining elements of the second column (from up to down), and so on; the central element of the matrix
                must be output in the end.
                """);
        System.out.print("Enter the order of the square matrix (M, must be odd): ");
        int M = scanner.nextInt();

        if (M % 2 == 0) {
            System.out.println("Error: M must be an odd number.");
            return;
        }

        double[][] matrix = new double[M][M];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        scanner.close();

        System.out.println("Matrix elements in the spiral order:");
        counterClockwiseSpiralOrder(matrix);
    }

    public static void counterClockwiseSpiralOrder(double[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][left] + " ");
            }
            left++;

            for (int j = left; j <= right; j++) {
                System.out.print(matrix[bottom][j] + " ");
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            for (int j = right; j >= left; j--) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;
        }
    }
}
